package io.cucumber.danilo.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EnterProductDataPageObject {

    private WebDriver driver;
    private WebElement inputStarDate;
    private WebElement selectInsuranceSum;
    private WebElement optionInsuranSum;
    private WebElement selectMeritrating;
    private WebElement optionMeritrating;
    private WebElement selectDamageInsurance;
    private WebElement optionDamageInsurance;
    private WebElement euroProtection;
    private WebElement selectCourtesyCar;
    private WebElement optionCourtesyCar;
    private WebElement nextSelectPriceOption;

    public EnterProductDataPageObject(WebDriver driver){
        this.driver = driver;
        this.carregarElementos();
    }

    private void carregarElementos() {
        inputStarDate = driver.findElement(By.cssSelector("input[id=’startdate’]"));
        selectInsuranceSum = driver.findElement(By.cssSelector("select[id='insurancesum']"));
        optionInsuranSum = driver.findElement(By.cssSelector("option[value='3000000']"));
        selectMeritrating = driver.findElement(By.cssSelector("select[id='Meritrating']"));
        optionMeritrating = driver.findElement(By.cssSelector("option[value='Bonus 1']"));
        selectDamageInsurance = driver.findElement(By.cssSelector("select[id='damageinsurance']"));
        optionDamageInsurance = driver.findElement(By.cssSelector("option[value='No Coverage']"));
        euroProtection = driver.findElement(By.cssSelector("input[id='EuroProtection']"));
        selectCourtesyCar= driver.findElement(By.cssSelector("select[id='courtesycar']"));
        optionCourtesyCar = driver.findElement(By.cssSelector("option[value='No']"));
        nextSelectPriceOption = driver.findElement(By.cssSelector("input[id='nextselectpriceoption']"));
    }

    public void starDate(String star){
        this.inputStarDate.sendKeys(star);
    }

    public void insuranceSum(){
        this.selectInsuranceSum.click();
        this.optionInsuranSum.click();
    }

    public void meritrating(){
        this.selectMeritrating.click();
        this.optionMeritrating.click();
    }

    public void damageInsurance(){
        this.selectDamageInsurance.click();
        this.optionDamageInsurance.click();
    }

    public void euroProtection(String euroProtection){
        this.euroProtection.click();
    }

    public void courtesyCar(){
        this.selectCourtesyCar.click();
        this.optionCourtesyCar.click();
    }

    public void nextSelectPriceOption(){
        this.nextSelectPriceOption.click();
    }

    


}
