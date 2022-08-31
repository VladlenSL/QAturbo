import org.openqa.selenium.By;

public class Locators {

    //Registration__

    public static final By REGISTRATION_BUTTON = By.cssSelector("a[href='https://www.qaturbo.com/start-the-course']");
    public static final By REGISTRATION_FIRST_NAME = By.xpath("//input[@name='first-name']");
    public static final By TEXT_FIELD_EMAIL = By.xpath("//input[@name='email']");
    public static final By TEXT_FIELD_YOURGOB_TITLE = By.xpath("//input[@name='your-job title ']");
    public static final  By TEXT_FIELD_WHYDOYOUWANTTOLEARNAUTOMATION = By.xpath("//input[@name='why-do you want to learn automation?']");
    public static final  By REGISTRATION_LAST_NAME = By.xpath("//input[@name='last-name']");
    public static final By TEXT_FIELD_PHONE = By.xpath("//input[@name='phone']");
    public static final By REGISTRATION_ENGLISH_LEVEL = By.xpath("//input[@name='english-level']");
    //public static final By NEXT_Button = By.xpath("button[data-testid='buttonElement']");

    //MAINPageTests2__

    public static final By CLICK_PRICING = By.xpath("//li[contains(@data-state, 'menu false  link')]//p[text()='Pricing']");
    public static final By MONTHLY = By.xpath("//li[@data-hook='plan']//button[@data-hook='plan-cta']");
    public static final By SIGN_UP1 = By.xpath("//button[@data-hook='login-section-sign-up'][text()='Sign Up']");
    public static final By EMAIL = By.xpath("//div[@class='XRJUI']//input[@id='input_input_emailInput_SM_ROOT_COMP9']");
    public static final By PASSWORD = By.xpath("//input[@type='password']");
    //public static final By SIGN_UP = By.xpath("//button[@data-testid='buttonElement']//span[text()='Sign Up']");
    public static final By EXIT = By.xpath("//button[@aria-label='Close']");

    //IFRAME__

    public static final By MINI_CHAT = By.xpath("//iframe[@title='Wix Chat']");
    public static final By CLICK_CHATE = By.xpath("//button[@id='minimized-chat']");
    public static final By TEXT_CHATE = By.xpath("//textarea[@data-hook='input']");
    public static final By EXITE = By.xpath("//button[@data-hook='close-button']");

}
