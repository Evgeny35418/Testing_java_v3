package tests;

import model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class GroupDeletionTests extends TestBase {

  @Test
  public void testGroupDeletion() throws Exception {
    appM.getNavigationHelper().goToGroupPage();
    if(! appM.getGroupHelper().isThereAGroup()){
      appM.getGroupHelper().createGroup(new GroupData("test555", null, null));
    }
    List<GroupData> before = appM.getGroupHelper().getGroupList();
    appM.getGroupHelper().selectGroup(0 );
    appM.getGroupHelper().deleteGroupDelete();
    appM.getGroupHelper().returnToGroupPage();
    List<GroupData> after = appM.getGroupHelper().getGroupList();
    Assert.assertEquals(after.size(),before.size() -1 );

    before.remove(before.size() -1);
    Assert.assertEquals( before, after);

  }


}
