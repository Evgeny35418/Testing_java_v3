package appmanager;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import model.NewUser;

import java.time.Duration;

public class ApplicationManager {
  private final GroupHelper groupHelper = new GroupHelper();
  private JavascriptExecutor js;

 public void init() {
    groupHelper.wd = new ChromeDriver();

    groupHelper.wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    js = (JavascriptExecutor) groupHelper.wd;
    groupHelper.wd.get("http://localhost/addressbook/group.php");
    login("admin", "secret");
  }

  public void login(String username, String password) {
    groupHelper.wd.findElement(By.name("user")).click();
    groupHelper.wd.findElement(By.name("user")).clear();

    groupHelper.wd.findElement(By.name("user")).sendKeys(username);
    groupHelper.wd.findElement(By.name("pass")).click();
    groupHelper.wd.findElement(By.name("pass")).clear();
    groupHelper.wd.findElement(By.name("pass")).sendKeys(password);
    groupHelper.wd.findElement(By.xpath("//input[@value='Login']")).click();
  }

  public void creatingANewUser() {
    groupHelper.wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
  }

  public void fillAddNewForm(NewUser newUser) {
    groupHelper.wd.findElement(By.name("firstname")).click();
    groupHelper.wd.findElement(By.name("firstname")).clear();
    groupHelper.wd.findElement(By.name("firstname")).sendKeys(newUser.getFirstName());
    groupHelper.wd.findElement(By.name("lastname")).click();
    groupHelper.wd.findElement(By.name("lastname")).clear();
    groupHelper.wd.findElement(By.name("lastname")).sendKeys(newUser.getLastName());
    groupHelper.wd.findElement(By.name("nickname")).click();
    groupHelper.wd.findElement(By.name("company")).click();
    groupHelper.wd.findElement(By.name("company")).clear();
    groupHelper.wd.findElement(By.name("company")).sendKeys(newUser.getCompany());
    groupHelper.wd.findElement(By.name("address")).click();
    groupHelper.wd.findElement(By.name("address")).clear();
    groupHelper.wd.findElement(By.name("address")).sendKeys(newUser.getAddress());
    groupHelper.wd.findElement(By.name("home")).click();
    groupHelper.wd.findElement(By.name("home")).clear();
    groupHelper.wd.findElement(By.name("home")).sendKeys(newUser.getTelephone());
    groupHelper.wd.findElement(By.name("email")).click();
    groupHelper.wd.findElement(By.name("email")).clear();
    groupHelper.wd.findElement(By.name("email")).sendKeys(newUser.getEmail());
  }

  public void gotoAddNewPage() {
    groupHelper.wd.findElement(By.linkText("add new")).click();
  }

  public void stop() {
    groupHelper.wd.quit();
  }

  public boolean isElementPresent(By by) {
    try {
      groupHelper.wd.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  public boolean isAlertPresent() {
    try {
      groupHelper.wd.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  public void goToGroupPage() {
    groupHelper.wd.findElement(By.linkText("groups")).click();
  }

  public GroupHelper getGroupHelper() {
    return groupHelper;
  }
}
