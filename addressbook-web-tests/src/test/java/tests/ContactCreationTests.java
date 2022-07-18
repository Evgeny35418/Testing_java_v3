package tests;


import model.GroupData;
import org.testng.annotations.*;
import model.Contact;

public class ContactCreationTests extends TestBase {

  @Test
  public void testNewUserCreation() throws Exception {
    appM.getGroupHelper().returnToGroupPage();
    if (!appM.getGroupHelper().notGroup()) {
      appM.getGroupHelper().createGroup(new GroupData("test111", null, null));
    }

    appM.getContactHelper().createContact(new Contact("Jeka", "Smorzhevskij", "autotest", "saint-peterburg", "999999999", "jekaqa@mail.ru", "test111"));

}
  }
