# Tarefa 016 - Expressões Regulares - 28/06/2023

1. Elaborar expressões regulares para validação dos objetos constantes da tabela a seguir:

|objeto|formato|Observação|
|--|--|--|
|Data|dd/mm/aa|as "//" (barras) devem fazer parte da regex|
|Data|dd/mm/aaaa|as "//" (barras) devem fazer parte da regex|
|Data|dd/mm/aaaa hh:mm:ss|as "//" (barras), os ":" dois pontos e o espaço devem fazer parte da regex|
|Data|yy/mm/dd|as "//" (barras) devem fazer parte da regex|
|Data|yyyy/mm/dd|as "//" (barras) devem fazer parte da regex|
|Número decimal|dd.ddd.ddd|Os "." (pontos ) devem fazer parte da regex. Tanto a parte inteira, como a fracionária podem conter de 1 a 5 casas|
|Nomes de Arquivos / documentos|nome.(doc,docx,xls,xlsx,pdf,csv,txt)|pode utilizar outras extensões para teste.|
|E-mail|nome@dominio|dominio pode ser ".com", ".com.br", ".goias.gov.br", "(.mil, .gov, .esp, .edu).(br,ar,uk,fr,ru,es,it)"|
|Codigo Cor HTML ||#00ccff|
|Arquivo de Imagem||*.(jpg,gif,png), etc.|
|Endereco IP ||192.168.1.1|
|Arquivos Multimedia ||*.(swf,mov,wma,mpg,mp3,wav)|
|Telefone (BR) ||(11) 5555-1977 |
|Celular (BR)|(55) (62) 9834.1243|os parênteses e pontos fazem parte da regex.|
|Hora|(HH:MM)|Os ":" dois pontos, fazem parte da regex.|
|Hora|(HH:MM:SS)|Os ":" dois pontos, fazem parte da regex.|
|URL||http://www.google.com, https://www.google.com.br |
|Domínio||www.yahoo.com, www.yahoo.com.br|
|Telefone Internacional |1.245.532.3422|os "." pontos fazem parte da regex.|


1 - ^(0[1-9]|[12][0-9]|3[01])\/(0[1-9]|1[0-2])\/([0-9]{2})$

2 - ^(0[1-9]|[12][0-9]|3[01])\/(0[1-9]|1[0-2])\/(\d{4})$

3 - ^(0[1-9]|[12][0-9]|3[01])\/(0[1-9]|1[0-2])\/(\d{4}) (?:[01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]$

4 - ^(?:\d{2})/(?:0[1-9]|1[0-2])/(?:0[1-9]|[12][0-9]|3[01])$

5 - ^(?:\d{4})/(?:0[1-9]|1[0-2])/(?:0[1-9]|[12][0-9]|3[01])$

6 - ^\d{2}\.\d{1,5}\.\d{1,5}$

7 - ^[\w\s]+\.[\w]+$

8 - ^[a-zA-Z0-9_.+-]+@(?:[a-zA-Z0-9-]+\.(?:com|com\.br|goias\.gov\.br)|[a-zA-Z0-9-]+\.(?:mil|gov|esp|edu)\.(?:br|ar|uk|fr|ru|es|it))$

9 - ^#00([a-fA-F0-9]{4})$

10 - ^.+\.(jpg|jpeg|png|gif|bmp|svg|tiff|ico)$

11 - ^((1?\d{1,2}|2([0-4]\d|5[0-5]))\.){3}(1?\d{1,2}|2([0-4]\d|5[0-5]))$|^$

12 - \.(swf|mov|wma|mpg|mp3|wav)$

13 - ^\(\d{2}\)\s\d{4}-\d{4}$

14 - /^\(\d{2}\) \(\d{2}\) \d{4}\.\d{4}$

15 - ^\d{2}:\d{2}$

16 - ^\d{2}:\d{2}:\d{2}$

17 - ^(http|https):\/\/[^\s\/$.?#].[^\s]*$

18 - ^www\.(.+)$

19 - ^\d{1}\.\d{3}\.\d{3}\.\d{4}$
