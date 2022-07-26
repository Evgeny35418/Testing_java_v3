package tests;

import model.Contact;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.List;

public class ContactModificationTest extends TestBase {
  @Test
  public void testContactModification(){
    if(! appM.getContactHelper().isThereAContact()){
      appM.getContactHelper().createContact(new Contact("Jeka", "Smorzhevskij", "autotest", "saint-peterburg", "999999999", "jekaqa@mail.ru", "test1"));
    }
    List<Contact> before = appM.getContactHelper().getContactList();
    appM.getNavigationContactHelper().selectContact(before.size() -1);
    appM.getNavigationContactHelper().selectModificationContact();
    Contact contact = new Contact("Umami", "ivanov", "autotest", "saint-peterburg", "999999999", "jekaqa@mail.ru", null), false);
    appM.getContactHelper().fillAddNewForm(new Contact("Umami", "ivanov", "autotest", "saint-peterburg", "999999999", "jekaqa@mail.ru", null), false);
    appM.getNavigationHelper().clickContactModification();
    appM.getNavigationHelper().returnToHomePage();
    List<Contact> after = appM.getContactHelper().getContactList();
    Assert.assertEquals(after.size(),before.size() );

    before.remove(before.size()-1);
    before.add()
    Assert.assertEquals(new HashSet<Object>(before),new HashSet<Object>(after));
  }
}
