# language: pt

@wip
Funcionalidade: CRUD de processos

  Cenário de Fundo:
    Dado O usuario esta na pagina de processos

  Cenário: Inserir um novo processo - POST
    E o usuário informar "vara" com o valor igual a "campinas"
    E o usuário informar "numero_processo" com o valor igual a "63984589"
    E o usuário informar "natureza" com o valor igual a "Criminal"
    E o usuário informar "partes" com o valor igual a "AndersonXAllan"
    E o usuário informar "urgente" com o valor igual a "N"
    E o usuário informar "arbitramento" com o valor igual a "S"
    E o usuário informar "assistente_social" com o valor igual a "Tiago Volpi"
    E o usuário informar "data_entrada" com o valor igual a "20-12-2020"
    E o usuário informar "data_saida" com o valor igual a "21-01-2021"
    E o usuário informar "data_agendamento" com o valor igual a "16-12-2020"
    E o usuário informar "status" com o valor igual a "Aguardando"
    E o usuário informar "observacao" com o valor igual a "SP Campeao Brasileiro 2020"
    Quando o usuário clicar no botão salvar
    Então o usuário deveria ver a mensagem "salvo com sucesso"


  Cenario: Buscar um processo existente - GET
    E o usuário informar "vara" com o valor igual a "campinas"
    E o usuário informar "numero_processo" com o valor igual a "63984589"
    E o usuário informar "natureza" com o valor igual a "Criminal"
    E o usuário informar "partes" com o valor igual a "AndersonXAllan"
    E o usuário informar "urgente" com o valor igual a "N"
    E o usuário informar "arbitramento" com o valor igual a "S"
    E o usuário informar "assistente_social" com o valor igual a "Tiago Volpi"
    E o usuário informar "data_entrada" com o valor igual a "20-12-2020"
    E o usuário informar "data_saida" com o valor igual a "21-01-2021"
    E o usuário informar "data_agendamento" com o valor igual a "16-12-2020"
    E o usuário informar "status" com o valor igual a "Aguardando"
    E o usuário informar "observacao" com o valor igual a "SP Campeao Brasileiro 2020"
    E o usuário clicar no botão salvar
    Quando o botao mostrar for clicado
    Entao a <mensagem> deve ser mostrada
