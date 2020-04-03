package stepDefinition;

import PageObjectModel.applicationPage;
import PageObjectModel.countryPage;
import PageObjectModel.leftNav;
import PageObjectModel.signInPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.Driver;
import utilities.ReadPropertiesFile;

import java.util.concurrent.TimeUnit;

public class countrySteps {
   WebDriver driver;
   signInPage sip= new signInPage();
   leftNav lf=new leftNav();
   countryPage cp=new countryPage();
   applicationPage ap=new applicationPage();

    @Given("^Go to mersys website$")
    public void go_to_mersys_website() throws Throwable {
       // System.setProperty( "webdriver.chrome.driver", "C:/Users/hatadurdyyev/Desktop/Selenium/ChromeDriver/chromedriver.exe" );
      //  ChromeDriverManager.chromedriver().setup();
      //  driver = new ChromeDriver();
        driver= Driver.getDriver();
        driver.get(ReadPropertiesFile.getData("URL"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @And("^Type the username and password and click on login button$")
    public void type_the_username_and_password_and_click_on_login_button() throws Throwable {
       sip.typeInInputUsername();
       sip.typeInInputPassword();
       sip.clickOnButtonLogin();
    }

    @Given("^Click on Setup on top$")
    public void click_on_Setup_on_top() throws Throwable {
        lf.clickDropdownSetup();
    }

    @Given("^Click on parameter$")
    public void click_on_parameter() throws Throwable {
        lf.clickDropdownParameters();
    }

    @Given("^Click on Countries$")
    public void click_on_Countries() throws Throwable {
        lf.clickDropdownCountries();
    }

    @Given("^Click on plus icon$")
    public void click_on_plus_icon() throws Throwable {
    ap.clickPlusButton();
    }
    @Given("^Type in the Name \"(.*?)\"$")
    public void type_in_the_Name(String name) throws Throwable {
        cp.typeIntheCountryInputName(name);
    }

    @Given("^Type in the code \"(.*?)\"$")
    public void type_in_the_code(String code) throws Throwable {
       cp.typeInthecountryInputCode(code);
    }

    @When("^Click on save button$")
    public void click_on_save_button() throws Throwable {
    ap.clickSaveButton();
    }

   @Then("^\"(.*?)\" should be displayed$")
    public void should_be_displayed(String name) throws Throwable {
    ap.nameIsCreated(name);
   }

   // Then "CucumberCountry" should be displayed

}
