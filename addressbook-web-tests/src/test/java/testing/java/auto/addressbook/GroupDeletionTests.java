package testing.java.auto.addressbook;

import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase {

  @Test
  public void testGroupDeletion() throws Exception {

    goToGroupPage();
    selectGroup();
    deleteGroupDelete();
    returnToGroupPage();
  }


}
