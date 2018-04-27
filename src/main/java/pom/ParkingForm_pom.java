package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ParkingForm_pom {

    By lot = By.id("Lot");
    By entryTime = By.id("EntryTime");
    By exitTime = By.id("ExitTime");
    By AM = By.xpath("//input[@value='AM']");
    By PM = By.xpath("//input[@value='PM']");
    By entryDate = By.id("EntryDate");
    By exitDate = By.id("ExitDate");
    By calculateButton = By.id("Submit");


    public void selectCountry(String lotType, WebDriver driver){
        Select dr = new Select(driver.findElement(lot));
        dr.selectByVisibleText(lotType);

    }



    public void calcul(String lotType,WebDriver driver){
        selectCountry(lotType,driver);



    }

}
