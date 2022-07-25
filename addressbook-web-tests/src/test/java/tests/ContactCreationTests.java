package tests;


import model.GroupData;
import org.testng.Assert;
import org.testng.annotations.*;
import model.Contact;

import java.util.List;

public class ContactCreationTests extends TestBase {

  @Test
  public void testNewUserCreation() throws Exception {
    int before = appM.getContactHelper().getContactCount();
    List<Contact> before = appM.getContactHelper().getGroupList();
    appM.getGroupHelper().returnToGroupPage();
    if (!appM.getGroupHelper().isThereAGroup()) {
      appM.getGroupHelper().createGroup(new GroupData("test2", null, null));
    }
    appM.getContactHelper().createContact(new Contact("Jeka", "Smorzhevskij", "autotest", "saint-peterburg", "999999999", "jekaqa@mail.ru", "test32"));
    int after = appM.getContactHelper().getContactCount();
    Assert.assertEquals(after,before +1);
}
  }
