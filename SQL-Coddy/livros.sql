-- Coddy | SQLite Fundamentos | Revisão: Livros (nível fácil)
-- Objetivo: calcular métricas cumulativas de palavras por página em cada livro
--           e ranquear as páginas por uma proporção entre essas métricas.
-- Técnicas: CTE, SUM/MAX/MIN/AVG como funções de janela, DENSE_RANK

-- Passo 1: métricas acumuladas do início do livro até a página atual.
-- Com ORDER BY dentro do OVER, a janela vai da primeira página até a atual.
WITH books_calculated AS (
  SELECT
    book,
    page,
    SUM(words) OVER(PARTITION BY book ORDER BY page) AS total_words,
    MAX(words) OVER(PARTITION BY book ORDER BY page) AS max_words,
    MIN(words) OVER(PARTITION BY book ORDER BY page) AS min_words,
    AVG(words) OVER(PARTITION BY book ORDER BY page) AS avg_words
  FROM books
)

-- Passo 2: ranking denso, por livro, da proporção
-- (avg_words - min_words) / (total_words - min_words), em ordem crescente.
-- Atenção: na primeira página de cada livro, total_words = min_words, então o
-- denominador é 0. O SQLite devolve NULL nesse caso (não dá erro), e o NULL
-- vem primeiro na ordem crescente, ficando com ratio_rank = 1.
SELECT *,
  DENSE_RANK() OVER(PARTITION BY book ORDER BY (avg_words - min_words)/(total_words - min_words)) AS ratio_rank
FROM books_calculated
ORDER BY book, ratio_rank
