-- Coddy | SQLite Fundamentos | Revisão: Criaturas (nível médio)
-- Objetivo: formar casais de criaturas que compartilham o mesmo valor de
--           has_legs, numerando os casais por ordem de preferência.
-- Técnicas: CTE, subconsulta escalar, NTILE com PARTITION BY

-- Quantidade de casais possíveis = metade do total de criaturas.
-- (No SQLite, COUNT / 2 com inteiros faz divisão inteira.)
WITH num_couples AS (
  SELECT COUNT(creature_name) / 2
  FROM creatures
)

SELECT
  creature_name,
  -- Dentro de cada grupo (com pernas / sem pernas), ordena por preferência
  -- e divide em "num_couples" faixas. O número da faixa é o couple_matcher.
  NTILE((SELECT * FROM num_couples)) OVER(PARTITION BY has_legs ORDER BY preference) AS couple_matcher
FROM creatures
ORDER BY couple_matcher, creature_name
