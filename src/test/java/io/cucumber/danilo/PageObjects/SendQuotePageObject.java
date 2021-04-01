package io.cucumber.danilo.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SendQuotePageObject {

    private WebDriver driver;
    private WebElement inputEmail;
    private WebElement inputUsername;
    private WebElement inputPassword;
    private WebElement inputConfirmPassword;
    private WebElement sendemail;


    public SendQuotePageObject(WebDriver driver){
        this.driver = driver;
        this.carregarElementos();
    }

    private void carregarElementos() {
        inputEmail = driver.findElement(By.cssSelector("input[id='email']"));
        inputUsername = driver.findElement(By.cssSelector("input[id='username']"));
        inputPassword = driver.findElement(By.cssSelector("input[id='password']"));
        inputConfirmPassword = driver.findElement(By.cssSelector("input[id='confirmpassword']"));
        sendemail = driver.findElement(By.cssSelector("button[id='sendemail']"));

    }

    public void email(String email){
        this.inputEmail.sendKeys(email);
    }

    public void userName(String user){
        this.inputUsername.sendKeys(user);
    }

    public void password(String password){
        this.inputPassword.sendKeys(password);
    }

    public void confirmPassword(String confirm){
        this.inputConfirmPassword.sendKeys(confirm);
    }

    public void sendemail(){
        this.sendemail.click();
    }
}