package tests;

import model.Contact;
import org.testng.annotations.Test;

public class ContactModificationTest extends TestBase {
  @Test
  public void testContactModification(){
    if(! appM.getContactHelper().isThereAContact()){
      appM.getContactHelper().createContact(new Contact("Jeka", "Smorzhevskij", "autotest", "saint-peterburg", "999999999", "jekaqa@mail.ru", "test1"));
    }
    appM.getNavigationContactHelper().initContactModification();
    appM.getContactHelper().fillAddNewForm(new Contact("Umami", "ivanov", "autotest", "saint-peterburg", "999999999", "jekaqa@mail.ru", null), false);
    appM.getNavigationHelper().clickContactModification();
    appM.getNavigationHelper().returnToHomePage();
  }
}
