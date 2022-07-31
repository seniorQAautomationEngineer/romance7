import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.time.Duration;


public class MainTests extends BaseUI{



    By registrationButton = By.cssSelector("button[id='show-registration-block']");

    By textFieldEmail = By.cssSelector("input[id='email']");
    By textFieldPassword = By.cssSelector("input[id='password']");
    By nextButton = By.xpath("//button[@data-action='next-page'][text()='Next']");
    By nicknameTextField = By.xpath("//input[@id='nickname']");
    By dayDropDown = By.xpath("//div[@id='daySelect']");
    By selectedDay = By.xpath("//ul[@class ='dropdown-menu show']//li[@data-value='22']");
    By regionNameAutocomplete = By.xpath("//input[@name='region_name']");
    By regionSelect = By.xpath("//div[contains(@id, 'region_select')]");
    By selectedCapitalOfUkraine = By.xpath("//li[text()='Kiev, Ukraine']");
    By confirmationCheckbox = By.xpath("//input[@id='confirmation']");
    By youtubeFrameLocator = By.xpath("//iframe[@src='https://www.youtube.com/embed/RRECuJzm3IY?start=85']");
    By playYoutubeButton = By.xpath("//button[@class='ytp-large-play-button ytp-button']");

    String email = "1111111111111@gmail.com";
    String password = "1234567@";

    String nickname = "al838383";
    String city = "Kiev";




    @Test
    public void completeRegistration() {
        driver.findElement(registrationButton).click();
        driver.findElement(textFieldEmail).sendKeys(email);
        driver.findElement(textFieldPassword).sendKeys(password);
        driver.findElement(nextButton).click();
        driver.findElement(nicknameTextField).sendKeys(nickname);
        driver.findElement(dayDropDown).click();
        driver.findElement(selectedDay).click();
        driver.findElement(confirmationCheckbox).click();
        driver.findElement(regionNameAutocomplete).clear();
        driver.findElement(regionNameAutocomplete).sendKeys(city);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(regionSelect)));
        driver.findElement(selectedCapitalOfUkraine).click();


    }


    @Test
    public void testIframe(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement youtubeIframe = driver.findElement(youtubeFrameLocator); //Locator is updated
        driver.switchTo().frame(youtubeIframe);
        driver.findElement(playYoutubeButton).click();
    }





}