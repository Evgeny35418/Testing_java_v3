package tests;

import model.GroupData;
import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase {

  @Test
  public void testGroupDeletion() throws Exception {
    appM.getNavigationHelper().goToGroupPage();
    if(! appM.getGroupHelper().isThereAGroup()){
      appM.getGroupHelper().createGroup(new GroupData("test555", null, null));
    }
    appM.getGroupHelper().selectGroup();
    appM.getGroupHelper().deleteGroupDelete();
    appM.getGroupHelper().returnToGroupPage();
  }


}
