Feature: Login
    Feature Description: Login no sistema
    Como usuário
    Quero fazer login no sistema
    Para acessar minha conta

  Scenario: Login com credenciais válidas
    Given que estou na pagina de login
    When preencho o campo de usuario e senha com "standard_user" e "secret_sauce"
    And clico no botao de login
    Then devo ser redirecionado para a pagina inicial
