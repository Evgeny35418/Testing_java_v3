package testing.java.auto.addressbook;

import org.testng.annotations.*;


public class DemoTests extends DemoTestsBase {

  @Test
  public void testDemoTests() throws Exception {
    goToPageRzd();
    departureFrom("Санкт-Петербург");
    ArriveTo("Казань");
    dataFrom("3");
    dataTo("26");
    clickSearch();
    resultSearch();
    clickTicket();
    goToPageRzd();

  }


}
