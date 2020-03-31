package stepDefinition;

import PageObjectModel.leftNav;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;


public class subjectCategories {
    leftNav ls =new leftNav();

    @When("^Click on subject categories$")
    public void click_on_subject_categories() throws Throwable {
        ls.clickSubjectCategories();
    }

    @Then("^Subject Categories page should be displayed$")
    public void subject_Categories_page_should_be_displayed() throws Throwable {
        Thread.sleep(2000);
        String currentURL=ls.getURL();
        System.out.println(currentURL);
        Assert.assertTrue(currentURL.contains("subject-categories"));
    }


}
