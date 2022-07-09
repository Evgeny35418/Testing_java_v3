package tests;

import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase {

  @Test
  public void testGroupDeletion() throws Exception {

    appM.getNavigationHelper().groupPage();
    appM.getNavigationHelper().goToGroupPage();
    appM.getGroupHelper().selectGroup();
    appM.getGroupHelper().deleteGroupDelete();
    appM.getGroupHelper().returnToGroupPage();
  }


}
