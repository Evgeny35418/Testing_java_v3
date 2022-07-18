package testing.java.auto.addressbook;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class DemoTestsBase {
  private WebDriver wd;
  private String baseUrl;
  private JavascriptExecutor js;

  @BeforeMethod(alwaysRun = true)
  public void setUp() throws Exception {
    wd = new ChromeDriver();
    baseUrl = "https://www.google.com/";
    wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    js = (JavascriptExecutor) wd;
  }

  protected void clickTicket() {
    wd.findElement(By.cssSelector("div.card__header-left")).click();
  }

  protected void resultSearch() {
    wd.get("https://ticket.rzd.ru/searchresults/v/1/5a3244bc340c7441a0a556ca/5a13bd41340c745ca1e88b55/2022-08-03/2022-09-15");
  }

  protected void clickSearch() {
    wd.findElement(By.xpath("//div[2]/a")).click();
  }

  protected void dataTo(String DataTo) {
    wd.findElement(By.id("datepicker-to")).click();
    wd.findElement(By.linkText(DataTo)).click();
  }

  protected void dataFrom(String DataFrom) {
    wd.findElement(By.id("datepicker-from")).click();
    wd.findElement(By.linkText("24")).click();
  }

  protected void ArriveTo(String CityTo) {
    wd.findElement(By.id("direction-to")).click();
    wd.findElement(By.id("direction-to")).clear();
    wd.findElement(By.id("direction-to")).sendKeys(CityTo);
  }

  protected void departureFrom(String CityFrom) {
    wd.findElement(By.id("direction-from")).click();
    wd.findElement(By.id("direction-from")).clear();
    wd.findElement(By.id("direction-from")).sendKeys(CityFrom);
  }

  protected void goToPageRzd() {
    wd.get("https://www.rzd.ru/");
  }

  @AfterMethod(alwaysRun = true)
  public void tearDown() throws Exception {
    wd.quit();

  }

  private boolean isElementPresent(By by) {
    try {
      wd.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      wd.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }
}
