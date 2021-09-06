#language: pt
Funcionalidade: Phone mobile
  
  Quando o usuario acionar o botao contato o mesmo deseja criar um novo contato

  Cenario: Adicionar novo contato
    E acionar a opacap contato
    Quando o usuario acionar o botao Criar Contato
    E adicionar o contato
    Entao o app adiciona um novo contato e valida com essas imformacoes
      | Mobile                    |
      | See your history together |
      | Events and messages       |
