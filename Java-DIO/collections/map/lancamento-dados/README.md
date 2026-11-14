# Lançamento de Dados

Exercício em Java sobre `Map`. O programa lança um dado de 6 lados 100 vezes e mostra quantas vezes ele caiu em cada lado.

## O que o programa faz

1. Cria um `TreeMap` com os lados do dado (1 a 6) como chaves, todos começando com contagem `0`.
2. Repete 100 vezes: sorteia um lado de 1 a 6 e soma 1 à contagem desse lado com `compute`.
3. Exibe o total de lançamentos e o mapa com a contagem de cada lado.

## Conceitos praticados

- `Map<Integer, Integer>` como contador (lado do dado → quantidade de vezes)
- `TreeMap`, que mantém as chaves em ordem crescente (1 a 6)
- `Map.of(...)` para criar o mapa inicial, copiado para um `TreeMap`
- `Map.compute` com expressão lambda para atualizar um valor
- `Random.nextInt(bound)` para sortear números
- Constantes com `private static final` (`QUANTIDADE_LANCAMENTOS` e `QUANTIDADE_LADOS`)

## Como executar

Requisito: Java 9 ou superior (por causa do `Map.of`).

A partir da pasta do exercício:

```bash
javac -encoding UTF-8 -d out src/Main.java
java -cp out Main
```

## Exemplo de execução

O sorteio é diferente a cada execução, mas a soma das contagens é sempre 100.

```
O dado foi lançado 100 vezes!
Veja quantas vezes ele caiu em cada lado:
{1=19, 2=24, 3=12, 4=7, 5=17, 6=21}
```

## Observações

- Todos os lados começam com `0` de propósito. Se um lado ainda não estivesse no mapa, `compute` receberia `null` e `quantidade + 1` lançaria `NullPointerException`. Assim, um lado que nunca saiu também aparece no resultado, com `0`.
- `Random` sem semente gera resultados diferentes a cada execução.

## Estrutura

```
lancamento-dados/
├── .gitignore
├── README.md
└── src/
    └── Main.java
```

## Autor

Arthur de Castro Oliveira
