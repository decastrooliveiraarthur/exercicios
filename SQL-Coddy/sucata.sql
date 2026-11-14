-- Coddy | SQLite Fundamentos | Revisão: Sucata (tabela "junk", nível médio)
-- Objetivo: criar colunas derivadas a partir de junk_id: número par por linha,
--           grupos, média móvel dentro do grupo e ranking dentro do grupo.
-- Técnicas: CTEs encadeadas, ROW_NUMBER, NTILE, AVG com janela móvel
--           (ROWS BETWEEN), DENSE_RANK

WITH junk_table1 AS (
  SELECT
    junk_id,
    -- 1, 2, 3... multiplicado por 2 resulta em 2, 4, 6...
    2 * ROW_NUMBER() OVER(ORDER BY junk_id) AS even_num,
    -- NTILE(3) divide as linhas em 3 grupos (1, 2, 3); vezes 3 resulta em 3, 6, 9
    3 * NTILE(3) OVER(ORDER BY junk_id) AS num_piece
  FROM junk
), junk_table2 AS (
  SELECT *,
    -- Média do junk_id da linha atual e das 2 anteriores, só dentro do mesmo
    -- grupo. O ORDER BY define o que é "anterior"; sem ele, a ordem das linhas
    -- dentro da janela não é garantida.
    AVG(junk_id) OVER(PARTITION BY num_piece ORDER BY junk_id ROWS BETWEEN 2 PRECEDING AND CURRENT ROW) AS avg_id
  FROM junk_table1
)

-- Ranking denso de cada grupo pela média calculada.
SELECT *,
  DENSE_RANK() OVER(PARTITION BY num_piece ORDER BY avg_id) AS piece_rank
FROM junk_table2
