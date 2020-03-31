package stepDefinition;

import PageObjectModel.leftNav;
import cucumber.api.java.en.Given;

public class citizenshipSteps {
    leftNav lf= new leftNav();

    @Given("^Click on citizenship$")
    public void click_on_citizenship() throws Throwable {
        lf.clickButtonCitizenship();
    }

}
