Feature: Login
    Feature Description: Login no sistema
    Como usuário
    Quero fazer login no sistema
    Para acessar minha conta

  Scenario: Login com credenciais válidas
    Given que estou na página de login
    When preencho o campo de usuário e senha com "standard_user" e "secret_sauce"
    And clico no botão de login
    Then devo ser redirecionado para a página inicial
