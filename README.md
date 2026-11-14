# Exercícios

Repositório com os exercícios de programação que resolvo durante meus estudos. Por enquanto, reúne exercícios de **Java** (Collections, do bootcamp da DIO) e de **SQL** (desafios do Coddy).

## Exercícios

### Java | DIO

| Exercício | Coleção | O que pratica | Java |
|---|---|---|:---:|
| [crime](Java-DIO/collections/list/crime) | `List` | Interrogatório de cinco perguntas, com `ArrayList`, `Scanner` e `switch` | 14+ |
| [temperatura-semestral](Java-DIO/collections/list/temperatura-semestral) | `List` | Média semestral de temperaturas e meses acima da média | 9+ |
| [lancamento-dados](Java-DIO/collections/map/lancamento-dados) | `Map` | Contagem de lançamentos de um dado com `TreeMap`, `Map.of` e `compute` | 9+ |
| [populacao-nordeste](Java-DIO/collections/map/populacao-nordeste) | `Map` | `LinkedHashMap`, `TreeMap`, `Iterator` e operações de um dicionário | 8+ |
| [arco-iris](Java-DIO/collections/set/arco-iris) | `Set` | `LinkedHashSet`, `TreeSet`, `removeIf` e streams | 9+ |
| [linguagem-favorita](Java-DIO/collections/set/linguagem-favorita) | `Set` | `record`, `Comparable` e `Comparator` para ordenar objetos | 16+ |

### SQL | Coddy

| Pasta | O que tem |
|---|---|
| [SQL-Coddy](SQL-Coddy) | Soluções dos desafios de revisão de SQLite Fundamentos (CTEs e funções de janela) |

## Organização

Os exercícios de Java ficam em `Java-DIO`, organizados por tipo de coleção. Cada exercício é um projeto independente, com o código em `src/`, um `README.md` explicando o enunciado e um `.gitignore`. Os de SQL ficam em `SQL-Coddy`, com um arquivo `.sql` por desafio.

```
.
├── README.md
├── Java-DIO/
│   └── collections/
│       ├── list/
│       │   ├── crime/
│       │   └── temperatura-semestral/
│       ├── map/
│       │   ├── lancamento-dados/
│       │   └── populacao-nordeste/
│       └── set/
│           ├── arco-iris/
│           └── linguagem-favorita/
└── SQL-Coddy/
    ├── README.md
    ├── criaturas.sql
    ├── livros.sql
    └── sucata.sql
```

## Como executar

### Java

1. Clone o repositório:

   ```bash
   git clone https://github.com/decastrooliveiraarthur/exercicios.git
   ```

2. Entre na pasta do exercício que quiser, por exemplo:

   ```bash
   cd exercicios/Java-DIO/collections/map/populacao-nordeste
   ```

3. Compile e execute:

   ```bash
   javac -encoding UTF-8 -d out src/*.java
   java -cp out Main
   ```

Também dá para abrir a pasta do exercício no IntelliJ IDEA e executar a classe `Main`. Veja no README de cada exercício a versão mínima do Java.

### SQL

Os arquivos `.sql` são consultas para as tabelas do Coddy, que não estão no repositório. Veja o [README da pasta](SQL-Coddy) para mais detalhes.

## Observações

Este é um repositório de estudo, então o código reflete meu nível na época de cada exercício.
