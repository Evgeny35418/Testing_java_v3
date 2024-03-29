package tests;

import model.GroupData;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Comparator;
import java.util.List;

public class GroupModificationTest extends  TestBase {

  @BeforeMethod
  public void ensurePreconditions(){
    appM.goTo().groupPage();
    if( appM.group().list().size() == 0){
      appM.group().create(new GroupData().withName("test555"));
    }
  }

  @Test
  public void testGroupModification(){
    List<GroupData> before = appM.group().list();
    int index = before.size()-1;
    GroupData group = new GroupData().withId(before.get(index).getId()).withName("test1").withHeader("111").withFooter("222");
    appM.group().modify(group, index);
    List<GroupData> after = appM.group().list();
    Assert.assertEquals(after.size(),before.size() );

    before.remove(index);
    before.add(group);
    Comparator<? super GroupData> byId = (g1,g2) -> Integer.compare(g1.getId(), g2.getId());
    before.sort(byId);
    after.sort(byId);
    Assert.assertEquals(before,after);
  }


}
