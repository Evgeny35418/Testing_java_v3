package tests;


import model.GroupData;
import org.testng.Assert;
import org.testng.annotations.*;
import model.Contact;

import java.util.List;

public class ContactCreationTests extends TestBase {

  @Test
  public void testNewUserCreation() throws Exception {
    List<Contact> before = appM.getContactHelper().getContactList();
    appM.getGroupHelper().returnToGroupPage();
    if (!appM.getGroupHelper().isThereAGroup()) {
      appM.getGroupHelper().createGroup(new GroupData("test2", null, null));
    }
    appM.getContactHelper().createContact(new Contact("Jeka", "Smorzhevskij", "autotest", "saint-peterburg", "999999999", "jekaqa@mail.ru", "test32"));
    List<Contact> after = appM.getContactHelper().getContactList();
    Assert.assertEquals(after.size(),before.size() +1);
}
  }
