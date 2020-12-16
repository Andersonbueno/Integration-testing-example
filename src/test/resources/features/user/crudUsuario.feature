# language: pt
Funcionalidade: CRUD de usuário

  Cenário: Criação de novo usuário - POST
    Dado que o usuário gostaria de salvar seu registro
    E o usuário informar "login" com o valor igual a "tiagovolpi"
    E o usuário informar "full_name" com o valor igual a "Tiago Volpi"
    E o usuário informar "login" com o valor igual a "Tiago Volpi"
    E o usuário informar "email" com o valor igual a "tiagovolpi@saopaulocampeao.com"
    E o usuário informar "age" com o valor igual a "30"
    Quando o usuário clicar no botão salvar
    Então o usuário deveria ver a mensagem "salvo com sucesso"