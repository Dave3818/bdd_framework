package stepdefinitions;

import com.pages.AccountsPage;
import com.pages.LoginPage;
import com.qa.factory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import java.util.List;
import java.util.Map;

public class AccountsSteps {
    LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
    AccountsPage accountsPage;

    @Given("user has already logged in to application")
    public void userHasAlreadyLoggedInToApplication(DataTable dataTable) {
        List<Map<String,String>> userDetails = dataTable.asMaps();
        DriverFactory.getDriver().get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        accountsPage = loginPage.doLogin(userDetails.get(0).get("username"),userDetails.get(0).get("password"));
    }

    @Given("user is on Accounts page")
    public void userIsOnAccountsPage() {
        accountsPage.getAccountsPageTitle();
    }

    @Then("user gets accounts section")
    public void userGetsAccountsSection(DataTable sectionsTable) {
        List<String> sectionList = sectionsTable.asList();
        System.out.println("Expected accounts section list: " + sectionList);
        List<String> actualSectionList = accountsPage.getAccountsSectionsList();
        System.out.println("Actual accounts section list: " + actualSectionList);
        Assert.assertTrue(sectionList.containsAll(actualSectionList));

    }

    @And("accounts section count should be {int}")
    public void accountsSectionCountShouldBe(int sectionCount) {
        System.out.println("Actual accounts section count: " + accountsPage.getAccountsSectionCount());
        Assert.assertTrue(accountsPage.getAccountsSectionCount()==sectionCount);
    }
}
