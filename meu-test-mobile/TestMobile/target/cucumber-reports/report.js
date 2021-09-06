$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/resources/features/Phone.feature");
formatter.feature({
  "name": "Phone mobile",
  "description": "  Quando o usuario acionar o botao contato o mesmo deseja criar um novo contato",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "name": "Adicionar novo contato",
  "description": "",
  "keyword": "Cenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "acionar a opacap contato",
  "keyword": "E "
});
formatter.match({
  "location": "PhoneSteps.acionarAOpacapContato()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o usuario acionar o botao Criar Contato",
  "keyword": "Quando "
});
formatter.match({
  "location": "PhoneSteps.oUsuarioAcionarOBotaoCriarContato()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "adicionar o contato",
  "keyword": "E "
});
formatter.match({
  "location": "PhoneSteps.adicionarOContato()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o app adiciona um novo contato e valida com essas imformacoes",
  "rows": [
    {
      "cells": [
        "Mobile"
      ]
    },
    {
      "cells": [
        "See your history together"
      ]
    },
    {
      "cells": [
        "Events and messages"
      ]
    }
  ],
  "keyword": "Entao "
});
formatter.match({
  "location": "PhoneSteps.oAppAdicionaUmNovoContatoEValidaComEssasImformacoes(String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});