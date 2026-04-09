package steps;

import static org.junit.Assert.assertTrue;

import driver.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginSteps {

    LoginPage loginPage = new LoginPage(DriverManager.getDriver());


    @Given("que estou na pagina de login")
    public void que_estou_na_pagina_de_login() {
        loginPage.acess();
    }
    @When("preencho o campo de usuario e senha com {string} e {string}")
    public void preencho_o_campo_de_usuario_e_senha_com_e(String string, String string2) {
        loginPage.fillCredentials(string, string2);
    }
    @When("clico no botao de login")
    public void clico_no_botao_de_login() {
        loginPage.submit();
    }
    @Then("devo ser redirecionado para a pagina inicial")
    public void devo_ser_redirecionado_para_a_pagina_inicial() {
        assertTrue(loginPage.isAtInventoryPage());
    }


}
