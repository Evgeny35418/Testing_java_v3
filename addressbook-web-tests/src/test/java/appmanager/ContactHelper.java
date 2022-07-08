package appmanager;

import model.NewUser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactHelper extends HelperBase {

  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  public void creatingANewUser() {
  click(By.xpath("//div[@id='content']/form/input[21]"));
  }

  public void fillAddNewForm(NewUser newUser) {
    type(By.name("firstname"),newUser.getFirstName());
    type(By.name("lastname"),newUser.getLastName());
    type(By.name("company"),newUser.getCompany());
    type(By.name("address"),newUser.getAddress());
    type(By.name("home"), newUser.getTelephone());
    type(By.name("email"),newUser.getEmail());
   wd.findElement(By.name("firstname")).click();
   wd.findElement(By.name("firstname")).clear();
   wd.findElement(By.name("firstname")).sendKeys(newUser.getFirstName());
   wd.findElement(By.name("lastname")).click();
   wd.findElement(By.name("lastname")).clear();
   wd.findElement(By.name("lastname")).sendKeys(newUser.getLastName());

   wd.findElement(By.name("company")).click();
   wd.findElement(By.name("company")).clear();
   wd.findElement(By.name("company")).sendKeys(newUser.getCompany());
   wd.findElement(By.name("address")).click();
   wd.findElement(By.name("address")).clear();
   wd.findElement(By.name("address")).sendKeys(newUser.getAddress());
   wd.findElement(By.name("home")).click();
  wd.findElement(By.name("home")).clear();
   wd.findElement(By.name("home")).sendKeys(newUser.getTelephone());
   wd.findElement(By.name("email")).click();
   wd.findElement(By.name("email")).clear();
   wd.findElement(By.name("email")).sendKeys(newUser.getEmail());
  }
}
