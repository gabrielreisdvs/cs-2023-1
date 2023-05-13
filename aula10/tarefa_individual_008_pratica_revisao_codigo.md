### Tarefa 008: Prática de Revisão de Código - 12/05/2023

#### Cliente

- sugere-se realizar o tratamento das possíveis exceções que podem ser jogadas pelos Validators, inclusive caso não seja lançada exceção e apenas retornado false;

### PremioSeguro

- sugere-se a adição de mais comentários ao método obtemPercentualDesconto para aumentar a legibilidade do código;
- nas linhas 63, 71, 79 e 87 a condição idade > 25 sempre será verdadeira caso as duas condições anteriores também sejam verdadeiras, razão pela qual demonstra-se desnecessária sua escrita;

### Teste

- o import import java.util.List não está sendo utilizado;
- na linha 15, que está comentada, está sendo passado como argumento para setDataNascimento um Date, mas deve ser uma String; 

### CpfValidator

- sugere-se adicionar mais comentários para aumentar a legibilidade;
- sugere-se a refatoração para quebrar o método de validação em métodos menores;
- nas linhas 13 a 15 é validado se o cpf possui mais de 11 números, caso tenha, ele apenas retorna 'false', quando deveria também lançar a exceção de CPF informado inválido;
- nas linhas 18 a 22 é validado se os caracteres informados são digitos, em caso negativo, ele apenas retorna 'false', quando deveria também lançar a exceção de CPF informado inválido;
- nas linhas 37 a 48 é validado se os caracteres informados são todos iguais, em caso positivo, ele apenas retorna 'false', quando deveria também lançar a exceção de CPF informado inválido;


### DataUtils

- sugere-se adicionar mais comentários para aumentar a legibilidade;

### Demais classes sem comentários

</DIV/>
