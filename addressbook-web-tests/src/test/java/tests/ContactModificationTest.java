package tests;

import model.NewUser;
import org.testng.annotations.Test;

public class ContactModificationTest extends TestBase {
  @Test
  public void testContactModification(){

    appM.getNavigationContactHelper().initContactModification();
    appM.getContactHelper().fillAddNewForm(new NewUser("Umami", "ivanov", "autotest", "saint-peterburg", "999999999", "jekaqa@mail.ru", null), false);
    appM.getNavigationHelper().clickContactModification();
    appM.getNavigationHelper().returnToHomePage();
  }
}
