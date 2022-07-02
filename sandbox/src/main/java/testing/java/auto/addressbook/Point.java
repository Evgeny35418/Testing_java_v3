package testing.java.auto.addressbook;

public class Point {
 double x;
 double y;

 public Point(double x, double y) {
  this.x = x;
  this.y = y;
 }

 public double distance(Point p1) {
  return Math.sqrt(Math.pow((this.x - p1.x), 2) + Math.pow((this.y - p1.y), 2));

 }
}