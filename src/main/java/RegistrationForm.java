import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegistrationForm extends BaseActions {

    public RegistrationForm(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }


    public void completeFirstPartOfRegistration() {
        driver.findElement(Locators.textFieldEmail).sendKeys(Data.email);
        driver.findElement(Locators.textFieldPassword).sendKeys(Data.password);
        driver.findElement(Locators.nextButton).click();
    }

    public void completeSecondPartOfRegistration() {
        driver.findElement(Locators.nicknameTextField).sendKeys(Data.nickname);
        driver.findElement(Locators.dayDropDown).click();
        driver.findElement(Locators.selectedDay).click();
        driver.findElement(Locators.confirmationCheckbox).click();
        driver.findElement(Locators.regionNameAutocomplete).clear();
        driver.findElement(Locators.regionNameAutocomplete).sendKeys(Data.city);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.regionSelect)));
        //driver.findElement(Locators.selectedCapitalOfUkraine).click();

    }

}
