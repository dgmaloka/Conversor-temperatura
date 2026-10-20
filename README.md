# Conversor de Temperatura em Java

Programa de terminal com menu que converte temperaturas de Celsius para Fahrenheit e Kelvin e indica se o clima está frio, agradável ou quente.

## Como funciona

1. Escolha uma opção no menu:
   - `1` Celsius para Fahrenheit
   - `2` Celsius para Kelvin
   - `3` Os dois
   - `4` Sair
2. Digite a temperatura em °C (mínimo de -273,15, o zero absoluto).
3. O programa mostra a conversão e uma mensagem sobre o clima:

| Temperatura | Mensagem |
|---|---|
| Abaixo de 15 °C | Está frio! |
| De 15 a 25 °C | Temperatura agradável! |
| Acima de 25 °C | Está calor! |

O menu se repete até você escolher a opção 4.

## Como executar

Requer o JDK instalado.

```bash
javac Main.java
java Main
```

## Conceitos praticados

- Menu com laço `do-while`
- Validação de entrada
- Condicionais `if / else if / else`
- Formatação de números com `printf`

## Exemplo

```
Escolha uma conversão:
1 - Celsius para Fahrenheit
2 - Celsius para Kelvin
3 - Os dois
4 - Sair
3
Digite a temperatura em °C:
30
A temperatura em °F é: 86,00
A temperatura em K é: 303,15
Está calor!
```
