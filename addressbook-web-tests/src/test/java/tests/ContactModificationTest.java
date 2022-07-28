package tests;

import model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Comparator;
import java.util.List;

public class ContactModificationTest extends TestBase {

  @Test
  public void testContactModification(){
    if(! appM.getContactHelper().isThereAContact()){
      appM.getContactHelper().createContact(new ContactData("Jeka", "Smorzhevskij", "autotest", "saint-peterburg", "999999999", "jekaqa@mail.ru", "none"));
    }
    List<ContactData> before = appM.getContactHelper().getContactList();
    appM.getNavigationContactHelper().selectModificationContact(before.size()-1);
    ContactData contact = new ContactData(before.get(before.size()-1).getId(),"Jeka", "Smorzhevskij", "autotest1", "saint-peterburg", "999999999", "jekaqa@mail.ru", null);
    appM.getContactHelper().fillAddNewForm(contact, false);
    appM.goTo().clickContactModification();
    appM.goTo().returnToHomePage();
    List<ContactData> after = appM.getContactHelper().getContactList();
    Assert.assertEquals(after.size(),before.size() );

    before.remove(before.size()-1);
    before.add(contact);
    Comparator<? super ContactData> byId= (g1,g2) -> Integer.compare(g1.getId(), g2.getId());
    before.sort(byId);
    after.sort(byId);
    Assert.assertEquals(before,after);
  }
}
