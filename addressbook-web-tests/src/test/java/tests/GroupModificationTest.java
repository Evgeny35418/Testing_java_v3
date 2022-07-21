package tests;

import model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class GroupModificationTest extends  TestBase {
  @Test
  public void testGroupModification(){
    appM.getNavigationHelper().goToGroupPage();
    if(! appM.getGroupHelper().isThereAGroup()){
      appM.getGroupHelper().createGroup(new GroupData("test555", null, null));
    }
    List<GroupData> before = appM.getGroupHelper().getGroupList();
    appM.getGroupHelper().selectGroup(0);
    appM.getGroupHelper().initGroupModification();
    appM.getGroupHelper().fillGroupForm(new GroupData("test1", "22222", "333333"));
    appM.getGroupHelper().submitGroupModification();
    appM.getGroupHelper().returnToGroupPage();
    List<GroupData> after = appM.getGroupHelper().getGroupList();
    Assert.assertEquals(after.size(),before.size()  );
  }
}
