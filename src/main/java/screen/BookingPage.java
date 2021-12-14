package screen;

import base.test.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class BookingPage {
    public String getHeaderValue() {
        return TestBase.getDriver().findElement(By.xpath("/html/body/div/h2")).getText();
    }

    public String verifyScreenNavigation() {
        return TestBase.getDriver().getTitle();
    }

    public void clickConfirmBooking() {
        TestBase.getDriver().findElement(By.id("btnPayment")).click();
    }

    public String getFirstNameError() {
        return TestBase.getDriver().switchTo().alert().getText();
    }

    public String getLastNameError() {
        return TestBase.getDriver().switchTo().alert().getText();

    }

    public String getEmailError() {
        return TestBase.getDriver().switchTo().alert().getText();

    }

    public String getMobError() {
        return TestBase.getDriver().switchTo().alert().getText();

    }

    public void clickOk() {
        TestBase.getDriver().switchTo().alert().accept();
    }

    public void enterFirstName(String string) {
        TestBase.getDriver().findElement(By.xpath("//*[@id=\"txtFirstName\"]")).sendKeys(string);
    }

    public void enterMobNo(String string) {
        TestBase.getDriver().findElement(By.xpath("//*[@id=\"txtPhone\"]")).sendKeys(string);

    }

    public void enterAddress(String string) {
        TestBase.getDriver().findElement(By.xpath("/html/body/div/div/form/table/tbody/tr[6]/td[2]/textarea")).sendKeys(string);

    }

    public void enterLastmane(String string) {
        TestBase.getDriver().findElement(By.xpath("//*[@id=\"txtLastName\"]")).sendKeys(string);
    }

    public void email(String string) {
        TestBase.getDriver().findElement(By.xpath("//*[@id=\"txtEmail\"]")).sendKeys(string);

    }

    public void enterCardNo(String string) {
        TestBase.getDriver().findElement(By.xpath("//*[@id=\"txtDebit\"]")).sendKeys(string);

    }

    public void enterCardExpMonth(String string) {
        TestBase.getDriver().findElement(By.xpath("//*[@id=\"txtMonth\"]")).sendKeys(string);

    }

    public void enterCardExpYear(String string) {
        TestBase.getDriver().findElement(By.xpath("//*[@id=\"txtYear\"]")).sendKeys(string);

    }

    public void enterCVV(String string) {
        TestBase.getDriver().findElement(By.xpath("//*[@id=\"txtCvv\"]")).sendKeys(string);


    }

    public void EnterCardName(String string) {
        TestBase.getDriver().findElement(By.xpath("//*[@id=\"txtCardholderName\"]")).sendKeys(string);

    }

    public void selectCity(String string) {
        Select city = new Select(TestBase.getDriver().findElement(By.xpath("/html/body/div/div/form/table/tbody/tr[7]/td[2]/select")));
        city.selectByValue(string);
    }

    public void selectState(String string) {
        Select state = new Select(TestBase.getDriver().findElement(By.xpath("/html/body/div/div/form/table/tbody/tr[8]/td[2]/select")));
        state.selectByValue(string);
    }

    public void selectPeople(String string) {
        Select people = new Select(TestBase.getDriver().findElement(By.xpath("/html/body/div/div/form/table/tbody/tr[10]/td[2]/select")));
        people.selectByValue(string);
    }
}
