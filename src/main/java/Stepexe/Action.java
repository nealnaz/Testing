package Stepexe;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import globalhub.base;
import org.apache.xpath.operations.String;
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


        String message= rp.validateregisterpage.getText();


        assertEquals("MY LT ACCOUNT" , message);

    }

}

