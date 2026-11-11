# Exercícios

Repositório com os exercícios de programação que resolvo durante meus estudos. Por enquanto, reúne os exercícios de Java sobre **Collections** do bootcamp da DIO.

## Exercícios

| Exercício | Coleção | O que pratica | Java |
|---|---|---|:---:|
| [crime](DIO-java/collections/list/crime) | `List` | Interrogatório de cinco perguntas, com `ArrayList`, `Scanner` e `switch` | 14+ |
| [temperatura-semestral](DIO-java/collections/list/temperatura-semestral) | `List` | Média semestral de temperaturas e meses acima da média | 9+ |
| [populacao-nordeste](DIO-java/collections/map/populacao-nordeste) | `Map` | `LinkedHashMap`, `TreeMap`, `Iterator` e operações de um dicionário | 8+ |
| [arco-iris](DIO-java/collections/set/arco-iris) | `Set` | `LinkedHashSet`, `TreeSet`, `removeIf` e streams | 9+ |
| [linguagem-favorita](DIO-java/collections/set/linguagem-favorita) | `Set` | `record`, `Comparable` e `Comparator` para ordenar objetos | 16+ |

## Organização

Cada exercício é um projeto independente, com o código em `src/`, um `README.md` explicando o enunciado e um `.gitignore`.

```
.
├── README.md
└── DIO-java/
    └── collections/
        ├── list/
        │   ├── crime/
        │   └── temperatura-semestral/
        ├── map/
        │   └── populacao-nordeste/
        └── set/
            ├── arco-iris/
            └── linguagem-favorita/
```

## Como executar

1. Clone o repositório:

   ```bash
   git clone https://github.com/decastrooliveiraarthur/exercicios.git
   ```

2. Entre na pasta do exercício que quiser, por exemplo:

   ```bash
   cd exercicios/DIO-java/collections/map/populacao-nordeste
   ```

3. Compile e execute:

   ```bash
   javac -encoding UTF-8 -d out src/*.java
   java -cp out Main
   ```

Também dá para abrir a pasta do exercício no IntelliJ IDEA e executar a classe `Main`. Veja no README de cada exercício a versão mínima do Java.

## Observações

Este é um repositório de estudo, então o código reflete meu nível na época de cada exercício.
