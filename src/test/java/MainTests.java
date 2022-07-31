import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.time.Duration;


public class MainTests extends BaseUI{

    @Test
    public void completeRegistration() {
        mainPage.clickJoinButton();
        registrationForm.completeFirstPartOfRegistration();
        registrationForm.completeSecondPartOfRegistration();
    }

    @Test
    public void testIframe(){
        mainPage.switchToYoutubeFrame();
        mainPage.clickPlayYoutube();
    }





}