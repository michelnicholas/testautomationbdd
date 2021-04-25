package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {

    private static WebDriver driver;

    public static WebDriver driver(){
        return driver;
    }
    
    @Before
    public void beforeScenario(Scenario scenario){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @After
    public void afterScenario(Scenario scenario){
        driver.quit();

    }

    
}
