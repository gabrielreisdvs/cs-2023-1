# Tarefa 021 - Teste de Software - 28/07/2023


**Classes de Equivalência**
|id|descrição|V/I|
|CE01|nota1 < 0|I|
|CE02|0 <= nota1 <= 10|V|
|CE03|nota1 > 10|I|
|CE04|nota2 < 0|I|
|CE05|0 <= nota2 <= 10|V|
|CE06|nota2 > 10|I|
|CE07|cargaHoraria < 0|I|
|CE08|cargaHoraria >= 0|V|
|CE09|faltas < 0|I|
|CE10|faltas >= 0|V|

**Casos de Teste Derivados**
|CT|Nota1|Nota2|CargaHoraria|Faltas|Resultado|Esperado|Classe Equivalência|
|CT01|-2.00|8.00|128|12|Valor Inválido|CE01|
|CT02|7.50|12.00|128|12|Valor Inválido|CE03|
|CT03|15.00|8.00|128|12|Valor Inválido|CE03|
|CT04|5.50|-2.00|128|12|Valor Inválido|CE04|
|CT05|5.00|12.00|128|31|Valor Inválido|CE06|
|CT06|7.00|15.00|128|31|Valor Inválido|CE06|
|CT07|5.50|8.00|-128|12|Valor Inválido|CE07|
|CT08|5.50|8.00|128|-12|Valor Inválido|CE09|
|CT09|5.50|8.00|128|12|Aprovado|CE08|
|CT10|6.50|8.00|128|33|Reprovado por Falta|CE10|
|CT11|3.00|2.50|128|31|Reprovado por Média|CE08|
|CT12|6.50|5.00|128|31|Recuperação|CE08|
|CT13|7.00|7.00|128|12|Aprovado|CE08|
