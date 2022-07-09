package tests;


import org.testng.annotations.*;
import model.NewUser;

public class ContactCreationTests extends TestBase {

  @Test
  public void testNewUserCreation() throws Exception {

    appM.getNavigationContactHelper().gotoAddNewPage();
    appM.getContactHelper().fillAddNewForm(new NewUser("Jeka", "ivanov", "autotest", "saint-peterburg", "999999999", "jekaqa@mail.ru"));
    appM.getContactHelper().creatingANewUser();

  }


}
