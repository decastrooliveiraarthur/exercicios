# Exercício Java: Map (Dicionário) com a população do Nordeste

Exercício em Java que pratica as principais operações da interface `Map` usando a população de alguns estados do Nordeste brasileiro.

## O que o programa faz

1. Cria um `LinkedHashMap` com a população de PE, AL, CE e RN.
2. Substitui a população do RN por `3.534.165`.
3. Verifica se o estado PB existe e, como não existe, adiciona com população de `4.039.277`.
4. Exibe a população de PE.
5. Exibe os estados e suas populações na ordem de inserção.
6. Exibe os estados e suas populações em ordem alfabética, usando `TreeMap`.
7. Exibe o estado com a menor população.
8. Exibe o estado com a maior população.
9. Calcula e exibe a soma da população dos estados.
10. Calcula e exibe a média da população dos estados.
11. Remove os estados com população menor que `4.000.000`, usando `Iterator`.
12. Apaga todo o dicionário com `clear()`.
13. Verifica se o dicionário está vazio.

## Conceitos praticados

- `Map`, `LinkedHashMap` e `TreeMap`
- Diferença entre manter a ordem de inserção e a ordem alfabética das chaves
- `put`, `get`, `containsKey`, `keySet`, `values`, `entrySet`, `clear` e `isEmpty`
- `Collections.min` e `Collections.max`
- Remoção segura durante a iteração com `Iterator.remove()`, evitando `ConcurrentModificationException`
- Literais numéricos com separador (`9_616_621`)

## Como executar

Requisito: Java 8 ou superior (JDK instalado).

```bash
javac Main.java
java Main
```

## Resultados esperados

| Etapa | Resultado |
|---|---|
| Após substituir o RN e adicionar o PB | `{PE=9616621, AL=3351543, CE=9187103, RN=3534165, PB=4039277}` |
| Ordem alfabética | AL, CE, PB, PE, RN |
| Menor população | AL - 3351543 |
| Maior população | PE - 9616621 |
| Soma | 29728709 |
| Média | 5945741.8 |
| Após remover populações menores que 4.000.000 | `{PE=9616621, CE=9187103, PB=4039277}` |
| Após `clear()` | `{}` e "O dicionário está vazio." |

## Estrutura

```
.
├── Main.java
└── README.md
```

## Autor

Arthur de Castro Oliveira
