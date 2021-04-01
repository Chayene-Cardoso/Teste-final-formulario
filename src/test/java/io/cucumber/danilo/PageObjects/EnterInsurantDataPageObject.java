package io.cucumber.danilo.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class EnterInsurantDataPageObject {

    private WebDriver driver;
    private WebDriverWait wait;
    private WebElement inputFirstName;
    private WebElement inputLastName;
    private WebElement inputBirthDate;
    private WebElement genderFemaleButtonFemale;
    private WebElement inputStreetAddress;
    private WebElement selectCountry;
    private WebElement optionCountry;
    private WebElement inputZipCode;
    private WebElement inputCity;
    private WebElement selectOccupation;
    private WebElement optionOccupation;
    private WebElement buttonSpeeding;
    private WebElement nextEnterProductData;

    public EnterInsurantDataPageObject(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.carregarElementos();
    }

    private void carregarElementos() {
        inputFirstName = driver.findElement(By.cssSelector("input[id='firstname']"));
        inputLastName = driver.findElement(By.cssSelector("input[id='lastname']"));
        inputBirthDate = driver.findElement(By.cssSelector("input[id='birthdate']"));
        genderFemaleButtonFemale = driver.findElement(By.cssSelector("input[id='genderfemale']"));
        inputStreetAddress = driver.findElement(By.cssSelector("input[id='streetaddress']"));
        selectCountry = driver.findElement(By.cssSelector("select[id='country']"));
        optionCountry = driver.findElement(By.cssSelector("option[value='Brazil']"));
        inputZipCode = driver.findElement(By.cssSelector("input[id='zipcode']"));
        inputCity = driver.findElement(By.cssSelector("input[id='city']"));
        selectOccupation = driver.findElement(By.cssSelector("select[id='country']"));
        optionOccupation = driver.findElement(By.cssSelector("option[value='Employee']"));
        buttonSpeeding = driver.findElement(By.cssSelector("input[id='speeding'] + span[class='ideal-check']"));
        nextEnterProductData = driver.findElement(By.cssSelector("button[id='nextenterproductdata']"));
    }

    public void preencheOCampoFirstName(String first) {
        wait.until(ExpectedConditions.visibilityOf(inputFirstName));
        this.inputFirstName.sendKeys(first);
    }

    public void preencheOCampoLastName(String last) {
        wait.until(ExpectedConditions.visibilityOf(inputLastName));
        this.inputLastName.sendKeys(last);
    }

    public void preencheOCampobirthDate(String birth) {
        wait.until(ExpectedConditions.visibilityOf(inputBirthDate));
        this.inputBirthDate.sendKeys(birth);
    }

    public void selecionaGenderFemaleButtonFemale(String female) {
        wait.until(ExpectedConditions.visibilityOf(genderFemaleButtonFemale));
        this.genderFemaleButtonFemale.sendKeys(female);
    }

    public void selecionaOCampoStreetAddress(String street) {
        wait.until(ExpectedConditions.visibilityOf(inputStreetAddress));
        this.inputStreetAddress.sendKeys(street);
    }

    public void country() {
        wait.until(ExpectedConditions.visibilityOf(selectCountry));
        this.selectCountry.click();
        this.optionCountry.click();
    }

    public void zipCode(String zip) {
        wait.until(ExpectedConditions.visibilityOf(inputZipCode));
        this.inputZipCode.sendKeys(zip);
    }

    public void city(String city) {
        wait.until(ExpectedConditions.visibilityOf(inputCity));
        this.inputCity.sendKeys(city);
    }

    public void occupation() {
        wait.until(ExpectedConditions.visibilityOf(selectOccupation));
        this.selectOccupation.click();
        this.optionOccupation.click();
    }

    public void speeding() {
        wait.until(ExpectedConditions.visibilityOf(buttonSpeeding));
        this.buttonSpeeding.click();
    }

    public void nextEnterproductData() {
        wait.until(ExpectedConditions.visibilityOf(nextEnterProductData));
        this.nextEnterProductData.click();
    }
}
