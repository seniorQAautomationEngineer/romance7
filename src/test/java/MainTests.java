import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MainTests extends BaseUI {

    @Test
    public void completeRegistration() {
        mainPage.clickJoinButton();
        registrationForm.completeFirstPartOfRegistration();
        registrationForm.completeSecondPartOfRegistration();
    }

    @Test
    public void testIframe() {
        mainPage.switchToYoutubeFrame();
        mainPage.clickPlayYoutube();
    }

    @Test
    public void testFooter() {
        mainPage.jsScroll(Locators.PHONE_LINK);
        mainPage.jsClick(Locators.PHONE_LINK);
    }

    @Test
    public void testMainTabs(){
        List<WebElement> tabs = driver.findElements(Locators.TAB_LINKS);
        System.out.println("Size: " +  tabs.size());
      //  List<String> actualTitles = new ArrayList<>();
        List<String> expectedTitles = new ArrayList<>(Arrays.asList("@@@@"));
        for (int i = 0; i < tabs.size(); i++) {
            if(tabs.get(i).isDisplayed()){
            String actualTitle = tabs.get(i).getText();
            if(actualTitle.contains("HOME")){
                Assert.fail("HOME tab is exist");
            }
            Assert.assertTrue(expectedTitles.contains(actualTitle), expectedTitles + " do not contain " + actualTitle);
           // actualTitles.add(title);
            tabs.get(i).click();
            driver.navigate().back();
            tabs = driver.findElements(Locators.TAB_LINKS);
            }
        }
      //  Assert.assertEquals(actualTitles, expectedTitles, "Expected list is not equal with actual");


        Assert.assertEquals("bab", "snsnsn");
        Assert.assertEquals(1, 5);
        Assert.assertEquals(true, false);

        Assert.assertTrue(driver.findElement(Locators.GALLERY_LINK).isDisplayed());
        driver.findElement(Locators.GALLERY_LINK).click();

        if(!driver.findElement(Locators.GALLERY_LINK).isDisplayed()) {
            Assert.fail("!!!!!!!!!!!");
        }

    }


}