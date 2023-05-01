### Tarefa Grupo 005: Git Exercícios - 28/04/2023.

Responda as questões abaixo (exercite os comandos do git correspondentes). Lembre-se de que o “interessante” não é exatamente o conjunto de respostas, mas o processo de obtê-las e a experiência obtida com a execução dos comandos.


1. Qual o comando para obter a versão instalada do Git?

git -v ou git --version

2. Qual o efeito da execução de cada um dos comandos abaixo?
  a. git help
  
  Exibição da lista de alguns comandos do git, com a explição dos mais comuns.
  
  b. git help checkout
  
  Exibe um manual referente ao comando checkout.
  
  c. git help merge
  
  Exibe um manual referente ao comando merge.
  
  d. git init
  
  Cria um repositório vazio do Git ou reinicializa um já existente.
  
  e. git add --all
  
  Adiciona todos os novos arquivos do diretório local para o commit a ser feito no repositório.
  
  f. git add -u
  
  Realiza uma atualização do índice de acordo com a árvore de trabalho.
  
  g. git config -l
  
  Lista as variáveis constantes do arquivo config com seus respectivos valores.
  
  h. git mv a.txt b.txt
  
  Renomeia o arquivo a.txt para b.txt.
  
  i. git reset --hard
  
  Reseta o índice e a árvore de trabalho. Quaisquer mudanças nos arquivos acompanhados na árvore de trabalho desde o último commit são descartadas. Arquivos não seguidos e diretórios são excluídos.
  
  j. git log -27
  
  Exibe os últimos 27 commits.
  
3. O fluxo “clássico” de interação com o Git é algo como “alterar um ou mais arquivos”, “acrescentar essas mudanças para serem contemplados no próximo commit” e, finalmente, executar um “commit”. Quais os comandos necessários para realizar os dois últimos “passos” desse fluxo?

O primeiro é git add, que pode ser git add * que adiciona todos os arquivos novos/alterados ou git add <nome-arquivo>, que adiciona um arquivo específico. 
O segundo é git commit, geralmente acompanhado de -m "mensagem do commit".
  
4. Qual o comando deve ser executado para identificar o que foi alterado desde o último “commit”?
  
  git status
  
5. Em um dado repositório, arquivos simplesmente copiados para lá, ou seja, _untracked_, podem ser exibidos/identificados com que comando?

  git status ou mais especificiamente git status -unormal
  
6. Qual o comando para efetuar um _commit_?
  
  git commit
  
7. Qual o comando que devemos empregar para descartar mudanças ocorridas no arquivo teste.txt, por exemplo?
  
  git restore teste.txt
  
8. O que deve ser feito para que um determinado diretório do seu repositório seja ignorado pelo Git? Faça uma busca por **.gitignore**.
  
  Adicionar no arquivo .gitignore o caminho do diretório seguido de barra, por exemplo: nome-diretorio/
  
9. O que acontece se o seu repositório local for acidentalmente removido?
  
  Você perderá os arquivos do seu computador, mas o repositório continuará existindo remotamente.
  
10. Como clonar um repositório remoto?
  
  git clone <endereco-https-ou-ssh-repositorio-remoto>
  
11. Em alguns cenários **git log** pode produzir extensos resultados. Se houver interesse em visualizar o histórico de um repositório, onde cada mudança é fornecida exatamente em uma única linha, qual o comando que deve ser empregado?
  
  git log --oneline
  
12. Em qual arquivo o Git armazena informações de configuração empregadas por usuário?
  
  .gitconfig
  
13. Qual o comando para criar um repositório local?
  
  git init
  
14. Qual o nome do diretório criado pelo Git quando se executa o comando **git init**?
  
  .git
  
15. Qual o comando para adicionar todos os arquivos modificados? (Aqueles para os quais **git status** identificam como **modified**?)
  
  git add -u
  
16. O Git faz uso do valor de hash conhecido por SHA1. O que isto significa? Qual o propósito? O que é SHA1?
  
  SHA-1 (Secure Hash Algorithm 1) é uma das várias funções de hash criptográficas. O SHA1 embaralha determinado arquivo, imagem ou texto para que seja gerado um conjunto de caracteres identificadores, caracteres esses que possuem 40 dígitos. Esses quarenta dígitos são sempre únicos.
  Assim, o git consegue acompanhar os arquivos alterados utilizando o SHA1.
  
17. Qual a palavra para indicar o último _commit_ em vez do valor de hash SHA1 correspondente?
  
   git log --abbrev
  
18. Quando se cria dois arquivos usando um editor de texto qualquer e, na sequência, executamos o comando **git add -u**, os dois arquivos criados passam de _untracked_ para _new file_?
  
  Não, pois o parâmetro -u não adiciona novos arquivos.
  
19. Qual o efeito da execução dos dois comandos abaixo, nesta ordem, em um dado repositório?
**git reset --soft HEAD~1**
  
  Não altera o index ou a árvore de trabalho, mas reseta para o último commit. Mantém os arquivos alterados.
  
**git reset --hard**
  
  Reseta o index e a árvore de trabalho, além de descartar quaisquer alterações nos arquivos.
  
20. Após o emprego de um ambiente integrado de desenvolvimento (IDE), é comum a criação de arquivos e diretórios. Qual o comando que podemos empregar para remover arquivos e diretórios _untracked_?
  
  git clean -f -x
  
21. Qual o nome do arquivo no qual podemos inserir a indicação para o Git de arquivos e diretórios a serem ignorados?
  
  .gitignore
  
22. Quando se cria o arquivo _MinhaClasse.class_ em um dado diretório e desejamos que arquivos com a extensão .class, como neste caso, sejam ignorados por todos os membros de uma equipe que estão contribuindo com um dado projeto, como devemos proceder?
  
  Adicionar no .gitignore: *.class
  
23. jQuery é uma famosa biblioteca em JavaScript. Consulte detalhes em [jQuery](http://jquery.com). O repositório correspondente encontra-se em [gitRep](https://github.com/jquery/jquery.git). Faça o clone deste repositório.
  
  git clone https://github.com/jquery/jquery.git
  
24. No repositório **jqueryrepo**, criado no passo anterior, qual o efeito do comando
**git shortlog -sne**?
  
  Exibe log com nome e e-mail de participantes.
  
25. No repositório **jqueryrepo**, qual o efeito de **git remote -v**?
  
  Exibe a url e nome do repositório remoto.
  
26. Um repositório Git pode ser etiquetado ao longo do tempo. Ou seja, _commits_ específicos podem ser “marcados” ou “etiquetados” para facilitar referências posteriores. Para listar todas as “etiquetas” (_tags_) estabelecidas para um dado repositório, qual comando deve ser executado?
  
  git tag para repositório local, e git ls-remote --tags <remote> para repositório remoto
  
27. Caso um dado repositório retorne muitas “marcas” ou “etiquetas” para o comando **git tag**, como retornar apenas aquelas que atendem a determinado padrão, por exemplo, iniciadas por 2.0?
  
  git tag --list '2.0*'
  
28. Qual o efeito do comando **git tag -a 3.4-gold -m “minha versão ouro”**?
  
  Cria a tag 3.4-gold com a mensagem "minha versão ouro".
  
29. Após executado o comando acima, qual o efeito de **git show 3.4-gold**?
  
  Mostra a mensagem da tag e os objetos.
  
30. O que o comando **git push origin 3.4-gold** teria como efeito?
  
  Envia a tag 3.4-gold para o repositório remoto.
  
31. Após executar um commit, qual o efeito de **git commit --amend**?
  
  Modifica o commit, adicionando novas staged changes ao commit.
  
32. Após executar **git add x.txt**, qual o efeito de **git reset HEAD x.txt**?
  
  O arquivo x.txt é removido.
  
33. Após alterar o conteúdo de um arquivo committed em passo anterior, qual o efeito do comando **git checkout -- a.txt**?
  
  Descarta as alterações.
  
34. Qual a diferença entre os comandos **git reset HEAD a.txt** e **git checkout -- a.txt**?
  
  O git reset remove o arquivo, ao passo que o checkout apenas descarta as alterações.
  
35. Veja como interpretar o resultado de git diff [aqui](https://medium.com/therobinkim/how-to-read-a-git-diff-6c87a9dc47c5). Execute, em um dos seus projetos, o comando **git diff HEAD~1 HEAD** e certifique-se de que entende o resultado apresentado.
</DIV/>
