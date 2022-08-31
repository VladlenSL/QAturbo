import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class MainPage extends BaseActions {
        public MainPage(WebDriver driver, WebDriverWait wait){
                super(driver, wait);
        }

        public void clickbutton() {
                driver.findElements(Locators.REGISTRATION_BUTTON).get(0).click();
        }

        public void FillingInTheData() {
                //driver.findElements(Locators.NEXT_Button).get(1).click();
        }

        public void pricing() {
                driver.findElement(Locators.CLICK_PRICING).click();
                wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.MONTHLY));
                driver.findElements(Locators.MONTHLY).get(2).click();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
                driver.findElement(Locators.SIGN_UP1).click();
        }

        public void door() {
                //driver.findElement(Locators.SIGN_UP).click();
        }

        public void close() {
                driver.findElement(Locators.EXIT).click();
        }

        public void minichatframe1() {
                driver.findElement(Locators.CLICK_CHATE).click();
        }

        public void exiteframe() {
                driver.findElement(Locators.EXITE).click();
        }
}
