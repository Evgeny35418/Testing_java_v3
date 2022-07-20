package testing.java.auto.addressbook;

import org.testng.annotations.*;


public class DemoTests extends DemoTestsBase {

  @Test
  public void testDemoTests() throws Exception {
    methodsDemoClass.goToPageRzd();
    methodsDemoClass.departureFrom("Санкт-Петербург");
    methodsDemoClass.ArriveTo("Казань");
    methodsDemoClass.dataFrom("3");
    methodsDemoClass.dataTo("26");
    methodsDemoClass.clickSearch();
    methodsDemoClass.resultSearch();
    methodsDemoClass.clickTicket();
    methodsDemoClass.goToPageRzd();

  }


}
