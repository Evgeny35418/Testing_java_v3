package tests;

import org.testng.Assert;
import org.testng.annotations.*;
import model.GroupData;

import java.util.List;


public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation()  {
    appM.getNavigationHelper().goToGroupPage();
    List<GroupData> before = appM.getGroupHelper().getGroupList();
    appM.getGroupHelper().createGroup(new GroupData("test555", null, null));
    List<GroupData> after = appM.getGroupHelper().getGroupList();
    Assert.assertEquals(after.size(),before.size() +1 );
  }




}
