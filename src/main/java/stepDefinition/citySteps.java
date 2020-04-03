package stepDefinition;

import PageObjectModel.cityPage;
import PageObjectModel.leftNav;
import cucumber.api.java.en.Given;

public class citySteps {
    leftNav lf=new leftNav();
    cityPage ct=new cityPage();
    @Given("^Click on City$")
    public void click_on_City() throws Throwable {
    lf.clickOnbuttonCity();
    }

    @Given("^Choose any value from dropdown$")
    public void choose_any_value_from_dropdown() throws Throwable {
        ct.handlingDropdown();
    }


}
