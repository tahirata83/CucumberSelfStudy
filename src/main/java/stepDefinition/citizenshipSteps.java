package stepDefinition;

import PageObjectModel.applicationPage;
import PageObjectModel.citizenshipPage;
import PageObjectModel.leftNav;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class citizenshipSteps {
    leftNav lf= new leftNav();
    citizenshipPage cp = new citizenshipPage();
    applicationPage ap= new applicationPage();
    @Given("^Click on citizenship$")
    public void click_on_citizenship() throws Throwable {
        lf.clickButtonCitizenship();
    }

    @Given("^Type the citizenship name \"(.*?)\"$")
    public void type_the_citizenship_name(String name) throws Throwable {
        cp.typeInTheInputCitizenName( name );
    }

    @Given("^Type the shortName \"(.*?)\"$")
    public void type_the_shortName(String shortName) throws Throwable {
        cp.typeIntheInputCitizenShortName( shortName );
    }

    @Then("^Remove the data \"(.*?)\"$")
    public void remove_the_data(String name) throws Throwable {
        ap.deletingElement(name);
    }

    @Then("^Verify data is removed \"(.*?)\"$")
    public void verify_data_is_removed(String name) throws Throwable {
        ap.verifingDeleted(name);
    }



}
