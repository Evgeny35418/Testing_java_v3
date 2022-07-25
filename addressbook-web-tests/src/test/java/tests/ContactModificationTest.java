package tests;

import model.Contact;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactModificationTest extends TestBase {
  @Test
  public void testContactModification(){
    int before = appM.getContactHelper().getContactCount();
    if(! appM.getContactHelper().isThereAContact()){
      appM.getContactHelper().createContact(new Contact("Jeka", "Smorzhevskij", "autotest", "saint-peterburg", "999999999", "jekaqa@mail.ru", "test1"));
    }
    appM.getNavigationContactHelper().selectContact(before -1);
    appM.getNavigationContactHelper().selectModificationContact();
    appM.getContactHelper().fillAddNewForm(new Contact("Umami", "ivanov", "autotest", "saint-peterburg", "999999999", "jekaqa@mail.ru", null), false);
    appM.getNavigationHelper().clickContactModification();
    appM.getNavigationHelper().returnToHomePage();
    int after = appM.getContactHelper().getContactCount();
    Assert.assertEquals(after,before );
  }
}
