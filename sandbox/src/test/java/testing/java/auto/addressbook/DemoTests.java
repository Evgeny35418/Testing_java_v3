package testing.java.auto.addressbook;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;



public class DemoTests {
  private WebDriver driver;
  private String baseUrl;

  private JavascriptExecutor js;

  @BeforeMethod(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new ChromeDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    js = (JavascriptExecutor) driver;
  }

  @Test
  public void testDemoTests() throws Exception {
    driver.get("https://www.rzd.ru/");
    driver.findElement(By.id("direction-from")).click();
    driver.findElement(By.id("direction-from")).clear();
    driver.findElement(By.id("direction-from")).sendKeys("Санкт-Петербург");
    driver.findElement(By.id("direction-to")).click();
    driver.findElement(By.id("direction-to")).clear();
    driver.findElement(By.id("direction-to")).sendKeys("Казань");
    driver.findElement(By.id("datepicker-from")).click();
    driver.findElement(By.linkText("3")).click();
    driver.findElement(By.id("datepicker-to")).click();
    driver.findElement(By.xpath("//div[@id='rzd-datepicker-div']/div[4]/table/tbody/tr[4]/td[4]/a")).click();
    driver.findElement(By.xpath("//div[2]/a")).click();
    driver.get("https://ticket.rzd.ru/searchresults/v/1/5a3244bc340c7441a0a556ca/5a13bd41340c745ca1e88b55/2022-08-03/2022-09-15");
    driver.findElement(By.cssSelector("div.card__header-left")).click();
    driver.get("https://ticket.rzd.ru/");

  }

  @AfterMethod(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();

  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }


}
