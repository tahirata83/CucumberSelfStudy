package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class countryPage extends AbstractClass {
    private WebDriver driver ;

    public countryPage(){
        driver = Driver.getDriver();
        PageFactory.initElements( driver , this );
    }



    @FindBy(xpath="//mat-dialog-container//ms-text-field[@placeholder='GENERAL.FIELD.NAME']//input")
    private WebElement countryInputName;

    @FindBy(xpath = "//mat-dialog-container//ms-text-field[@placeholder='GENERAL.FIELD.CODE']//input")
    private WebElement countryInputCode;


    public void typeIntheCountryInputName(String name){
        sendkeysFunction(countryInputName,name);
    }

    public  void typeInthecountryInputCode(String code){
        sendkeysFunction(countryInputCode,code);
    }
}
