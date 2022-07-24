package testing.java.auto.addressbook;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class DemoTestsBase {

  protected final MethodsDemoClass methodsDemoClass = new MethodsDemoClass();

  @BeforeMethod(alwaysRun = true)
  public void setUp() throws Exception {
    methodsDemoClass.start();
  }

  @AfterMethod(alwaysRun = true)
  public void tearDown() throws Exception {
    methodsDemoClass.theEndTest();

  }

}

