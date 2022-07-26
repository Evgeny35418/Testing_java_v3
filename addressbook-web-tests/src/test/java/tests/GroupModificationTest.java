package tests;

import model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class GroupModificationTest extends  TestBase {
  @Test
  public void testGroupModification(){
    appM.getNavigationHelper().goToGroupPage();
    if(! appM.getGroupHelper().isThereAGroup()){
      appM.getGroupHelper().createGroup(new GroupData("test555", null, null));
    }
    List<GroupData> before = appM.getGroupHelper().getGroupList();
    appM.getGroupHelper().selectGroup(before.size()-1);
    appM.getGroupHelper().initGroupModification();
    GroupData group = new GroupData("test1", "22222", "333333");
    appM.getGroupHelper().fillGroupForm(new GroupData("test1", "22222", "333333"));
    appM.getGroupHelper().submitGroupModification();
    appM.getGroupHelper().returnToGroupPage();
    List<GroupData> after = appM.getGroupHelper().getGroupList();
    Assert.assertEquals(after.size(),before.size() );

    before.remove(before.size()-1);
    before.add(group);
    Comparator<? super GroupData> byId = (g1,g2) -> Integer.compare(g1.getId(), g2.getId());
    before.sort(byId);
    after.sort(byId);
    Assert.assertEquals(before,after);
  }
}
