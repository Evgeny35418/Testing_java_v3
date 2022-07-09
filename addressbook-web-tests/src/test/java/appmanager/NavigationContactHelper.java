package appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationContactHelper extends GroupHelper {

  public NavigationContactHelper(WebDriver wd) {
   super(wd);
  }

  public void gotoAddNewPage() {

 click(By.linkText("add new"));
  }

  public void initContactModification() {
    click(By.xpath("//img[@alt='Edit']"));
  }

  public void returnHome() {
    click(By.linkText("home"));
  }
}
