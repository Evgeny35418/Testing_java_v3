package testing.java.auto.addressbook;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.fail;

public class GroupCreationTests2 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  private JavascriptExecutor js;

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new ChromeDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    js = (JavascriptExecutor) driver;
  }

  @Test
  public void testGroupCreationTests() throws Exception {
    driver.get("https://yandex.ru/");
    driver.findElement(By.xpath("//li[3]/a/div")).click();
    driver.get("https://market.yandex.ru/?clid=505&utm_source=main_stripe_big&wprid=1657005342952023-326149875962379494-sas2-0946-sas-l7-balancer-8080-BAL-9502&src_pof=505&icookie=Zrvmau2yPZXwRa%2FnlKeF8HapTaXh6O8Zpc4zdcIGvA3EB4ZlFiqqEQbRRPob24n2d6dL0DRncO8xt6pGftPawszPNe0%3D&utm_source_service=morda");
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_2 | ]]
    driver.get("https://market.yandex.ru/?clid=505&utm_source=main_stripe_big&src_pof=505&icookie=Zrvmau2yPZXwRa%2FnlKeF8HapTaXh6O8Zpc4zdcIGvA3EB4ZlFiqqEQbRRPob24n2d6dL0DRncO8xt6pGftPawszPNe0%3D&utm_source_service=morda");
    driver.findElement(By.id("header-search")).click();
    driver.findElement(By.id("header-search")).clear();
    driver.findElement(By.id("header-search")).sendKeys("iphon");
    driver.findElement(By.cssSelector(".BDkvP")).submit();
    driver.get("https://market.yandex.ru/catalog--mobilnye-telefony/34512430/list?text=iphon&hid=91491&rt=9&was_redir=1&srnum=2990&cpa=1&rs=eJwzEghgrGLheHyKdRYja2ZBRn4eAC4NBYo%2C");
    driver.get("https://market.yandex.ru/catalog--mobilnye-telefony/34512430/list?srnum=2990&was_redir=1&rt=9&rs=eJwzEghgrGLheHyKdRYja2ZBRn4eAC4NBYo%2C&text=iphon&hid=91491&local-offers-first=0");
    driver.findElement(By.xpath("//img[@alt='Предложение']")).click();
    driver.get("https://market.yandex.ru/product--smartfon-apple-iphone-13-512-gb-sinii/1414986413?cpc=3lLHt-gkLI3iK9CxRvuzuzMQgnC-zAttJBF3Ass60KI2lOW3xqFyEkYbiyiKLjTs3HAzegI7sfAVyosw3__Q4IIjTXj6h9jitsLSp3NhO0qUcouGoDewg90Vb5esWZ9gVvaa6BH258T5Rojiq4Ey8yKhsp9wVrBChVvx1r5UET8SsXreHo_gN-iqMTMTyQCniNyYVowc08M%2C&sku=101446178763&from=premiumOffers&from-show-uid=16570054205066276983313001&do-waremd5=8kX1EhdmhabEv1sLCkJEAg&sponsored=1");
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_3 | ]]
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Оплата наличными курьеру'])[1]/following::span[2]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='₽'])[55]/following::span[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Маркет'])[1]/preceding::span[1]")).click();
    driver.get("https://yandex.ru/");
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_4 | ]]
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
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

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
