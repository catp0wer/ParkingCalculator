package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ParkingForm_pom {

    By lot = By.id("Lot");
    By entryTime = By.xpath("//*[@id='EntryTime']");
    By exitTime = By.id("ExitTime");
    By AM = By.xpath("//input[@name='EntryTimeAMPM' and @value='AM']");
    By PM = By.xpath("//input[@name='EntryTimeAMPM' and @value='PM']");
    By entryDate = By.xpath("//*[@id='EntryDate']");
    By exAM = By.xpath("//input[@name='ExitTimeAMPM' and @value='AM']");
    By exPM = By.xpath("//input[@name='ExitTimeAMPM' and @value='PM']");
    By exitDate = By.id("ExitDate");
    By calculateButton = By.xpath("//input[@value='Calculate']");
    By sum = By.xpath("//table//tr[4]//b");


    public void selectLot(String lotType, WebDriver driver){
        Select dr = new Select(driver.findElement(lot));
        dr.selectByVisibleText(lotType);

    }
    public void enterTime(String time, WebDriver driver){
        driver.findElement(entryTime).sendKeys(time);

    }

    public void enterPeriods(String period, WebDriver driver){
        if(period =="AM"){
        driver.findElement(AM).click();
    } else{
            driver.findElement(PM).click();
        }
    }
    public void enterDate(String date, WebDriver driver){
        driver.findElement(entryDate).sendKeys(date);
    }
    public void enterExitTime(String exTime, WebDriver driver){
        driver.findElement(exitTime).sendKeys(exTime);
    }
    public void enterExPeriods(String period, WebDriver driver){
        if(period =="AM"){
            driver.findElement(exAM).click();
        } else{
            driver.findElement(exPM).click();
        }
    }
    public void enterExitDate(String exDate, WebDriver driver){
        driver.findElement(exitDate).sendKeys(exDate);
    }
    public String getMessageText(WebDriver driver){
        return driver.findElement(sum).getText();
    }
    public void clickCalculate(WebDriver driver){
        driver.findElement(calculateButton).click();
    }
    public void clearAllfields(WebDriver driver) {
        driver.findElement(entryTime).clear();
        driver.findElement(exitTime).clear();
        driver.findElement(entryDate).clear();
        driver.findElement(exitDate).clear();
    }

    public void calcul(String lotType,String time,String period, String date,String time2,String period2,String date2,
                       String suma, WebDriver driver){
        clearAllfields(driver);
        selectLot(lotType,driver);
        enterTime(time,driver);
        enterPeriods(period,driver);
        enterDate(date,driver);
        enterExitTime(time2,driver);
        enterExPeriods(period2,driver);
        enterExitDate(date2,driver);
        clickCalculate(driver);
        getMessageText(driver);
    }

}
