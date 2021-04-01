package io.cucumber.danilo.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectPriceOptionPageObject {

    private WebDriver driver;
    private WebDriverWait wait;
    private WebElement selectUltimate;
    private WebElement nextSendQuote;

    public SelectPriceOptionPageObject(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.carregarElementos();
    }

    private void carregarElementos() {
        selectUltimate = driver.findElement(By.cssSelector("input[id='selectultimate'] + span[class='ideal-radio']"));
        nextSendQuote = driver.findElement(By.cssSelector("button[id='nextsendquote']"));
    }

    public void selectUltimate() {
        wait.until(ExpectedConditions.visibilityOf(selectUltimate));
        this.selectUltimate.click();
    }

    public void btnNext() {
        wait.until(ExpectedConditions.visibilityOf(nextSendQuote));
        this.nextSendQuote.click();
    }
}