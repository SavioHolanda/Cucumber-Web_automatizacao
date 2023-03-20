package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public WebDriver driver;
    public LoginPage (WebDriver sdriver){
        driver = sdriver;
        PageFactory.initElements(sdriver, this);
    }

    @FindBy(css = "label[for='usuario']")
    WebElement cliqueUsuario;

    @FindBy(id = "usuario")
    WebElement txtUsuario;

    @FindBy(css = "label[for='senha']")
    WebElement cliqueSenha;

    @FindBy(id = "senha")
    WebElement txtSenha;

    @FindBy(css = "button[type='submit']")
    WebElement cliquesubmitLogin;

    @FindBy(linkText = "Boas vindas, admin!")
    WebElement validarLogin;

    public void escreverUsuario(String usuario){
        cliqueUsuario.click();
        txtUsuario.sendKeys(usuario);
    }

    public void escreverSenha(String senha){
        cliqueSenha.click();
        txtSenha.sendKeys(senha);
    }

    public void cliqueSubmitLogin(){
        cliquesubmitLogin.click();
    }

    public String validarLogin(){
        return validarLogin.getText();
    }

}