import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.time.Duration;

public class RegistrationTests extends BaseUI{
    By registrationButton = By.cssSelector("a[href='https://www.qaturbo.com/start-the-course']");
    By registrationFirstName = By.xpath("//input[@name='first-name']");
    By textFieldEmail = By.xpath("//input[@name='email']");
    By textFieldYourJobTitle = By.xpath("//input[@name='your-job title ']");
    By textFieldWhydoyouwanttolearnAutomation = By.xpath("//input[@name='why-do you want to learn automation?']");
    By registrationLastName = By.xpath("//input[@name='last-name']");
    By textFieldPhone = By.xpath("//input[@name='phone']");
    By registrationEnglishLevel = By.xpath("//input[@name='english-level']");

    By nextButton = By.xpath("button[data-testid='buttonElement']");

    String FirstName = "Vladlen";
    String email = "Vladlen.Safaniyuk@gmail.com";
    String YourJobTitle = "QA Automation";
    String WhydoyouwanttolearnAutomation = "This is a new niche that I am very interested in";
    String LastName = "Safaniyuk";
    String Phone = "0953595621";
    String EnglishLevel = "Basic User";

    @Test
    public void registrationTests1(){
        driver.findElements(registrationButton).get(0).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.findElements(registrationFirstName).get(0).sendKeys(FirstName);
        driver.findElement(textFieldEmail).sendKeys(email);
        driver.findElement(textFieldYourJobTitle).sendKeys(YourJobTitle);
        driver.findElement(textFieldWhydoyouwanttolearnAutomation).sendKeys(WhydoyouwanttolearnAutomation);
        driver.findElement(registrationLastName).sendKeys(LastName);
        driver.findElement(textFieldPhone).sendKeys(Phone);
        driver.findElement(registrationEnglishLevel).sendKeys(EnglishLevel);
        //driver.findElements(nextButton).get(1).click();
    }

    By clickPricing = By.xpath("//li[contains(@data-state, 'menu false  link')]//p[text()='Pricing']");
    By Monthly = By.xpath("//div[@data-hook='plan-cta-wrapper']//button[@data-hook='plan-cta']");
    By SignUP1 = By.xpath("//button[@data-hook='login-section-sign-up'][text()='Sign Up']");
    By Email = By.xpath("//div[@class='XRJUI']//input[@id='input_input_emailInput_SM_ROOT_COMP9']");
    By Password = By.xpath("//input[@type='password']");
    By SignUp = By.xpath("//button[@data-testid='buttonElement']//span[text()='Sign Up']");
    //By exit = By.xpath("//button[@aria-label='Close']");

    String textEmail = "Vladlen.Safaniyuk@gmail.com";
    String textPassword = "123456VL";

    @Test
    public void mainPageTests2(){
        driver.findElement(clickPricing).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        driver.findElements(Monthly).get(2).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        driver.findElement(SignUP1).click();
        driver.findElement(Email).sendKeys(textEmail);
        driver.findElement(Password).sendKeys(textPassword);
        driver.findElement(SignUp).click();
        //driver.findElement(exit).click();

    }
    By minichat = By.xpath("//iframe[@title='Wix Chat']");
    By clickChate = By.xpath("//button[@id='minimized-chat']");
    By textChate = By.xpath("//textarea[@data-hook='input']");
    By exit = By.xpath("//button[@data-hook='close-button']");

    String Mytext = "thank you very much for the lesson";

    @Test
    public void testIFrame(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(minichat));
        WebElement iframe = driver.findElement(minichat);
        driver.switchTo().frame(iframe);
        driver.findElement(clickChate).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        driver.findElement(textChate).sendKeys(Mytext);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(exit).click();

    }
}
