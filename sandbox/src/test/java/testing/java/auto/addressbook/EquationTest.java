package testing.java.auto.addressbook;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EquationTest {
  @Test
  public void test1(){
    Equation a = new Equation(1,1,1);
    Assert.assertEquals(a.rootNumber(), 0);
  }
  @Test
  public void test2(){
    Equation b = new Equation(1,2,1);
    Assert.assertEquals(b.rootNumber(),1);

  }
  @Test
  public void test3(){
    Equation c = new Equation(1,5,6);
    Assert.assertEquals(c.rootNumber(),2);



  }
}
