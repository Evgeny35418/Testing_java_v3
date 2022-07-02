package testing.java.auto;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSquare {

@Test
  public void testNumber(){
    Square i = new Square(5);
     Assert.assertEquals(i.number(),24.0);
  }
}
