package stepdefinitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.List;

public class TrelloCredentialsSteps {

    private void pause(int second) {
        try {
            Thread.sleep(second * 1000);

        } catch (InterruptedException ignore) {
            // do nothing
        }
    }

    @Given("^user goes to the Sign up page$")
    public void user_goes_to_the_Sign_up_page() {
        pause(2);
        WebElement signUpLink = Hooks.driver().findElement(By.linkText("Sign up"));
        signUpLink.click();

    }

    @Given("^user clicks on login link$")
    public void user_clicks_on_login_link() {
        WebElement loginLink = Hooks.driver().findElement(By.xpath("//span[@class='bottom-form-link']/a"));
        loginLink.click();
        pause(2);

    }

    @When("^user enters email and password for verified users$")
    public void user_enters_email_and_password_for_verified_users(DataTable table) {
        WebElement emailInput = Hooks.driver().findElement(By.id("user"));
        WebElement passInput = Hooks.driver().findElement(By.id("password"));

        List<List<String>> rows = table.asLists(String.class);
        // First User
        String firstUser = rows.get(0).get(0);
        String firstPass = rows.get(0).get(1);
        emailInput.sendKeys(firstUser);
        passInput.sendKeys(firstPass);
        pause(2);
        emailInput.clear();
        passInput.clear();

        // Second User
        String secondUser = rows.get(1).get(0);
        String secondPass = rows.get(1).get(1);
        emailInput.sendKeys(secondUser);
        passInput.sendKeys(secondPass);
        pause(2);
        emailInput.clear();
        passInput.clear();

        // Third User
        String thirdUser = rows.get(2).get(0);
        String thirdPass = rows.get(2).get(1);
        emailInput.sendKeys(thirdUser);
        passInput.sendKeys(thirdPass);
        pause(2);
        emailInput.clear();
        passInput.clear();

    }

    @Given("^User goes to the Trello Home page$")
    public void user_goes_to_the_Trello_Home_page()  {
        Hooks.driver().get("https://trello.com");
        
    }

    @Then("^user should not see any error$")
    public void user_should_not_see_any_error() {
        WebElement hiddenErrorTextElem = Hooks.driver().findElement(By.cssSelector("div#error[class*='hidden']"));
        boolean isVisible = hiddenErrorTextElem.isDisplayed();
        Assert.assertFalse(isVisible);

    }

}
