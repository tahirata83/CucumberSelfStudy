package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class discountPage extends AbstractClass {
    private WebDriver driver ;

    public discountPage(){
        driver = Driver.getDriver();
        PageFactory.initElements( driver , this );
    }
    @FindBy(xpath = "//mat-dialog-container//ms-text-field[@placeholder='DISCOUNT.TITLE.DESCRIPTION']//input")
    private WebElement description;

    @FindBy(xpath = "//ms-dialog-content//ms-text-field[@placeholder='GENERAL.FIELD.INTEGRATION_CODE']//input")
    private WebElement inputIntegrationCode;

    @FindBy(xpath = "//ms-dialog-content//ms-text-field[@placeholder='GENERAL.FIELD.PRIORITY']//input")
    private WebElement inputPriority;

    public void typeInthedescription(String name){
        sendkeysFunction( description , name );
    }

    public void typeInIntegrationCode(String intCode){
        sendkeysFunction( inputIntegrationCode , intCode );
    }
    public void typeIninputPriority(String priority){
        sendkeysFunction( inputPriority , priority );
    }


}
