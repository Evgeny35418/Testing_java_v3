package testing.java.auto.addressbook;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPoint {

 @Test
  public void testDistance1(){
   Point a = new Point(20,35);
   Point b = new Point( 8,10);
  Assert.assertEquals(b.distance(a), 30.0);
 }
 @Test
  public void testDistance2(){
  Point a = new Point(15,20);
  Point b = new Point( 3, 7);
  Assert.assertEquals(b.distance(a), 0.0);
 }
 @Test
 public void testDistance3(){
  Point a = new Point(100, 250);
  Point b = new Point(-75,300);
  Assert.assertEquals(b.distance(a),182.00274723201295);
 }


}
