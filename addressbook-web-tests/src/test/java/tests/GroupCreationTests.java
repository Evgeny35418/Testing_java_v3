package tests;

import org.testng.annotations.*;
import model.GroupData;


public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    appM.getNavigationHelper().groupPage();
    appM.getGroupHelper().gotoGroupNew();
    appM.getGroupHelper().initGroupCreation();
    appM.getGroupHelper().fillGroupForm(new GroupData("test555", null, null));
    appM.getGroupHelper().submitGroupCreation();
    appM.getGroupHelper().returnToGroupPage();
  }




}
