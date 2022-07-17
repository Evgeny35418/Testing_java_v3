package tests;


import org.testng.annotations.*;
import model.Contact;

public class ContactCreationTests extends TestBase {

  @Test
  public void testNewUserCreation() throws Exception {
    appM.getContactHelper().createContact(new Contact("Jeka", "Smorzhevskij", "autotest", "saint-peterburg", "999999999", "jekaqa@mail.ru", "test1"), true);

  }


}
