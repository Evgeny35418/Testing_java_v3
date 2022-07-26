package tests;

import model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.List;

public class ContactModificationTest extends TestBase {
  @Test
  public void testContactModification(){
    if(! appM.getContactHelper().isThereAContact()){
      appM.getContactHelper().createContact(new ContactData("Jeka", "Smorzhevskij", "autotest", "saint-peterburg", "999999999", "jekaqa@mail.ru", "test1"));
    }
    List<ContactData> before = appM.getContactHelper().getContactList();
    appM.getNavigationContactHelper().selectContact(before.size()-1);
    appM.getNavigationContactHelper().selectModificationContact();
    ContactData contact = new ContactData(before.get(before.size()-1).getId(),"Jeka", "Smorzhevskij", "autotest1", "saint-peterburg", "999999999", "jekaqa@mail.ru", null);
    appM.getContactHelper().fillAddNewForm(contact, false);
    appM.getNavigationHelper().clickContactModification();
    appM.getNavigationHelper().returnToHomePage();
    List<ContactData> after = appM.getContactHelper().getContactList();
    Assert.assertEquals(after.size(),before.size() );

    before.remove(before.size()-1);
    before.add(contact);
    Assert.assertEquals(new HashSet<Object>(before),new HashSet<Object>(after));
  }
}
