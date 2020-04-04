package stepDefinition;

import PageObjectModel.discountPage;
import PageObjectModel.leftNav;
import cucumber.api.java.en.Given;

public class discountSteps {
    leftNav lv = new leftNav();
    discountPage dp = new discountPage();

    @Given("^Click on Discount$")
    public void click_on_Discount() throws Throwable {
        lv.clickOnDiscounts();
    }

    @Given("^Type in the Description \"(.*?)\"$")
    public void type_in_the_Description(String description) throws Throwable {
        dp.typeInthedescription(description);
    }

    @Given("^Type in the IntegrationCode \"(.*?)\"$")
    public void type_in_the_IntegrationCode(String intCode) throws Throwable {
        dp.typeInIntegrationCode(intCode);
    }

    @Given("^Type in the priority \"(.*?)\"$")
    public void type_in_the_priority(String priority) throws Throwable {
        dp.typeIninputPriority(priority);
    }


}
