import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage extends BaseActions{

    public MainPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }

    public void clickJoinButton(){
        driver.findElement(Locators.REGISTRATION_BUTTON).click();
    }

    public void clickGalleryLink(){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.GALLERY_LINK)));
        driver.findElement(Locators.GALLERY_LINK);
    }

    public void switchToYoutubeFrame(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement youtubeIframe = driver.findElement(Locators.youtubeFrameLocator); //Locator is updated
        driver.switchTo().frame(youtubeIframe);
    }

    public void clickPlayYoutube(){
        driver.findElement(Locators.playYoutubeButton).click();
    }


}
