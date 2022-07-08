package appmanager;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ApplicationManager {
  WebDriver wd;

  private  NavigationContactHelper navigationContactHelper;
  private  ContactHelper contactHelper ;
  private SessionHelper sessionHelper;
  private NavigationHelper navigationHelper ;
  private GroupHelper groupHelper;
  private JavascriptExecutor js;

  public void init() {
  wd = new ChromeDriver();
 wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    js = (JavascriptExecutor) wd;
 wd.get("http://localhost/addressbook/group.php");
    contactHelper = new ContactHelper(wd);
    navigationContactHelper = new NavigationContactHelper(wd);
    groupHelper = new GroupHelper(wd);
    navigationHelper = new NavigationHelper(wd);
    sessionHelper = new SessionHelper(wd);
    sessionHelper.login("admin", "secret");
  }


  public void stop() {

  wd.quit();
  }

  public boolean isElementPresent(By by) {
    try {
   wd.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  public boolean isAlertPresent() {
    try {
     wd.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  public GroupHelper getGroupHelper() {
    return groupHelper;
  }

  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }

  public ContactHelper getContactHelper() {
    return contactHelper;
  }

  public NavigationContactHelper getNavigationContactHelper() {
    return navigationContactHelper;
  }
}
