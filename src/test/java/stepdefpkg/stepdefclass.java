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