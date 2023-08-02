package pages;

import elements.Calendar;
import elements.Input;
import elements.RadioButton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class FormPage extends BasePage{
    public static final By STUDENT_FORM_TITLE = By.xpath("//div[@class='practice-form-wrapper']");

    public FormPage(WebDriver driver) {
        super(driver);
    }
    public void clickInput(){
        driver.findElement(By.id("firstName")).sendKeys("\n");
    }

    public FormPage open(){
        driver.get(URL);
        return this;
    }

    public void create(){
        new Input(driver, "firstName").write("some name");
        new Input(driver,"lastName").write("some lastName");
        new Input(driver,"userEmail").write("sveta@gmail.ru");
        new Input(driver,"userNumber").write("34 99 77 88");
        new RadioButton(driver,"Female").select();
        new Calendar(driver).selectDate("May","2000","14");
    }


    @Override
    public boolean isPageOpen() {
        return isExist(STUDENT_FORM_TITLE);
    }
}