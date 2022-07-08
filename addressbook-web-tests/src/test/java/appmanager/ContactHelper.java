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

  }
}
