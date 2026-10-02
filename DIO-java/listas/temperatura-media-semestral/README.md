# Média Semestral de Temperaturas

Exercício em Java que recebe a temperatura média dos 6 primeiros meses do ano, calcula a média semestral e mostra os meses cuja temperatura ficou acima dessa média.

## Enunciado

Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e armazene-as em uma lista. Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média, e em que mês elas ocorreram (mostrar o mês por extenso: 1 - Janeiro, 2 - Fevereiro e etc).

## Como funciona

1. Uma lista `meses` guarda os nomes dos meses, de Janeiro a Junho.
2. Um laço `for` percorre os 6 meses, pede a temperatura média de cada um com `Scanner`, guarda o valor na lista `temperaturasMedias` e acumula a soma.
3. A média semestral é a soma dividida pelo tamanho da lista (`soma / temperaturasMedias.size()`).
4. Um segundo laço percorre as temperaturas e imprime, no formato `número - mês - temperatura`, apenas as que são maiores que a média.

## Conceitos praticados

- `List` e `ArrayList`
- Leitura de dados com `Scanner`
- Laços `for`
- Acumulador de soma e cálculo de média
- Condicional (`if`)
- Concatenação de `String`

## Como executar

Requisito: JDK 9 ou superior (o código usa `List.of`).

```bash
javac Main.java
java Main
```

## Exemplo de execução

```
Digite a temperatura média de Janeiro:
25

Digite a temperatura média de Fevereiro:
27

Digite a temperatura média de Março:
26

Digite a temperatura média de Abril:
24

Digite a temperatura média de Maio:
22

Digite a temperatura média de Junho:
20

A média semestral das temperaturas é: 24

As temperaturas acima da média são:

1 - Janeiro - 25
2 - Fevereiro - 27
3 - Março - 26
```

## Observações

- As temperaturas são lidas como números inteiros (`nextInt()`), então valores decimais como `25,5` causam erro.
- A média é calculada com divisão inteira, portanto é exibida sem casas decimais (por exemplo, 24,83 aparece como 24). Isso não altera quais meses aparecem na lista, já que as temperaturas também são inteiras.
- Se nenhuma temperatura estiver acima da média (por exemplo, todas iguais), nenhum mês é listado.
