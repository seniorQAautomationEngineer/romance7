import org.openqa.selenium.By;

public class Locators {


    //Registration

    public static final By REGISTRATION_BUTTON = By.cssSelector("button[id='show-registration-block']");

    public static final By textFieldEmail = By.cssSelector("input[id='email']");
    public static final By textFieldPassword = By.cssSelector("input[id='password']");
    public static final By nextButton = By.xpath("//button[@data-action='next-page'][text()='Next']");
    public static final By nicknameTextField = By.xpath("//input[@id='nickname']");
    public static final By dayDropDown = By.xpath("//div[@id='daySelect']");
    public static final By selectedDay = By.xpath("//ul[@class ='dropdown-menu show']//li[@data-value='22']");
    public static final By regionNameAutocomplete = By.xpath("//input[@name='region_name']");
    public static final By regionSelect = By.xpath("//div[contains(@id, 'region_select')]");
    public static final By selectedCapitalOfUkraine = By.xpath("//li[text()='Kiev, Ukraine']");
    public static final By confirmationCheckbox = By.xpath("//input[@id='confirmation']");
    public static final By youtubeFrameLocator = By.xpath("//iframe[@src='https://www.youtube.com/embed/RRECuJzm3IY?start=85']");
    public static final By playYoutubeButton = By.xpath("//button[@class='ytp-large-play-button ytp-button']");
}
