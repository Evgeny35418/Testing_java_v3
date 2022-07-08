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
}
