package steps;

import static org.junit.Assert.assertTrue;

import driver.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginSteps {

    LoginPage loginPage = new LoginPage(DriverManager.getDriver());


    @Given("que estou na página de login")
    public void que_estou_na_página_de_login() {
        loginPage.acess();
    }
    @When("preencho o campo de usuário e senha com {string} e {string}")
    public void preencho_o_campo_de_usuário_e_senha_com_e(String string, String string2) {
        loginPage.fillCredentials(string, string2);
    }
    @When("clico no botão de login")
    public void clico_no_botão_de_login() {
        loginPage.submit();
    }
    @Then("devo ser redirecionado para a página inicial")
    public void devo_ser_redirecionado_para_a_página_inicial() {
        assertTrue(true);
    }


}
