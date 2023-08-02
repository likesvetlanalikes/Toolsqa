package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Input {
    WebDriver driver;
    String inputId = "%s";
    Sring id;

    public Input(WebDriver driver, String id){

        this.driver = driver;
        this.is = id;
    }


    public void write(String text){
        driver.findElement(By.id(String.format(inputId, this.id))).sendKeys();
    }
}
