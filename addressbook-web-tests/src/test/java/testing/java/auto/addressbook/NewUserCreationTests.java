package testing.java.auto.addressbook;


import org.testng.annotations.*;

public class NewUserCreationTests extends TestBase {

  @Test
  public void testNewUserCreation() throws Exception {

    gotoAddNewPage();
    fillAddNewForm(new NewUser("Ivan", "ivanov", "autotest", "saint-peterburg", "999999999", "jekaqa@mail.ru"));
    creatingANewUser();

  }


}
