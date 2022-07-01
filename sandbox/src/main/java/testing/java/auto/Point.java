package testing.java.auto;

public class Point {

 double p1;
 double p2;

 public Point(double p1, double p2) {
  this.p1 = p1;
  this.p2 = p2;
 }

 public double distance() {
  return Math.sqrt(this.p1 + this.p2);

 }
}