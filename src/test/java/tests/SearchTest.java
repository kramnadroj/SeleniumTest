package tests;

import io.cucumber.java.en.Given;

public class SearchTest {

    public SearchTest(){}

    @Given("the browser is opened on google.com")
    public void the_browser_is_opened_on_google_com() {
        System.out.println("Search Step");
    }
}
