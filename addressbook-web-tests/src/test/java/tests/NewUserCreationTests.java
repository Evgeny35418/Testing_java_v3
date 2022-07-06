package tests;


import org.testng.annotations.*;
import model.NewUser;

public class NewUserCreationTests extends TestBase {

  @Test
  public void testNewUserCreation() throws Exception {

    appM.gotoAddNewPage();
    appM.fillAddNewForm(new NewUser("Ivan", "ivanov", "autotest", "saint-peterburg", "999999999", "jekaqa@mail.ru"));
    appM.creatingANewUser();

  }


}
