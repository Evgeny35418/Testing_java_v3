package tests;


import model.GroupData;
import org.testng.Assert;
import org.testng.annotations.*;
import model.ContactData;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class ContactCreationTests extends TestBase {

  @Test(enabled = false)
  public void testNewUserCreation() throws Exception {
    List<ContactData> before = appM.getContactHelper().getContactList();
    appM.getGroupHelper().returnToGroupPage();
    if (!appM.getGroupHelper().isThereAGroup()) {
      appM.getGroupHelper().createGroup(new GroupData("test3", null, null));
    }
    ContactData contact = new ContactData("Jeka", "Smorzhevskij", "autotest", "saint-peterburg", "999999999", "jekaqa@mail.ru", "none");
    appM.getContactHelper().createContact(contact);
    List<ContactData> after = appM.getContactHelper().getContactList();
    Assert.assertEquals(after.size(),before.size() +1);

    before.add(contact);
    Comparator<? super ContactData> byId= (g1,g2) -> Integer.compare(g1.getId(), g2.getId());
    before.sort(byId);
    after.sort(byId);
    Assert.assertEquals(before,after);
}
  }
