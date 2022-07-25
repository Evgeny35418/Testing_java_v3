package tests;

import model.Contact;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactDeleteTest extends TestBase{
  @Test
  public void testContactDelete(){
    int before = appM.getContactHelper().getContactCount();
    if(! appM.getContactHelper().isThereAContact()){
    appM.getContactHelper().createContact(new Contact("Jeka", "Smorzhevskij", "autotest", "saint-peterburg", "999999999", "jekaqa@mail.ru", "test1"));
    }
    appM.getNavigationContactHelper().selectContact(6);
    appM.getNavigationContactHelper().selectModificationContact();
    appM.getContactHelper().deleteContact();
    appM.getNavigationContactHelper().returnHome();
    int after = appM.getContactHelper().getContactCount();
    Assert.assertEquals(after,before -1);




  }
}
