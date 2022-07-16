package tests;

import org.testng.annotations.*;
import model.GroupData;


public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    appM.getNavigationHelper().goToGroupPage();
    appM.getGroupHelper().createGroup(new GroupData("test555", null, null));
  }




}
