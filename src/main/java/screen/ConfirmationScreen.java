package screen;

import base.test.TestBase;
import org.openqa.selenium.By;

public class ConfirmationScreen {

    public String verifyScreen() {
        return TestBase.getDriver().findElement(By.xpath("/html/body/h1")).getText();
    }
}
