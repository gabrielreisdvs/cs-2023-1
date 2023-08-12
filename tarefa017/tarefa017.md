# Tarefa 017 - Configuração de software em tempo de execução, Generics, Closure e Logging - 30/06/2023

A configuração de software em tempo de execução envolve a capacidade de ajustar o comportamento de um sistema sem a necessidade de recompilar ou reiniciar o programa. 

Os Profiles no Spring permitem definir diferentes conjuntos de configurações com base em determinados ambientes ou requisitos, como por exemplo, diferenciando os cenários de desenvolvimento, teste e produção. Com os Profiles é possível definir diferentes valores de propriedades, configurar componentes específicos e ativar ou desativar funcionalidades de acordo com o ambiente de execução.

A inversão de controle (IoC) é um princípio de engenharia de software que permite delegar a responsabilidade de criar e gerenciar objetos ou partes do programa para um framework ou container, geralmente aplicado na programação orientada a objeto. No caso do framework Spring, isso ocorre por meio do mecanismo de injeção de dependências.

A injeção de dependências é um padrão em que em vez de criar objetos dentro de outros objetos, as dependências necessárias são injetadas nos objetos dependentes. O Spring IoC Container gerencia a criação e o gerenciamento de objetos, permitindo que as dependências sejam injetadas automaticamente nos componentes.

A utilização da configuração de software em tempo de execução com Spring demanda a definição dos profiles para cada ambiente; a configuração das propriedades de conexão; a criação de classes de configuração da conexão com o banco de dados, utilizando-se das anotações @Configuration e @Profile para utilização da injeção de dependências; e a ativação do profile no ambiente de execução.

Antes de falarmos sobre Closure, destaca-se que as funções lambda são expressões compactas e concisas que representam um bloco de código executável. Elas são usadas para criar implementações de interfaces funcionais, que são interfaces com um único método abstrato, de forma mais sucinta e expressiva, sendo frequentemente utilizadas em conjunto com métodos como o forEach.

O forEach permite iterar sobre uma coleção de elementos e executar uma ação em cada um deles. O segundo artigo desse tópico mostra como o forEach pode ser usado com uma expressão lambda para definir essa ação de forma concisa, destacando que o uso de expressões lambda em conjunto com o forEach oferece uma sintaxe mais clara e sucinta para realizar operações em coleções.

Uma closure é uma função anônima que pode acessar e manipular variáveis locais de seu escopo envolvente, mesmo após esse escopo ter sido encerrado. Em Java, as closures são comumente implementadas por funções lambda.

Por sua vez, o Generics é um recurso introduzido na versão 5 do Java que permite a criação de classes, interfaces e métodos que podem ser parametrizados para trabalhar com diferentes tipos de dados de forma segura e genérica, evitando códigos redundantes, castings excessivos e erros em tempo de execução. A sintaxe básica para usar Generics em Java é por meio do uso de colchetes angulares (<>) para especificar os tipos parametrizados.

Em Java Generics, os wildcards são um recurso que permite lidar com tipos desconhecidos ou desconhecidos em tempo de compilação ao trabalhar com classes, interfaces ou métodos parametrizados. Existe três tipos de wildcard: Unknown Wildcard, ou seja, Wildcard desconhecido; Extends Wildcard; e Super wildcard. O Unknown é utilizado quando não se sabe o tipo do objeto; o extends para possibilitar o uso de vários tipos que se relacionam entre si; e o super com tipos superiores específicos, como classes pai.

A utilização de Generics em métodos permite criar métodos genéricos que podem trabalhar com diferentes tipos de dados de forma segura e reutilizável. A inferência de tipos (type inference) em métodos genéricos permite ao compilador deduzir automaticamente os tipos genéricos com base nos argumentos passados.

Ressalta-se que algumas coisas não são permitidas com Generics, tais como a criação direta de instâncias de tipos genéricos, o uso de tipos primitivos como argumentos genéricos e o uso de tipos genéricos em enumerações.

O logging em Java é um recurso que permite a captura e o registro de informações relevantes durante a execução do programa. O logging é utilizado para acompanhar o fluxo de execução, diagnosticar problemas, monitorar o desempenho e obter insights sobre o comportamento do sistema. A API de logging em Java é fornecida pela plataforma Java SE e é acessível por meio do pacote java.util.logging, que oferece um conjunto de classes e métodos para criar registros de log em diferentes níveis de detalhe, mas também podem ser utilizados outros frameworks, tais como Log4j, Logback e tinylog.

Para utilizar o logging em um aplicativo Java, é necessário criar um objeto Logger, que representa o ponto de entrada para registrar mensagens de log. Cada Logger é associado a um nome específico, geralmente relacionado ao pacote ou classe que está sendo logada. Além disso, Appenders e Layouts são componentes fundamentais que ajudam a definir como as mensagens de log são formatadas e para onde elas são direcionadas.

Em Java logging, os levels (níveis) são usados para classificar a importância das mensagens de log. Cada mensagem de log é atribuída a um nível específico, que indica o quão significativa é a informação registrada. Ainda, os formatters são responsáveis por definir o formato das mensagens de log antes de serem registradas, permitindo personalizar a aparência e a estrutura das mensagens de log, tornando-as mais legíveis e informativas.
