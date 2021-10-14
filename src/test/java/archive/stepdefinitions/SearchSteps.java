package archive.stepdefinitions;

import archive.appImplementation.Product;
import archive.appImplementation.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class SearchSteps {
    Product product;
    Search search;

    @Given("I have a search field on Best Buy Page")
    public void i_have_a_search_field_on_best_buy_page() {
        System.out.println("Step1 : i am on search page");
    }
    @When("^I search for a product with name \"([^\"]+)\" and price (\\d+)$")
    public void i_search_for_a_product_with_name_and_price(String productName, int productPrice) {
        System.out.println("Step2 : Search product with name "+productName + " and of price "+ productPrice);
        product = new Product(productName, productPrice);
    }
    @Then("Product with name Apple MacBook Pro should be displayed.")
    public void product_with_name_apple_mac_book_pro_should_be_displayed()  {
        search = new Search();
        System.out.println("Step 3: Product Search Display " + search.displayProduct(product));
    }



}
