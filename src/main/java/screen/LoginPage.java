package screen;

import base.test.TestBase;
import org.openqa.selenium.By;

public class LoginPage {

    public void launchLoginPage() {
        TestBase.getDriver().get("file:///Users/sonugupta/Documents/Work/Automation/GitHub/bddHotelBooking/login.html");

    }


    public void enterUserName(String username) {
        TestBase.getDriver().findElement(By.name("userName")).sendKeys(username);
    }

    public void clickLogin() {
        TestBase.getDriver().findElement(By.xpath("//*[@id=\"mainCnt\"]/div/div/form/table/tbody/tr[4]/td[2]/input")).click();
    }

    public String getUsernameError() {
        return TestBase.getDriver().findElement(By.id("userErrMsg")).getText();


    }

    public String getPasswordError() {
        return TestBase.getDriver().findElement(By.xpath("//*[@id=\"pwdErrMsg\"]")).getText();

    }

    public void enterPassword(String string) {
        TestBase.getDriver().findElement(By.name("userPwd")).sendKeys(string);

    }

    public String getHeadervalue(String string) {
        return TestBase.getDriver().findElement(By.xpath("//*[@id=\"mainCnt\"]/div/div/h1")).getText();

    }
}
