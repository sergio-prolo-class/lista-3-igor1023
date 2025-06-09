# Correção

| Questão     | Legibilidade | Diagramas | P1 | P2 | P3 | Total |
|-------------|--------------|-----------|----|----|----|-------|
| Nota máxima | 10           | 10        | 20 | 25 | 35 | 100   |
| Nota        | 8            | 8         | 16 | 20 | 25 |       |

## Diagramas

- associações não usam as setas corretas
- P1:
  - atributos e métodos estáticos deveriam estar sublinhados
- P3:
  - Um autor pode pertencer a * bibliotecas? Um leitor também?
  - Um empréstimo pode ter 0 livros?

## P1

- se a coleção de usuários não permite réplica, não deveria ser lista e sim conjunto
- sua solução de inicializar Usuario formatando logins é ok...
  - mas não consigo remover usuários usando o nome que eles criaram, né?
  - existe uma solução mais prática

### Requisitos Funcionais
- [x] Cadastrar novos usuários
- [x] Remover usuários
- [x] Listar os logins
- [x] Autenticar usuários

## P2

- uma fila de clientes, onde cada cliente pode ter várias solicitações
  - problema: e se um cliente realizar uma nova solicitação?
  - ele sai da lista de atendidos para voltar à fila?
  - seus testes não mostram esse caso
  - Steve tem duas solicitações, elas são atendidas ao mesmo tempo?
- clientes registrados é uma lista? pode ter cliente duplicado?

### Requisitos Funcionais
- [ ] Registrar novas solicitações
- [x] Listar os telefones dos clientes registrados
- [x] Imprimir o nome do próximo cliente
- [x] Atender o próximo cliente
- [x] Listar os nomes dos clientes já atendidos
- [x] Listar os telefones dos clientes em espera
- [x] Gerar um relatório estatístico
- [x] ... total de solicitações registradas, atendidas, em espera
- [x] ... distribuição percentual das solicitações por categoria

## P3

- Dificilmente quando quero listar autores, eu quero ver também os livros que eles escreveram...
- Fizeste certo em usar Set para as coleções, mas...
  - Como os objetos Autor, Leitor e Livro não alteram hashCode e equals, seus conjuntos podem ter elementos repetidos
- O número de cópias disponíveis deveria ser atributo da biblioteca, não do livro
- 

### Requisitos Funcionais
- [x] Cadastrar autores
- [x] Cadastrar livros
- [x] Cadastrar leitores
- [x] Registrar empréstimos de livros para leitores
- [x] ... pelo menos uma cópia
- [x] ... leitor não tenha esse livro
- [x] ... leitor possua no máximo 5 livros emprestados
- [x] Listar autores em ordem alfabética
- [x] Listar leitores em ordem alfabética
- [x] Listar leitores por id
- [x] Listar livros por título
- [ ] Listar livros por autor
- [x] Listar livros por ISBN
- [ ] Listar empréstimos por data
- [ ] Listar empréstimos de um leitor, por data