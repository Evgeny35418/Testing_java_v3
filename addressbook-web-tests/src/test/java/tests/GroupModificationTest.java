package tests;

import model.GroupData;
import org.testng.annotations.Test;

public class GroupModificationTest extends  TestBase {
  @Test
  public void testGroupModification(){
    appM.getNavigationHelper().goToGroupPage();
    appM.getGroupHelper().selectGroup();
    appM.getGroupHelper().initGroupModification();
    appM.getGroupHelper().fillGroupForm(new GroupData("111111", "22222", "333333"));
    appM.getGroupHelper().submitGroupModification();
    appM.getGroupHelper().returnToGroupPage();
  }
}
