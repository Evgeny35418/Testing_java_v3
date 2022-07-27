package appmanager;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;

import java.time.Duration;

public class ApplicationManager {
  WebDriver wd;

  private  NavigationContactHelper navigationContactHelper;
  private  ContactHelper contactHelper ;
  private SessionHelper sessionHelper;
  private NavigationHelper navigationHelper ;
  private GroupHelper groupHelper;
  private JavascriptExecutor js;
  private String browser;

  public ApplicationManager(String browser) {
    this.browser = browser;
  }

  public void init() {
    if(browser.equals(BrowserType.CHROME)){
      wd = new ChromeDriver();
    } else if (browser.equals(BrowserType.FIREFOX)) {
      wd = new FirefoxDriver();
    }
 wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
    js = (JavascriptExecutor) wd;
 wd.get("http://localhost/addressbook");
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

  public GroupHelper group() {
    return groupHelper;
  }

  public NavigationHelper goTo() {
    return navigationHelper;
  }

  public ContactHelper getContactHelper() {
    return contactHelper;
  }

  public NavigationContactHelper getNavigationContactHelper() {
    return navigationContactHelper;
  }
}
