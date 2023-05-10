### Tarefa 007: Revisão de Código - 10/05/2023

1. Solicita-se a leitura dos artigos disponíveis nos seguintes links:

  1.1 [link1](https://appmaster.io/pt/blog/revisoes-de-codigo)

  1.2 [link2](https://medium.com/codigorefinado/code-review-revis%C3%A3o-de-c%C3%B3digo-pode-ser-automatizada-ba5f25882774)

2. Após a leitura elaborar um resumo descritivo de cada um deles. Destacando:

  2.1 A importância da Revisão de código;

  2.1 Os objetivos desta técnica;

  2.2 O Processo de Revisão e

  2.3 Descrever algumas das ferramentas de suporte a esta atividade, com seus respectivos links no texto.   



A revisão de código consiste na busca ativa por erros/bugs em um código. Tal revisão pode ser feita por softwares ou por pessoas, sendo que, neste último caso, recomenda-se que seja feito por pessoa diversa da que escreveu o código. Ter uma lista de verificação auxilia na tarefa, pois indica o que o revisor deve observar.

A importância da revisão de código reside no fato de poder detectar problemas ainda no início do desenvolvimento, diminuindo os custos de produção, além de melhorar a qualidade do código. Ademais, os próprios desenvolveram que participaram do processo se beneficiam: o revisor ganha conhecimento ao ler o código de outra pessoa, ao passo que a pessoa que escreveu o código recebe feedback que auxilia no seu crescimento profissional.

Sobre o processo de revisão, o artigo indica que, inicialmente, é preciso se preparar para realizar a revisão de código: saber o contexto, prioridades, tipo do software e alvo. Além disso, a execução de um teste pode ser positiva para entender como o código funciona.

Passada essa fase, seria o momento de iniciar de fato a revisão, utilizando-se a lista de verificação. Segundo o artigo, o primeiro item da lista deve ser depurar, a fim de eliminar todos os bugs, com utilização de um software e pela verificação manual. Depois, verifica-se a segurança do código, procurando por vulnerabilidades. Posteriormente, analisa-se a legibilidade do código, para saber se regras/padrões foram seguidos e se o código é autoexplicativo. Após, procura-se por códigos duplicados. Também é preciso verificar a nomeação das variáveis, classes, etc. A revisão deve abranger também a documentação, sendo que eventuais mudanças no código devem ser registradas nela. O revisor deve também sugerir melhorias no código, além de fornever um feedback completo ao autor do código, sobretudo das alterações feitas.

No segundo artigo é destacado que a revisão de código pode ser automatizada. O autor discorre sobre várias ferramentas tais como: Travis (https://www.travis-ci.com/), que é uma ferramenta de integração contínua mediante a utilização de scripts; o TSLint, para verificação da aderência do código à convenção (https://palantir.github.io/tslint/); CodeFactor, para verificar a qualidade do código (https://github.com/marketplace/codefactor); o Dependabot (https://github.com/marketplace/dependabot), para manter as dependências atualizadas.

</DIV/>
