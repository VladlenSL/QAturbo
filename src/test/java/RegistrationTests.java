import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.time.Duration;

public class RegistrationTests extends BaseUI{
    By registrationButton = By.cssSelector("a[href='https://www.qaturbo.com/start-the-course']");
    By registrationFirstName = By.cssSelector("input[name='first-name']");
    By textFieldEmail = By.cssSelector("input[name='email']");
    By textFieldYourJobTitle = By.cssSelector("input[name='your-job title ']");
    By textFieldWhydoyouwanttolearnAutomation = By.cssSelector("input[name='why-do you want to learn automation?']");
    By registrationLastName = By.cssSelector("input[name='last-name']");
    By textFieldPhone = By.cssSelector("input[name='phone']");
    By registrationEnglishLevel = By.cssSelector("input[name='english-level']");

    By nextButton = By.xpath("button[data-testid='buttonElement']");


    String FirstName = "Vladlen";
    String email = "Vladlen.Safaniyuk@gmail.com";
    String YourJobTitle = "QA Automation";
    String WhydoyouwanttolearnAutomation = "This is a new niche that I am very interested in";
    String LastName = "Safaniyuk";
    String Phone = "0953595621";
    String EnglishLevel = "Basic User";



    @Test
    public void mainPageTests1(){
        driver.findElements(registrationButton).get(0).click();
        driver.findElements(registrationFirstName).get(0).sendKeys(FirstName);
        driver.findElement(textFieldEmail).sendKeys(email);
        driver.findElement(textFieldYourJobTitle).sendKeys(YourJobTitle);
        driver.findElement(textFieldWhydoyouwanttolearnAutomation).sendKeys(WhydoyouwanttolearnAutomation);
        driver.findElement(registrationLastName).sendKeys(LastName);
        driver.findElement(textFieldPhone).sendKeys(Phone);
        driver.findElement(registrationEnglishLevel).sendKeys(EnglishLevel);
        //driver.findElements(nextButton).get(1).click();
    }
    By  Pricing = By.xpath("//p[contains(@id, 'comp')]");
    By Monthly = By.cssSelector("button[data-hook='plan-cta']");
    By SignUP = By.xpath("//button[contains(@data-hook, 'login-section-sign-up')]");
    By toEmail = By.cssSelector("input[id='input_input_emailInput_SM_ROOT_COMP9']");
    By Password = By.cssSelector("input[class='_1SOvY has-custom-focus']");
    By flex = By.xpath("//button[@class='_1fbEI']");
    By exit = By.xpath("//button[@aria-label='Close']");
    String ONEEmail = "Vladlen.Safaniyuk@gmail.com";
    String ONEPassword = "123456VL";

    @Test
    public void mainPageTests2(){
        driver.findElements(Pricing).get(2).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElements(Monthly).get(2).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(SignUP).click();
        wait.until(ExpectedConditions.elementToBeClickable(toEmail));
        driver.findElement(toEmail).sendKeys(ONEEmail);
        driver.findElements(Password).get(3).sendKeys(ONEPassword);
        driver.findElements(flex).get(1).click();
        driver.findElement(exit).click();

    }
}
