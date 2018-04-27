package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ParkingForm_pom {

    By lot = By.id("Lot");
    By entryTime = By.xpath("//*[@id='EntryTime']");

    By exitTime = By.id("ExitTime");
    By AM = By.xpath("//input[@value='AM']");
    By PM = By.xpath("//input[@value='PM']");
    By entryDate = By.id("EntryDate");
    By exitDate = By.id("ExitDate");
    By calculateButton = By.id("Submit");


    public void selectLot(String lotType, WebDriver driver){
        Select dr = new Select(driver.findElement(lot));
        dr.selectByVisibleText(lotType);

    }
    public void enterDate(String date, WebDriver driver){
        driver.findElement(entryTime).sendKeys(date);

    }

    public void clearAllfields(WebDriver driver) {
        driver.findElement(entryTime).clear();
        driver.findElement(exitTime).clear();
        driver.findElement(entryDate).clear();
        driver.findElement(exitDate).clear();
    }

    public void calcul(String date,String lotType, WebDriver driver){
        clearAllfields(driver);
        selectLot(lotType,driver);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        enterDate(date,driver);

    }

}
