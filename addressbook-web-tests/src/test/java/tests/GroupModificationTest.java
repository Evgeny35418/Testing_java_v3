package tests;

import model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupModificationTest extends  TestBase {
  @Test
  public void testGroupModification(){
    appM.getNavigationHelper().goToGroupPage();
    int before = appM.getGroupHelper().getGroupCount();
    if(! appM.getGroupHelper().isThereAGroup()){
      appM.getGroupHelper().createGroup(new GroupData("test555", null, null));
    }
    appM.getGroupHelper().selectGroup();
    appM.getGroupHelper().initGroupModification();
    appM.getGroupHelper().fillGroupForm(new GroupData("test1", "22222", "333333"));
    appM.getGroupHelper().submitGroupModification();
    appM.getGroupHelper().returnToGroupPage();
    int after = appM.getGroupHelper().getGroupCount();
    Assert.assertEquals(after,before  );
  }
}
