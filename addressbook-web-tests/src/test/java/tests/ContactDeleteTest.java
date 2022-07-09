package tests;

import org.testng.annotations.Test;

public class ContactDeleteTest extends TestBase{
  @Test
  public void testContactDelete(){
    appM.getNavigationContactHelper().initContactModification();
    appM.getContactHelper().deleteContact();
    appM.getNavigationContactHelper().returnHome();




  }
}
