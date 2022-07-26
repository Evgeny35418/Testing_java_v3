package tests;


import model.GroupData;
import org.testng.Assert;
import org.testng.annotations.*;
import model.ContactData;

import java.util.List;

public class ContactCreationTests extends TestBase {

  @Test
  public void testNewUserCreation() throws Exception {
    List<ContactData> before = appM.getContactHelper().getContactList();
    appM.getGroupHelper().returnToGroupPage();
    if (!appM.getGroupHelper().isThereAGroup()) {
      appM.getGroupHelper().createGroup(new GroupData("test2", null, null));
    }
    appM.getContactHelper().createContact(new ContactData("Jeka", "Smorzhevskij", "autotest", "saint-peterburg", "999999999", "jekaqa@mail.ru", "none"));
    List<ContactData> after = appM.getContactHelper().getContactList();
    Assert.assertEquals(after.size(),before.size() +1);
}
  }
