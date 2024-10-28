package StepDef;

import org.junit.Assert;

import HomePage.Homepage;
import Reports.PageObjectManage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilis.TestContextSetup;



public class testSteps {
    TestContextSetup testContextSetup;
    Homepage homepage;
    PageObjectManage pageObjectManage;
    public testSteps(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.homepage = testContextSetup.pageObjectManager.getHomePage();
    }


    @Given("User Click on sheba logo")
    public void UserClickOnshebaLogo() throws InterruptedException {
        Thread.sleep(2000);

        Assert.assertTrue(homepage.getSearchIcon().isDisplayed());
        homepage.getSearchIcon().click();
    }


    @Then("User return to home page")
    public void setHomepage() throws InterruptedException {

        homepage.getSearchIcon().isDisplayed();
        Thread.sleep(1000);

    }


    @Given("Check Health and  care is available in Category item section")
    public void Health() throws InterruptedException {

        homepage.gethealth().isDisplayed();
        Thread.sleep(1000);
    }

    @When("Click on health button")
    public void clickOnHealthButton() throws InterruptedException {
        Thread.sleep(3000);
        homepage.gethealth().click();
        Thread.sleep(2000);

    }

    @Then("Check best deal is Displayed")
    public void checkbestdealIsDisplayed() throws InterruptedException {

        homepage.bestdeal().isDisplayed();
        Thread.sleep(2000);

    }


//    @And("Click on best deal button")
//    public void Clickonbestdealbutton() throws InterruptedException {
//        homepage.getbest().click();
//        Thread.sleep(2000);
//    }

//  number3

    @Given("Check All Services work properly")
    public void All() throws InterruptedException {

        homepage.All().isDisplayed();
        Thread.sleep(1000);
    }

    @When("Click on All Services button")
    public void clickAllServicesButton() throws InterruptedException {
        Thread.sleep(3000);
        homepage.All().click();
        Thread.sleep(2000);

    }

    @Then("Check All Services is Displayed")
    public void checkAllServicesIsDisplayed() throws InterruptedException {

        homepage.AC().isDisplayed();
        Thread.sleep(2000);

    }

    @Then("Check if AC Repair is visible")
    public void checkIfACRepairIsVisible() throws InterruptedException {
        homepage.AC().isDisplayed();
        Thread.sleep(2000);
    }
// number 4


    @Given("Check location works properly")
    public void checkLocationWorksProperly() throws InterruptedException {
        homepage.location().isDisplayed();
        Thread.sleep(1000);
    }

    @When("Click on location button")
    public void clickOnLocationButton() throws InterruptedException {
        homepage.location().click();
        Thread.sleep(1000);
    }


    @Then("Check if dhaka is visible")
    public void checkIfDhakaIsVisible() throws InterruptedException {
        homepage.location().isDisplayed();
        Thread.sleep(1000);

    }
//five number


    @Given("Check search works properly")
    public void checkSearchWorksProperly() throws InterruptedException {
        homepage.search().isDisplayed();
        Thread.sleep(1000);
    }


    @When("Click on search button")
    public void clickOnSearchButton() throws InterruptedException {
        homepage.search().click();
        Thread.sleep(1000);
    }


    @Then("Check if salon is visible")
    public void checkIfSalonIsVisible() throws InterruptedException {
        homepage.salon().isDisplayed();
        Thread.sleep(1000);
    }
}
