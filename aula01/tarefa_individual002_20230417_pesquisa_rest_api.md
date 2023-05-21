## Tarefa 002 - 17/04/2022 - Pesquisa Rest API

1. Elaborar uma pesquisa sobre o tema "_Rest API_".
2. Elaborar um texto **no formato markdown** de pelo menos uma página, descrito com suas próprias palavras, destacando:
* As definições dos conceitos envolvidos;
* As principais características deste conceito (pelo menos umas cinco).


### Rest API

API é uma sigla para _Application Programming Interface_, ou seja, Interface de Programação de Aplicações. Se tratando de interface, a API permite a comunicação entre aplicações sem que se conheça detalhes de sua implementação. Assim, utiliza-se um conjunto de padrões e diretrizes que possibilitam a utilização de funcionalidades da referida aplicação por outra. 

Por sua vez, Rest significa Representational State Transfer, ou seja, Transferência de Estado Representacional, que é um grupo de restrições de design dentro da arquitetura de software que gera sistemas distribuídos eficientes, confiáveis e escaláveis. Essas restrições definem um conjunto de funções como GET, PUT, DELETE e assim por diante, que os clientes podem usar para acessar os dados do servidor por meio do protocolo HTTP. 

Dessa definição temos a primeira restrição do REST: separar a arquitetura em dois ambientes, cliente, que consome o serviço, e servidor, que o provê. O servidor espera pelas requisições do cliente, executa estas requests e devolve uma resposta. Cada requisição deve conter todos os dados necessários para seu atendimento, pois o servidor não armazena nenhuma informação sobre o estado do cliente, ou seja, é _stateless_. 

Além disso, o servidor deve armazenar suas respostas às requisições em cache a fim de permitir respostas rápidas a requisições que utilizem o mesmo _resource_, ou seja, precisa ser _cacheable_. Os componentes da comunicação cliente-servidor precisam ser os mais genéricos possíveis para facilitar eventual refatoração, o que é chamado de _uniform interface_. 

A aplicação precisa ser projetada em camadas (_layered system_), sobretudo para que o cliente não se comunique diretamente com o servidor, passando por um intermediário, como um _load balancer_.

Assim, as Rest API são aquelas API que implementam as restrições Rest. A utilização de API Rest traz muitos benefícios, como a integração, facilitando o aproveitamento de funcionalidades já existentes sem necessidade de reescrita de código; a inovação, pois as alterações na API são realizadas de maneira facilitada sem necessidade de grandes refatorações; a expansão, pois possibilita a utilização de várias plataformas de maneira simplificada; e a facilidade de manutenção, pois alterações no código, se feitas, não afeterão a API.



