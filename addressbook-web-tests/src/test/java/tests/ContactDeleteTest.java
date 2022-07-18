package tests;

import model.Contact;
import org.testng.annotations.Test;

public class ContactDeleteTest extends TestBase{
  @Test
  public void testContactDelete(){
    if(! appM.getContactHelper().isThereAContact()){
    appM.getContactHelper().createContact(new Contact("Jeka", "Smorzhevskij", "autotest", "saint-peterburg", "999999999", "jekaqa@mail.ru", "test1"));
    }
    appM.getNavigationContactHelper().initContactModification();
    appM.getContactHelper().deleteContact();
    appM.getNavigationContactHelper().returnHome();




  }
}
