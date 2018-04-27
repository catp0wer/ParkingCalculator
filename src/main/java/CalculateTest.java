import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.ParkingForm_pom;
public class CalculateTest {


    WebDriver driver = new FirefoxDriver();

    @BeforeMethod
    public void setup() {
        driver.get("http://adam.goucher.ca/parkcalc/index.php");
    }


    @Test(dataProvider = "Data", dataProviderClass = DataProviderRep.class)
    public void testCalcul(String lotType,String date) {
        ParkingForm_pom calculForm = new ParkingForm_pom();
        calculForm.calcul(lotType,date,driver);

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
