import org.testng.annotations.Test;

public class RegistrationTests extends BaseUI{

    @Test
    public void registrationTests1(){
        mainPage.clickbutton();
        registrationForm.FillingInTheData();
        mainPage.FillingInTheData();
    }

    @Test
    public void mainPageTests2(){
        mainPage.pricing();
        registrationForm.door();
        mainPage.door();
        mainPage.close();
    }

    @Test
    public void testiframe(){
        registrationForm.minichatframe1();
        mainPage.minichatframe1();
        registrationForm.textframe();
        mainPage.exiteframe();
    }
}
