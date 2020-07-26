package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)


public class stepDefinition {
	
	/*The "Wordings" in the @Given() annotation in the "stepDefinition.java" SHOULD ALWAYS EXACTLY MATCH with the "wordings" in 
	 "Login.feature" "Given" Keyword. */
    @Given("^User should be on Netbanking landing page$")
    public void user_should_be_on_netbanking_landing_page() throws Throwable 
	{
		//Write the code to login to "www.bankofamerica.com" landing page
    	
    	System.out.println("Selenium to Land in 'www.bankofamerica.com' Home Page:");
	}
	
	
	
	/*The "Wordings" in the @When() annotation in the "stepDefinition.java" SHOULD ALWAYS EXACTLY MATCH with the "wordings" in 
	 "Login.feature" "When" Keyword. 
	 
	 Note that there are two scenarios/test cases with different value of username and
	 password in "Login.feature" file where parameterization is used by double quotes "" in the feature file. 
	 For the double quotes "" in the 'feature' file, the "Step Defintion File" we used \"([^\"]*)\" as regular expressions
	 to parameterize the value of two different username and password from "Login.feature" file. This is common syntax
	 in "Cucumber Framework" for Parameterization.*/
    
    @When("^User login into the application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_the_application_with_username_something_and_password_something(String strArg1, String strArg2) throws Throwable 
    {
       	//Write the code to enter the username and password, click submit button
    	
    	System.out.println("The username is :" +strArg1);
    	System.out.println("The password is :" +strArg2);
    	
    	System.out.println("Selenium to enter the username & Password, then click Submit button");

    }

    
    
    /*The "Wordings" in the @Then() annotation in the "stepDefinition.java" SHOULD ALWAYS EXACTLY MATCH with the "wordings" in 
	 "Login.feature" "Then" Keyword. */
    @Then("^User should land on HomePage$")
    public void user_should_land_on_homepage() throws Throwable {
        
    	//Write the code to land on the "Home Page" of Bank of America after login
    	
    	System.out.println("Selenium should land on Home Page of Bank of America after login");
    	
    }

    
    /*The "Wordings" in the @And() annotation in the "stepDefinition.java" SHOULD ALWAYS EXACTLY MATCH with the "wordings" in 
	 "Login.feature" "And" Keyword. */
    
    /* Note that there are two scenarios/test cases with different value of CreditCard Details in "Login.feature" file 
     where parameterization is used by double quotes "" in the feature file.  For the double quotes "" in the 'feature' 
     file, the "Step Defintion File" we used \"([^\"]*)\" as regular expressions to parameterize the value of two 
     different value of creditcard details from "Login.feature" file. This is common syntax in "Cucumber Framework" for 
     Parameterization.*/
    
    @And("^CreditCard details displayed are \"([^\"]*)\"$")
    public void creditcard_details_displayed_are_something(String strArg1) throws Throwable {
    	
	if(strArg1.equals(true))	
    {	
	//Write the Selenium code to verify whether all credit cards details are being displayed
	
	System.out.println("Is All credit Card to be displayed? :" +strArg1);	
    System.out.println("Selenium to check whether all the credit card details are being displayed");
    }
	
	else
	{
	//Write the Selenium code to verify whether none of credit cards details are being displayed
		
	System.out.println("Is All credit Card to be displayed? :" +strArg1);	
	System.out.println("Selenium to check whether none of the credit card details are being displayed");
	System.out.println();
	    	
		
	}
    
    
    }
	
	
	
}





