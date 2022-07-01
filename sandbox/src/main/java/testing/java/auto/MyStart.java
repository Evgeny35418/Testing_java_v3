package testing.java.auto;

import com.sun.javafx.geom.RectangularShape;

import java.sql.SQLOutput;

public class MyStart {
  public static void main(String[] args) {

    System.out.println("Hello,World!");



    Square S = new Square(5);
    System.out.println("Площадь квадрата со стороной " + S.A + "= " + S.number());

    Rectangle A = new Rectangle(4, 6);
    System.out.println("Площадь прямоугольника со сторонами " + A.a + " и " + A.b + "= " + A.number2());

    Point p1 = new Point(10,15);
    Point p2 = new Point(17,20);
    System.out.println("Расстояние между точками = " + distance(p1,p2)); // вызываем функцию
    System.out.println("Расстояние между точками = " + p2. distance(p1)); // вызываем метод

  }
 public static double distance( Point p1,Point p2){
    return Math.sqrt(Math.pow((p2.x - p1.x),2)+ Math.pow((p2.y - p1.y), 2)) ;

 }


}
