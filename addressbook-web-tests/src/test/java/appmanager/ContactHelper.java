package appmanager;

import model.Contact;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class ContactHelper extends HelperBase {

  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  public void clickCreatingContact() {
  click(By.xpath("//div[@id='content']/form/input[21]"));
  }

  public void fillAddNewForm(Contact newUser, boolean creation) {
    type(By.name("firstname"),newUser.getFirstName());
    type(By.name("lastname"),newUser.getLastName());
    type(By.name("company"),newUser.getCompany());
    type(By.name("address"),newUser.getAddress());
    type(By.name("home"), newUser.getTelephone());
    type(By.name("email"),newUser.getEmail());
    if(creation){
      new Select(wd.findElement(By.name("new_group"))).getFirstSelectedOption();
    } else{
      Assert.assertFalse(isElementPresent(By.name("new_group")));
    }

  }
  public void deleteContact() {
    click(By.xpath("//div[@id='content']/form[2]/input[2]"));
  }

  public void createContact(Contact contact) {
   gotoAddNewPage();
   fillAddNewForm( contact, true);
   clickCreatingContact();
   gotoHomePage();
  }
  public void gotoHomePage() {
    click(By.linkText("home page"));
  }

  private void gotoAddNewPage() {
    click(By.linkText("add new"));
  }


  public boolean isThereAContact() {
  return isElementPresent(By.xpath("//img[@alt='Edit']"));
  }

  public int getContactCount() {
   return wd.findElements(By.name("selected[]")).size();
  }

  public List<Contact> getContactList() {
    List<Contact> contacts = new ArrayList<Contact>();
    List<WebElement> elements = wd.findElements(By.xpath("//td/input"));
    for( WebElement element: elements){
      String name = element.getText();
      String lastName = element.getText();
      Contact contact = new Contact(name,lastName,null,null,null,null,null);
      contacts.add(contact);
    }
    return contacts;
  }
}
