package io.cucumber.danilo.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectPriceOptionPageObject {

    private WebDriver driver;
    private WebElement selectUltimate;
    private WebElement nextSendQuote;

    public SelectPriceOptionPageObject(WebDriver driver){
        this.driver = driver;
        this.carregarElementos();
    }

    private void carregarElementos() {
        selectUltimate = driver.findElement(By.cssSelector("input[id='selectultimate']"));
        nextSendQuote = driver.findElement(By.cssSelector("button[id='nextsendquote']"));
    }

    public void selectUltimate(){
        this.selectUltimate.click();
    }

    public void btnNext(){
        this.nextSendQuote.click();
    }
}