package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class leftNav {

   private WebDriver driver;

    public leftNav(){

        driver= Driver.getDriver();
        PageFactory.initElements( driver , this );

    }
    @FindBy(css = "fuse-navigation .group-items > .nav-item:nth-child(1)")
    private WebElement dropdownSetup;

    @FindBy(xpath = "(//span[contains(text(),'Parameters')])[1]")
    private WebElement dropdownParameters;

    @FindBy(xpath = "//span[text()='Countries']")
    private WebElement buttonCountries;

    @FindBy(xpath="//span[contains(text(),'Citizenships')]")
    private WebElement buttonCitizenship;

    @FindBy (xpath = "//span[text()='Subject Categories']")
    private WebElement buttonSubjectCategories;

    public void clickDropdownSetup(){
        dropdownSetup.click();
     }
    public void clickDropdownParameters(){
        dropdownParameters.click();
    }
    public void clickDropdownCountries(){
        buttonCountries.click();
    }
    public void clickButtonCitizenship(){ buttonCitizenship.click(); }
    public void clickSubjectCategories(){ buttonSubjectCategories.click(); }


    //return the current websiteURL
    public String getURL(){
        String url=driver.getCurrentUrl();
        return url;
    }
}

