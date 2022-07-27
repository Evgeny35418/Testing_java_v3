package tests;

import org.testng.Assert;
import org.testng.annotations.*;
import model.GroupData;

import java.util.Comparator;
import java.util.List;


public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation()  {
    appM.goTo().groupPage();
    List<GroupData> before = appM.group().list();
    GroupData group = new GroupData().withName("test1");
    appM.group().create(group);
    List<GroupData> after = appM.group().list();
    Assert.assertEquals(after.size(),before.size() +1 );



    before.add(group);
    Comparator<? super GroupData> byId = (g1,g2) -> Integer.compare(g1.getId(), g2.getId());
    before.sort(byId);
    after.sort(byId);
    Assert.assertEquals(before,after);
  }




}
