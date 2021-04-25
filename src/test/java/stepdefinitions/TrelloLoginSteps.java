package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TrelloLoginSteps {
    
    
    private void pause(int second){
        try{
            Thread.sleep(second * 1000);

        }catch(InterruptedException ignore){
            // do nothing 
        }
    }

    @Given("^User goes to the Trello home page$")
    public void user_goes_to_the_Trello_home_page() {
        Hooks.driver().get("https://trello.com");
    }

    @Given("^User clicks on login link$")
    public void user_clicks_on_login_link() {
        By loc_login_link = By.linkText("Log in");
        WebElement loginLinkElem = Hooks.driver().findElement(loc_login_link);
        loginLinkElem.click();

    }

    @When("^User is on Login page$")
    public void user_is_on_Login_page() {
        By loc_page_banner = By.xpath("//h1[text()='Log in to Trello']");
        WebElement pageBannerElem = Hooks.driver().findElement(loc_page_banner);
        boolean isVisible = pageBannerElem.isDisplayed();
        Assert.assertTrue(isVisible);
}

    @When("^User logins to the trello with valid credentials$")
    public void user_logins_to_the_trello_with_valid_credentials()  {
        By loc_email_field = By.id("user");
        By loc_password_field = By.id("password");
        By loc_login_button = By.id("login");
        WebElement emailField = Hooks.driver().findElement(loc_email_field);
        WebElement passwordField = Hooks.driver().findElement(loc_password_field);
        WebElement loginButton = Hooks.driver().findElement(loc_login_button);
        emailField.sendKeys("michelnicholas1993@gmail.com");
        passwordField.sendKeys("Imani11234"); 
        loginButton.click();

    }

    @Then("^User should be able to see Trello boards page$")
    public void user_should_be_able_to_see_Trello_boards_page() {
        pause(3);
        By loc_page_banner = By.xpath("//h3[text()='Personal boards']");
        WebElement pageBanner = Hooks.driver().findElement(loc_page_banner);
        boolean isVisible = pageBanner.isDisplayed();
        Assert.assertTrue(isVisible);
        
        
    }


}
