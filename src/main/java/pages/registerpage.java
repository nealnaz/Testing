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
