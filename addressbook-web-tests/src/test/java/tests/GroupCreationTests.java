package tests;

import org.testng.Assert;
import org.testng.annotations.*;
import model.GroupData;

import java.util.HashSet;
import java.util.List;


public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation()  {
    appM.getNavigationHelper().goToGroupPage();
    List<GroupData> before = appM.getGroupHelper().getGroupList();
    GroupData group = new GroupData("test1", null, null);
    appM.getGroupHelper().createGroup(group);
    List<GroupData> after = appM.getGroupHelper().getGroupList();
    Assert.assertEquals(after.size(),before.size() +1 );


    int max = 0;
    for(GroupData g: after){
      if(g.getId()> max){
        max = g.getId();
      }
    }
    group.setId(max);
    before.add(group);
    Assert.assertEquals(new HashSet<Object>(before),new HashSet<Object>(after));
  }




}
