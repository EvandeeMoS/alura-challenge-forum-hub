# forum-hub

O Forum Hub é um desafio proposto pela alura na finalização da sua trilha de java + spring boot 3.

Esse projeto é uma api restful para um fórum fictício, onde temos endpoints para o crud de tópicos e outras funcionalidades,
tudo isso seguindo as regras de negócio estimadas no ínicio do projeto.

## Endpoints

Atualmente temos 5 endpoints no projeto:

- [GET] -> "/topicos", para listar todos os tópicos;
- [GET] -> "/topicos/{id}", para detalhar um tópico específico, tendo acesso também a suas respostas;
- [POST] -> "/topicos", para criar um novo tópico;
- [PUT] -> "/topicos/{id}", para alterar as informações de um tópico;
- [DELETE] -> "/topicos/{id}", para deletar um tópico do banco de dados.



