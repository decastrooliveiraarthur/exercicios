# Linguagens Favoritas — Ordenação com `Set`

Exercício de Java sobre a interface `Set` e suas implementações (`LinkedHashSet` e `TreeSet`), usando `Comparable` e `Comparator` para ordenar uma coleção de objetos de formas diferentes.

## Enunciado

Crie uma classe `LinguagemFavorita` com os atributos `nome`, `anoDeCriacao` e `ide`. Em seguida, crie um conjunto com 3 linguagens e exiba-as nas seguintes ordens:

1. Ordem de inserção
2. Ordem natural (nome)
3. Ordem de IDE
4. Ordem de ano de criação e nome
5. Ordem de nome, ano de criação e IDE

## Estrutura

```
src/
├── LinguagemFavorita.java   # record com os atributos e a ordem natural (Comparable)
└── Main.java                # cria o conjunto e exibe as 5 ordenações
```

## Como cada ordenação foi feita

| Ordenação | Estratégia |
|---|---|
| Inserção | `LinkedHashSet` como conjunto original, que preserva a ordem em que os elementos entram |
| Natural | `LinguagemFavorita` implementa `Comparable` comparando por `nome`; o `TreeSet` usa esse critério sem precisar de comparator |
| IDE | `Comparator.comparing(LinguagemFavorita::ide)` em um `TreeSet` |
| Ano de criação e nome | `Comparator.comparing(anoDeCriacao).thenComparing(nome)` |
| Nome, ano e IDE | `Comparator.comparing(nome).thenComparing(anoDeCriacao).thenComparing(ide)` |

## Conceitos praticados

- `record` (gera `equals`, `hashCode` e `toString` automaticamente)
- `Set`, `LinkedHashSet` e `TreeSet`
- Diferença entre ordem natural (`Comparable`) e ordem personalizada (`Comparator`)
- Encadeamento de critérios com `thenComparing`
- Referências a métodos (`LinguagemFavorita::nome`)

## Como executar

Requer JDK 16 ou superior (por causa do `record`).

```bash
javac -encoding UTF-8 -d out src/*.java
java -cp out Main
```

## Saída esperada

```
Linguagens em Ordem de Inserção:
Nome: Java | Ano de Criação: 1991 | Ide: IntelliJ IDEA
Nome: Python | Ano de Criação: 1989 | Ide: PyCharm
Nome: C++ | Ano de Criação: 1983 | Ide: Visual Studio

Linguagens em Ordem Natural:
Nome: C++ | Ano de Criação: 1983 | Ide: Visual Studio
Nome: Java | Ano de Criação: 1991 | Ide: IntelliJ IDEA
Nome: Python | Ano de Criação: 1989 | Ide: PyCharm

Linguagens em Ordem de IDE:
Nome: Java | Ano de Criação: 1991 | Ide: IntelliJ IDEA
Nome: Python | Ano de Criação: 1989 | Ide: PyCharm
Nome: C++ | Ano de Criação: 1983 | Ide: Visual Studio

Linguagens em Ordem de Ano de Criação e Nome:
Nome: C++ | Ano de Criação: 1983 | Ide: Visual Studio
Nome: Python | Ano de Criação: 1989 | Ide: PyCharm
Nome: Java | Ano de Criação: 1991 | Ide: IntelliJ IDEA

Linguagens em Nome, Ano de Criação e IDE:
Nome: C++ | Ano de Criação: 1983 | Ide: Visual Studio
Nome: Java | Ano de Criação: 1991 | Ide: IntelliJ IDEA
Nome: Python | Ano de Criação: 1989 | Ide: PyCharm
```

## Observação

O `compareTo` compara apenas o `nome`. Em um `TreeSet`, duas linguagens com o mesmo nome seriam tratadas como duplicadas e uma delas seria descartada. Para este exercício isso não é um problema, pois os nomes são distintos.
