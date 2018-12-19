package globalhub;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class base{

        public static WebDriver driver;
        public void openBrowser()
        {

            System.setProperty("WebDriver.chrome.driver","C:\\Users\\zubair\\Downloads\\chromedriver.exe");
            driver=new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().window().maximize();


        }

        public void closeBrowser()
        {
            driver.close();

        }
}

public class Homepage {

    WebDriver driver;
    @FindBy(linkText = "")
    public WebElement BuyTab;
     public Homepage(WebDriver driver)
     {
         this.driver=driver;
         PageFactory.initElements(driver,this);
     }

}

reg page
package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registerpage {
    WebDriver driver;

    @FindBy(id = "customer first name")
    public WebElement idTxtfld;

    @FindBy(id = "address_type_id")
    public WebElement IdTxtfld;

    @FindBy(linkText = "")
    public WebElement validateregisterpage;


    public registerpage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

}

exeeeeeeeeeee

package Stepexe;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import globalhub.base;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import pages.Homepage;
import pages.registerpage;

import static org.testng.Assert.assertEquals;

public class Action extends base {
    Homepage hp=new Homepage(driver);
    registerpage  rp=new registerpage(driver);

    public void iam_on_home_page(){
        driver.get("https://ludlowthompsonltd.com");

    }


    public void hover_on_Buy() {

        Actions act=new Actions(driver);
        act.moveToElement(driver.findElement(By.linkText("Buy"))).perform();
        hp.BuyTab.click();


    }



    public void click_register(){
        Actions act=new Actions(driver);
        act.moveToElement(driver.findElement(By.linkText("Buy"))).perform();
        driver.findElement(By.xpath("Resgister for property")).click();

    }


    public void enter_name(){
     rp.IdTxtfld.sendKeys("neelofar");

    }


    public void enter_address(){
     rp.idTxtfld.sendKeys("redbridge court");
    }


    public void validate_register_page(){


        String message=rp.validateregisterpage.getText();


        assertEquals("MY LT ACCOUNT" , message);

    }

}


testt======================

step def
package stepdefpkg;


import Stepexe.Action;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefclass {

    Action act= new Action();



    @Given("^Iam on home page$")
    public void iam_on_home_page(){
        act.iam_on_home_page();

    }

    @When("^hover on Buy$")
    public void hover_on_Buy() {
        act.hover_on_Buy();
    }


    @When("^click register$")
    public void click_register(){
        act.click_register();

    }

    @When("^enter name$")
    public void enter_name(){
        act.enter_name();

    }

    @When("^enter address$")
    public void enter_address(){
        act.enter_address();
    }

    @Then("^validate register page$")
    public void validate_register_page(){
        act.validate_register_page();
    }

}

run================

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features ="." ,dryRun = false , strict=true)

public class Run1 {
}

test frame work

import cucumber.api.java.After;
import cucumber.api.java.Before;
import globalhub.base;

public class Testframework {
    base b1 = new base();


    @Before
    public void begin() {
        b1. openBrowser();
    }

    @After
    public void close() {
        b1.closeBrowser();
    }
}



}

