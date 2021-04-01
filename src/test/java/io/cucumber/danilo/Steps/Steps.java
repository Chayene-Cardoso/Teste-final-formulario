package io.cucumber.danilo.Steps;

import io.cucumber.danilo.PageObjects.EnterInsurantDataPageObject;
import io.cucumber.danilo.PageObjects.EnterProductDataPageObject;
import io.cucumber.danilo.PageObjects.SelectPriceOptionPageObject;
import io.cucumber.danilo.PageObjects.SendQuotePageObject;
import io.cucumber.danilo.PageObjects.VehicleDataPageObject;
import io.cucumber.java.After;
import io.cucumber.java.it.Data;
import io.cucumber.java.pt.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class Steps {

    public static WebDriver driver;

    private VehicleDataPageObject vehicleDataPageObject;
    private EnterInsurantDataPageObject enterInsurantDataPageObject;
    private EnterProductDataPageObject enterProductDataPageObject;
    private SelectPriceOptionPageObject selectPriceOptionPageObject;
    private SendQuotePageObject sendQuotePageObject;

    public Steps(){
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        ChromeDriverService service = new ChromeDriverService
                                                        .Builder()
                                                        .withWhitelistedIps("")
                                                        .build();
        driver = new ChromeDriver(service);
    }

    @Dado("que estou na pagina {string}")
    public void queEstouNaPagina(String pagina) {
        driver.get(pagina);
        vehicleDataPageObject = new VehicleDataPageObject(driver);
    }

    @Quando("eu selecionar uma opcao no campo Make")
    public void euSelecionarUmaOpcaoNoCampoMake() {
        vehicleDataPageObject.selecionaOCampoMake();
    }

    @Quando("selecionar uma opcao no campo Model")
    public void selecionarUmaOpcaoNoCampoModel() {
        vehicleDataPageObject.selecionaOCampoModel();
    }

    @Quando("informar a performance {string} no campo Engine Performance")
    public void informarAPerformanceNoCampoEnginePerformance(String performance) {
        vehicleDataPageObject.preencheCampoEnginePerformance(performance);
    }

    @Quando("informar a data {string} no campo Date of Manufacture")
    public void informarADataNoCampoDateOfManufacture(String data) {
        vehicleDataPageObject.preencheCampoDateOfManufacture(data);
    }

    @Quando("selecionar a opcao {string} no campo Number of Seats")
    public void selecionarAOpcaoNoCampoNumberOfSeats(String seats) {
        vehicleDataPageObject.selecionaOCampoNumberOfSeats();
    }

    @Quando("selecionar a opcao {string} no campo Fuel Type")
    public void selecionarAOpcaoNoCampoFuelType(String arg0) {
        vehicleDataPageObject.selecionaOCampoFuel();
    }

    @Quando("informar o valor {string} no campo List Price")
    public void informarOValorNoCampoListPrice(String valor) {
        vehicleDataPageObject.preencheOCampolistPrice(valor);
    }

    @Quando("informar o dado {string} no campo License Plate Number")
    public void informarODadoNoCampoLicensePlateNumber(String license) {
        vehicleDataPageObject.preencheOCampolicensePlateNumber(license);
    }

    @Quando("informar o valor {string} no campo Annual Mileage")
    public void informarOValorNoCampoAnnualMileage(String annual) {
        vehicleDataPageObject.preencheOCampoAnnualMileage(annual);
    }

    @Entao("clicar no botao Next")
    public void clicarNoBotao() {
        vehicleDataPageObject.clicaNoBotaoNext();
    }

    @Dado("eu devo visualizar a aba {string}")
    public void euDevoVisualizarAAba() {
        vehicleDataPageObject.verificaAbaEnterInsurantDataHabilitada();
    }
    
    
    @Quando("informar o nome {string} no campo First Name")
    public void informar_o_nome_no_campo_First_Name(String first) {
       enterInsurantDataPageObject.preencheOCampoFirstName(first);
    }
    
    @Quando("informar o sobrenome {string} no campo Last Name")
    public void informar_o_sobrenome_no_campo_Last_Name(String last) {
        enterInsurantDataPageObject.preencheOCampoLastName(last);
    }
    
    @Quando("informar a data {string} no campo Date of Birth")
    public void informar_a_data_no_campo_Date_of_Birth(String birth) {
        enterInsurantDataPageObject.preencheOCampobirthDate(birth);
    }
    
    @Quando("selecionar a opcao female no campo Gender")
    public void selecionar_a_opcao_female_no_campo_Gender(String female) {
        enterInsurantDataPageObject.selecionaGenderFemaleButtonFemale(female);
    }
    
    @Quando("informar o endereco {string} no campo Street Address")
    public void informar_o_endereco_no_campo_Street_Address(String street) {
        enterInsurantDataPageObject.selecionaOCampoStreetAddress(street);
    }
    
    @Quando("selecionar a opcao Brazil no campo Country")
    public void selecionar_a_opcao_Brazil_no_campo_Country() {
        enterInsurantDataPageObject.country();
    }
    
    @Quando("informar o cep {string} no campo Zip Code")
    public void informar_o_cep_no_campo_Zip_Code(String zip) {
       enterInsurantDataPageObject.zipCode(zip);
    }
    
    @Quando("informar a cidade {string} no campo City")
    public void informar_a_cidade_no_campo_City(String city) {
        enterInsurantDataPageObject.city(city);
    }
    
    @Quando("selecionar a opcao Employee no campo Occupation")
    public void selecionar_a_opcao_Employee_no_campo_Occupation() {
       enterInsurantDataPageObject.occupation();
    }
    
    @Quando("clicar na opcao Speeding no campo Hobbies")
    public void clicar_na_opcao_Speeding_no_campo_Hobbies() {
        enterInsurantDataPageObject.speeding();
    }
    
    @Entao("clicar no botao Next")
    public void clicar_no_botao_Next() {
        enterInsurantDataPageObject.nextEnterproductData();
    }

    @Dado("que eu estou na aba {string}")
    public void que_eu_estou_na_aba(String string) {
        enterProductDataPageObject = new EnterProductDataPageObject(driver);
    }

    @Dado("informar a data {string} no campo Start Date")
    public void informar_a_data_no_campo_Start_Date(String star) {
        enterProductDataPageObject.starDate(star);
    }

    @Dado("selecionar a opcao {int} no campo Insurance Sum")
    public void selecionar_a_opcao_no_campo_Insurance_Sum(Integer int1) {
        enterProductDataPageObject.insuranceSum();
    }

    @Dado("selecionar a opcao Bonus {int} no campo Merit Rating")
    public void selecionar_a_opcao_Bonus_no_campo_Merit_Rating(Integer int1) {
        enterProductDataPageObject.meritrating();
    }

    @Dado("seleciocar a opcao No Coverage no campo Damage Insurance")
    public void seleciocar_a_opcao_No_Coverage_no_campo_Damage_Insurance() {
        enterProductDataPageObject.damageInsurance();
    }

    @Dado("selecionar a opcao Euro Protection no campo Optional Products")
    public void selecionar_a_opcao_Euro_Protection_no_campo_Optional_Products(String euroProtection) {
        enterProductDataPageObject.euroProtection(euroProtection);
    }

    @Dado("selecionar a opcao Yes no campo Courtesy Car")
    public void selecionar_a_opcao_Yes_no_campo_Courtesy_Car() {
        enterProductDataPageObject.courtesyCar();
    }

    @Entao("clicar novamente no botao Next")
    public void clicar_novamente_no_botao_Next() {
        enterProductDataPageObject.nextSelectPriceOption();
    }

    @Dado("que eu estou na parte {string}")
    public void que_eu_estou_na_parte(String string) {
        selectPriceOptionPageObject = new SelectPriceOptionPageObject(driver);
    }

    @Dado("selecionar a opcao Ultimate no campo Select Option")
    public void selecionar_a_opcao_Ultimate_no_campo_Select_Option() {
        selectPriceOptionPageObject.selectUltimate();
    }

    @Entao("clicar na parte do botao Next")
    public void clicar_na_parte_do_botao_Next() {
        selectPriceOptionPageObject.btnNext();
    }

    @Dado("que estou na ultima aba {string}")
    public void que_estou_na_ultima_aba() {
        sendQuotePageObject = new SendQuotePageObject(driver);
    }

    @Dado("informar o email {string} no campo E-mail")
    public void informar_o_email_no_campo_E_mail(String email) {
        sendQuotePageObject.email(email);
    }

    @Dado("informar username {string} no campo Username")
    public void informar_username_no_campo_Username(String user) {
        sendQuotePageObject.userName(user);
    }

    @Dado("informar o password {string} no campo Password")
    public void informar_o_password_no_campo_Password(String password) {
       sendQuotePageObject.password(password);
    }

    @Dado("informar o password {string} no campo Confirm Password")
    public void informar_o_password_no_campo_Confirm_Password(String confirm) {
        sendQuotePageObject.confirmPassword(confirm);
    }

    @Dado("clicar no botao Send")
    public void clicar_no_botao_Send() {
        sendQuotePageObject.sendemail();
    }
    
    @After
    public void fim() {
        if (driver != null) {
            driver.quit();
        }
    }
}
