package archive.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class UserRegSteps {


    @Given("User navigates to registration page")
    public void user_navigates_to_registration_page() {
        System.out.println("User reg navigation successful");
    }
    @When("User enters following details")
    public void user_enters_following_details(DataTable dataTable) {
            List<List<String>> dataList = dataTable.asLists(String.class);
            for(List<String> e : dataList){
                System.out.println(e);
            }
    }
    @Then("User Registration should be successful")
    public void user_registration_should_be_successful() {
        System.out.println("user reg is successful");
    }


    @Given("User navigates to registration page with cols")
    public void user_navigates_to_registration_page_with_cols() {
        System.out.println("User reg navigation successful with cols");
    }
    @When("User enters following details with columns")
    public void user_enters_following_details_with_columns(DataTable dataTable) {
     List<Map<String,String>> userList = dataTable.asMaps();
     for (Map<String,String> e : userList){
         System.out.println(e.get("FirstName") + e.get("LastName") + e.get("Email") + e.get("Phone") + e.get("City"));
     }
    }
    @Then("User Registration should be successful with cols")
    public void user_registration_should_be_successful_with_cols() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user reg is successful with cols");
    }



}
