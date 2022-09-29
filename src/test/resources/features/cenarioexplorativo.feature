# language: pt

Funcionalidade: cadastrar usuario com numeros

  Cenario: rio: consultar usuário com numeros
    Dado que estou no site da tinnovo
    Quando clicar no botao adicionar
    E preencho nome, e-mail, cpf e telefone com numero
    E clico em guardar
    Entao deve aparecer a lista com o cadastro