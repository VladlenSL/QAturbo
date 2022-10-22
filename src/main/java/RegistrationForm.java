import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class RegistrationForm extends BaseActions {
        public RegistrationForm(WebDriver driver, WebDriverWait wait){
                super(driver, wait);
        }

        public void FillingInTheData() {
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
                driver.findElements(Locators.REGISTRATION_FIRST_NAME).get(0).sendKeys(Data.FIRST_NAME);
                driver.findElement(Locators.TEXT_FIELD_EMAIL).sendKeys(Data.EMAIL);
                driver.findElement(Locators.TEXT_FIELD_YOURGOB_TITLE).sendKeys(Data.YOUR_JOB_TITLE);
                driver.findElement(Locators.TEXT_FIELD_WHYDOYOUWANTTOLEARNAUTOMATION).sendKeys(Data.WHY_dOYOU_WANT_TOLEARN_AUTOMATION);
                driver.findElement(Locators.REGISTRATION_LAST_NAME).sendKeys(Data.LAST_NAME);
                driver.findElement(Locators.TEXT_FIELD_PHONE).sendKeys(Data.PHONE);
                driver.findElement(Locators.REGISTRATION_ENGLISH_LEVEL).sendKeys(Data.ENGLISH_LEVEL);
        }

        public void door() {
                driver.findElement(Locators.EMAIL).sendKeys(Data.TEXT_EMAIL);
                driver.findElement(Locators.PASSWORD).sendKeys(Data.TEXT_PASSWORD);
        }

        public void minichatframe1() {
                wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.MINI_CHAT));
                WebElement iframe = driver.findElement(Locators.MINI_CHAT);
                driver.switchTo().frame(iframe);
        }

        public void textframe() {
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
                driver.findElement(Locators.TEXT_CHATE).sendKeys(Data.MY_TEXT);
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        }
}
