# 🌈 Arco-íris — Exercício de `Set` em Java

Exercício de prática da interface `Set` (coleções do Java), usando as 7 cores do arco-íris.

## O que o programa faz

O programa cria um conjunto com as cores do arco-íris (`vermelho`, `laranja`, `amarelo`, `verde`, `azul`, `anil`, `violeta`) e executa as seguintes operações:

1. Exibe todas as cores, uma abaixo da outra, na ordem em que foram informadas
2. Exibe a quantidade de cores
3. Exibe as cores em ordem alfabética
4. Exibe as cores na ordem inversa da que foi informada
5. Exibe as cores que começam com a letra **v**
6. Remove as cores que **não** começam com **v**
7. Limpa o conjunto
8. Confere se o conjunto está vazio

## Conceitos praticados

| Conceito | Onde aparece |
|---|---|
| `LinkedHashSet` | Armazenar as cores sem duplicatas, preservando a ordem de inserção |
| `List.of(...)` | Fornecer as cores iniciais mantendo a ordem (diferente de `Set.of`, que não garante ordem) |
| `TreeSet` | Ordenação alfabética automática |
| `ArrayList` + `Collections.reverse` | Inverter a ordem informada |
| Streams (`filter`, `forEach`) | Filtrar cores que começam com "v" |
| `removeIf` | Remoção condicional |
| `clear()` / `isEmpty()` | Esvaziar e verificar o conjunto |

### Por que `LinkedHashSet`?

- `HashSet`: não garante nenhuma ordem de iteração.
- `LinkedHashSet`: mantém a ordem de inserção — necessário para "inverter a ordem informada".
- `TreeSet`: mantém os elementos ordenados (alfabética, no caso de `String`).

## Estrutura do projeto

```
arco-iris/
├── src/
│   └── Main.java
├── arco-iris.iml
└── README.md
```

## Como executar

Requisito: JDK 9 ou superior (usa `List.of`).

```bash
javac -d out src/Main.java
java -cp out Main
```

Ou abra o projeto no IntelliJ IDEA e execute a classe `Main`.

## Saída esperada

```
Cores do arco-íris:
vermelho
laranja
amarelo
verde
azul
anil
violeta

Quantidade de cores que tem no arco-íris:
O arco-íris tem 7 cores

Cores do arco-íris em ordem alfabética:
amarelo
anil
azul
laranja
verde
vermelho
violeta

Cores do arco-íris na ordem inversa que foi informada:
violeta
anil
azul
verde
amarelo
laranja
vermelho

Cores que começam com a letra v:
vermelho
verde
violeta

Remover todas as cores que não começam com a letra v:
[vermelho, verde, violeta]

Limpar o conjunto:
[]

Conferir se o conjunto está vazio:
O conjunto está vazio
```

## Autor

Arthur de Castro Oliveira
