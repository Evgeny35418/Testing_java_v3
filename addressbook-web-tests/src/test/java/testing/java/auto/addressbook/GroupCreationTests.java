package testing.java.auto.addressbook;

import org.testng.annotations.*;


public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {

    gotoGroupNew();
    initGroupCreation();
    fillGroupForm(new GroupData("test555", "test555", "test555"));
    submitGroupCreation();
    returnToGroupPage();
  }




}
