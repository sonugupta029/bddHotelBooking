
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import screen.BookingPage;
import screen.ConfirmationScreen;
import screen.LoginPage;

public class StepDefinitions {
    private Logger logger = LoggerFactory.getLogger(StepDefinitions.class);
    private LoginPage loginScreen = new LoginPage();
    private BookingPage bookingScreen = new BookingPage();

    @Given("user opens web page login.html page")
    public void user_opens_web_page_login_html_page() {
        loginScreen.launchLoginPage();
    }


    @Then("page header should be displayed as {string}")
    public void page_header_should_be_displayed_as(String string) {
        Assert.assertEquals(loginScreen.getHeadervalue(string), string);

    }


    @Then("click Login and verify username error message")
    public void click_Login_and_verify_username_error_message() {
        loginScreen.clickLogin();
        Assert.assertEquals("* Please enter userName.", loginScreen.getUsernameError());

    }

    @Then("click Login and verify password error message")
    public void click_Login_and_verify_password_error_message() {
        loginScreen.clickLogin();
        Assert.assertEquals("* Please enter password.", loginScreen.getPasswordError());
    }

    @Then("enter username as {string}")
    public void enter_username_as(String string) {
        loginScreen.enterUserName(string);
    }

    @Then("enter password as {string}")
    public void enter_password_as(String string) {
        loginScreen.enterPassword(string);
    }

    @Then("click Login")
    public void click_Login() {
        loginScreen.clickLogin();
    }

    @Then("user will navigate to Hotel Booking page")
    public void user_will_navigate_to_Hotel_Booking_page() {
        Assert.assertEquals("Hotel Booking", bookingScreen.verifyScreenNavigation());
    }

    @Then("verify the title {string} of the page")
    public void verify_the_title_of_the_page(String string) {

        Assert.assertEquals(string, bookingScreen.getHeaderValue());
    }

    @Then("verify firstname error message")
    public void verify_firstname_error_message() {
        bookingScreen.clickConfirmBooking();
        Assert.assertEquals("Please fill the First Name", bookingScreen.getFirstNameError());
        bookingScreen.clickOk();

    }

    @Then("verify lastname error message")
    public void verify_lastname_error_message() {
        bookingScreen.clickConfirmBooking();
        Assert.assertEquals("Please fill the Last Name", bookingScreen.getLastNameError());
        bookingScreen.clickOk();
    }

    @Then("verify email error message")
    public void verify_email_error_message() {
        bookingScreen.clickConfirmBooking();
        Assert.assertEquals("Please fill the Email", bookingScreen.getEmailError());
        bookingScreen.clickOk();
    }

    @Then("mobile Number error message")
    public void mobile_Number_error_message() {
        bookingScreen.clickConfirmBooking();
        Assert.assertEquals("Please fill the Mobile No.", bookingScreen.getMobError());
    }

    @Then("validate alertbox text {string}")
    public void validate_alertbox_text(String string) {

    }

    @Then("enter no of people as {string}")
    public void enter_no_of_people_as(String string) {
        bookingScreen.selectPeople(string);
    }

    @Then("enter city as {string}")
    public void enter_city_as(String string) {
        bookingScreen.selectCity(string);
    }


    @Then("enter card number as {string}")
    public void enter_card_number_as(String string) {
        bookingScreen.enterCardNo(string);
    }

    @Then("enter debit card month expiry as {string}")
    public void enter_debit_card_month_expiry_as(String string) {
        bookingScreen.enterCardExpMonth(string);
    }

    @Then("enter debit card year expiry as {string}")
    public void enter_debit_card_year_expiry_as(String string) {
        bookingScreen.enterCardExpYear(string);
    }

    @Then("click Confirm booking")
    public void clickConfirmBooking() {
        bookingScreen.clickConfirmBooking();
    }

    @Then("enter email as {string}")
    public void enter_email_as(String string) {
        bookingScreen.email(string);
    }

    @Then("enter lastname as {string}")
    public void enter_lastname_as(String string) {
        bookingScreen.enterLastmane(string);
    }

    @Then("enter firstname as {string}")
    public void enter_firstname_as(String string) {
        bookingScreen.enterFirstName(string);
    }

    @Then("enter mobile number as {string}")
    public void enter_mobile_number_as(String string) {
        bookingScreen.enterMobNo(string);
    }

    @Then("enter address as {string}")
    public void enter_address_as(String string) {
        bookingScreen.enterAddress(string);
    }

    @Then("enter state as {string}")
    public void enter_state_as(String string) {
        bookingScreen.selectState(string);
    }

    @Then("enter card name as {string}")
    public void enter_card_name_as(String string) {
        bookingScreen.EnterCardName(string);
    }

    @Then("enter CVV as {string}")
    public void enter_CVV_as(String string) {
        bookingScreen.enterCVV(string);
    }

    @Then("verify booking confirmation screen")
    public void verify_booking_confirmation_screen() {
        Assert.assertEquals("Booking Completed!", new ConfirmationScreen().verifyScreen());
    }
}
