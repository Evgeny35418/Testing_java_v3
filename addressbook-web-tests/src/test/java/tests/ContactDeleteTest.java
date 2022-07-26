package tests;

import model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ContactDeleteTest extends TestBase{
  @Test
  public void testContactDelete(){
    if(! appM.getContactHelper().isThereAContact()){
    appM.getContactHelper().createContact(new ContactData("Jeka", "Smorzhevskij", "autotest", "saint-peterburg", "999999999", "jekaqa@mail.ru", "test1"));
    }
    List<ContactData> before = appM.getContactHelper().getContactList();
    appM.getNavigationContactHelper().selectContact(before.size()-1);
    appM.getNavigationContactHelper().selectModificationContact();
    appM.getContactHelper().deleteContact();
    appM.getNavigationContactHelper().returnHome();
    List<ContactData> after = appM.getContactHelper().getContactList();
    Assert.assertEquals(after.size(),before.size() -1);

    before.remove(before.size()-1);
    Assert.assertEquals(before, after);
    }
  }

