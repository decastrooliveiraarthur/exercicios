# Interrogatório: Você é Inocente ou Culpada?

Exercício em Java para praticar o uso de **listas** (`List` e `ArrayList`). O programa faz cinco perguntas de sim ou não, como em um interrogatório, e classifica o usuário de acordo com o número de respostas `true`.

## O que o programa faz

1. Guarda as perguntas em uma `List<String>`.
2. Percorre a lista, exibe cada pergunta e lê a resposta (`true` ou `false`).
3. Armazena as respostas em uma `List<Boolean>`.
4. Conta quantas respostas foram `true`.
5. Exibe a classificação final com base nessa contagem.

### Perguntas

1. Telefonou para a vítima?
2. Esteve no local do crime?
3. Mora perto da vítima?
4. Devia para a vítima?
5. Já trabalhou para a vítima?

### Classificação

| Respostas `true` | Resultado |
|:----------------:|-----------|
| 0 ou 1 | Inocente |
| 2 | Suspeita |
| 3 ou 4 | Cúmplice |
| 5 | Assassina |

## Conceitos praticados

- Criação de listas com `ArrayList` e `List.of(...)`
- Adição de elementos com `add()`
- Acesso a elementos com `get(i)` e tamanho da lista com `size()`
- Laço `for` percorrendo uma lista por índice
- Leitura de dados com `Scanner` e `nextBoolean()`
- `switch` com múltiplos valores por `case` (`case 0, 1:`)
- Contador acumulador (`somaRespostasTrue`)

## Como executar

Requisitos: **Java 14 ou superior** (por causa do `case` com múltiplos valores).

```bash
javac Main.java
java Main
```

## Exemplo de execução

```
Telefonou para a vítima? (true/false)
true

Esteve no local do crime? (true/false)
false

Mora perto da vítima? (true/false)
true

Devia para a vítima? (true/false)
false

Já trabalhou para a vítima? (true/false)
false

Você é:

Suspeita
```

## Observações

- As respostas devem ser digitadas exatamente como `true` ou `false`. Qualquer outro valor lança `InputMismatchException`.
- Possíveis melhorias: aceitar "s"/"n", validar a entrada, fechar o `Scanner` e remover a lista `respostas`, que poderia ser substituída pela contagem direta.
