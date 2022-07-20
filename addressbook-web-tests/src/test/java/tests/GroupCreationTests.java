package tests;

import org.testng.Assert;
import org.testng.annotations.*;
import model.GroupData;


public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation()  {
    appM.getNavigationHelper().goToGroupPage();
    int before = appM.getGroupHelper().getGroupCount();
    appM.getGroupHelper().createGroup(new GroupData("test555", null, null));
    int after = appM.getGroupHelper().getGroupCount();
    Assert.assertEquals(after,before +1 );
  }




}
