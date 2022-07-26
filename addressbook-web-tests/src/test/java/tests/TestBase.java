package tests;

import appmanager.ApplicationManager;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {

  protected static final ApplicationManager appM = new ApplicationManager(BrowserType.CHROME);

  @BeforeSuite(alwaysRun = true)
  public void setUp() throws Exception {
    appM.init();
  }

  @AfterSuite(alwaysRun = true)
  public void tearDown() throws Exception {
    appM.stop();

  }


}
