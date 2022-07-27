package tests;

import model.GroupData;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class GroupDeletionTests extends TestBase {
  @BeforeMethod
  public void ensurePreconditions(){
    appM.goTo().groupPage();
    if( appM.group().list().size() == 0){
      appM.group().create(new GroupData().withName("test555"));
    }
  }

  @Test
  public void testGroupDeletion() throws Exception {
    List<GroupData> before = appM.group().list();
    int index = before.size()-1;
    appM.group().delete(index);
    List<GroupData> after = appM.group().list();
    Assert.assertEquals(after.size(),before.size() -1 );

    before.remove(index);
    Assert.assertEquals( before, after);

  }




}
