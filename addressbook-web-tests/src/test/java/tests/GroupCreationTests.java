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
    Comparator<? super GroupData> byId= (Comparator<GroupData>) (o1, o2) -> Integer.compare(o1.getId(), o2.getId());
    int max1 = after.stream().max(byId).get().getId();
    group.setId(max1);
    before.add(group);
    Assert.assertEquals(new HashSet<Object>(before),new HashSet<Object>(after));
  }




}
