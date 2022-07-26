package tests;

import org.testng.Assert;
import org.testng.annotations.*;
import model.GroupData;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;


public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation()  {
    appM.getNavigationHelper().goToGroupPage();
    List<GroupData> before = appM.getGroupHelper().getGroupList();
    GroupData group = new GroupData("test3", null, null);
    appM.getGroupHelper().createGroup(group);
    List<GroupData> after = appM.getGroupHelper().getGroupList();
    Assert.assertEquals(after.size(),before.size() +1 );



    before.add(group);
    Comparator<? super GroupData> byId = (g1,g2) -> Integer.compare(g1.getId(), g2.getId());
    before.sort(byId);
    after.sort(byId);
    Assert.assertEquals(before,after);
  }




}
