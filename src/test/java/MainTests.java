import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class MainTests extends BaseUI{



    By registrationButton = By.cssSelector("button[id='show-registration-block']");

    By textFieldEmail = By.cssSelector("input[id='email']");
    By textFieldPassword = By.cssSelector("input[id='password']");
    By nextButton = By.xpath("//button[@data-action='next-page'][text()='Next']");

    String email = "1111111111111@gmail.com";
    String password = "1234567@";



    @Test
    public void mainPageTests7() {
        driver.findElement(registrationButton).click();
        driver.findElement(textFieldEmail).sendKeys(email);
        driver.findElement(textFieldPassword).sendKeys(password);
        driver.findElement(nextButton).click();

    }

    @Test
    public void mainPageTests8() {
        driver.findElement(registrationButton).click();
        driver.findElement(textFieldEmail).sendKeys(email);
        driver.findElement(textFieldPassword).sendKeys(password);
        driver.findElement(nextButton).click();

    }





}