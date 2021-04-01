package io.cucumber.danilo.PageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VehicleDataPageObject {

    private WebDriver driver;
    private WebDriverWait wait;
    private WebElement selectMake;
    private WebElement optionMake;
    private WebElement selectModel;
    private WebElement optionModel;
    private WebElement inputCylinderCapacity;
    private WebElement inputEnginePerformance;
    private WebElement inputDateOfManufacture;
    private WebElement selectNumberOfSeats;
    private WebElement optionNumberOfSeats;
    private WebElement radioButtonYes;
    private WebElement selectNumberOfSeatsMotorCycle;
    private WebElement optionNumberOfSeatsMotorCycle;
    private WebElement selectFuel;
    private WebElement optionFuel;
    private WebElement inputPayload;
    private WebElement inputTotalweight;
    private WebElement inputListPrice;
    private WebElement inputLicensePlateNumber;
    private WebElement inputAnnualMileage;
    private WebElement btnNext;
    private WebElement abaEnterInsurantData;

    public VehicleDataPageObject(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.carregarElementos();
    }

    private void carregarElementos() {
        selectMake = driver.findElement(By.cssSelector("select[id='make']"));
        optionMake = driver.findElement(By.cssSelector("option[value='Audi']"));
        selectModel = driver.findElement(By.cssSelector("select[id='model']"));
        optionModel = driver.findElement(By.cssSelector("option[value='Scooter']"));
        inputCylinderCapacity = driver.findElement(By.cssSelector("input[id='cylindercapacity']"));
        inputEnginePerformance = driver.findElement(By.cssSelector("input[id='engineperformance']"));
        inputDateOfManufacture = driver.findElement(By.cssSelector("input[id='dateofmanufacture']"));
        selectNumberOfSeats = driver.findElement(By.cssSelector("select[id='numberofseats']"));
        optionNumberOfSeats = driver.findElement(By.cssSelector("option[value='1']"));
        radioButtonYes = driver.findElement(By.cssSelector("input[value='Yes']"));
        selectNumberOfSeatsMotorCycle = driver.findElement(By.cssSelector("select[id='numberofseatsmotorcycle']"));
        optionNumberOfSeatsMotorCycle = driver.findElement(By.cssSelector("option[value='2']"));
        selectFuel = driver.findElement(By.cssSelector("select[id='fuel']"));
        optionFuel = driver.findElement(By.cssSelector("option[value='Petrol']"));
        inputPayload = driver.findElement(By.cssSelector("input[id='payload']"));
        inputTotalweight = driver.findElement(By.cssSelector("input[id='totalweight']"));
        inputListPrice = driver.findElement(By.cssSelector("input[id='listprice']"));
        inputLicensePlateNumber = driver.findElement(By.cssSelector("input[id='licenseplatenumber']"));
        inputAnnualMileage = driver.findElement(By.cssSelector("input[id='annualmileage']"));
        btnNext = driver.findElement(By.cssSelector("button[id='nextenterinsurantdata']"));
        abaEnterInsurantData = driver.findElement(By.cssSelector("li[class='idealsteps-step-active']"));
    }

    public void selecionaOCampoMake(){
        wait.until(ExpectedConditions.visibilityOf(selectMake));
        this.selectMake.click();
        this.optionMake.click();
    }

    public void selecionaOCampoModel(){
        wait.until(ExpectedConditions.visibilityOf(selectModel));
        this.selectModel.click();
        this.optionModel.click();
    }

    public void preencheCampoCylinderCapacity(String cylinder){
        wait.until(ExpectedConditions.visibilityOf(inputCylinderCapacity));
        this.inputCylinderCapacity.sendKeys(cylinder);
    }
    
    public void preencheCampoEnginePerformance(String engine){
        wait.until((ExpectedConditions.visibilityOf(inputEnginePerformance)));
        this.inputEnginePerformance.sendKeys(engine);
    }

    public void preencheCampoDateOfManufacture(String date){
        wait.until(ExpectedConditions.visibilityOf(inputDateOfManufacture));
        this.inputDateOfManufacture.sendKeys(date);
    }

    public void selecionaOCampoNumberOfSeats(){
        wait.until(ExpectedConditions.visibilityOf(selectNumberOfSeats));
        this.selectNumberOfSeats.click();
        this.optionNumberOfSeats.click();
    }

    public void selecionaORadioButtonYes(){
        wait.until(ExpectedConditions.visibilityOf(radioButtonYes));
        this.radioButtonYes.click();
    }

    public void preencheOCampoNumberOfSeatsMotorCycle(){
        wait.until(ExpectedConditions.visibilityOf(selectNumberOfSeatsMotorCycle));
        this.selectNumberOfSeatsMotorCycle.click();
        this.optionNumberOfSeatsMotorCycle.click();
    }

    public void selecionaOCampoFuel(){
        wait.until(ExpectedConditions.visibilityOf(selectFuel));
        this.selectFuel.click();
        this.optionFuel.click();
    }

    public void preencheOCampoPayload(String payload){
        wait.until(ExpectedConditions.visibilityOf(inputPayload));
        this.inputPayload.sendKeys(payload);
    }

    public void preencheOCampoTotalWeight(String total){
        wait.until(ExpectedConditions.visibilityOf(inputTotalweight));
        this.inputTotalweight.sendKeys(total);
    }

    public void preencheOCampolistPrice(String list){
        wait.until(ExpectedConditions.visibilityOf(inputListPrice));
        this.inputListPrice.sendKeys(list);
    }

    public void preencheOCampolicensePlateNumber(String license){
        wait.until(ExpectedConditions.visibilityOf(inputLicensePlateNumber));
        this.inputLicensePlateNumber.sendKeys(license);
    }

    public void preencheOCampoAnnualMileage(String annual){
        wait.until(ExpectedConditions.visibilityOf(inputAnnualMileage));
        this.inputAnnualMileage.sendKeys(annual);
    }

    public void clicaNoBotaoNext(){
        wait.until(ExpectedConditions.visibilityOf(btnNext));
        this.btnNext.click();
    }

    public void verificaAbaEnterInsurantDataHabilitada(){
        Assert.assertTrue(abaEnterInsurantData.isDisplayed());
    }
}

