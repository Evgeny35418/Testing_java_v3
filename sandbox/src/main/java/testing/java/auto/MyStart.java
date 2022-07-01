package testing.java.auto;

import com.sun.javafx.geom.RectangularShape;

import java.sql.SQLOutput;

public class MyStart{
   public static void main( String[] args){

      System.out.println("Hello,World!");
       speak("Russia");
       speak("Albert");
       speak("Piter");
       doom(27);


       Square S = new Square(5);
         System.out.println("Площадь квадрата со стороной " + S.A + "= "+ S.number());

     Rectangle A = new Rectangle(4,6);
       System.out.println("Площадь прямоугольника со сторонами "+ A.a +" и " + A.b + "= "+ A.number2());


     Point Q = new Point(10,15);
     System.out.println("Расстояние между двумя точками = " + Q.distance());


}
  public static void speak(String i){
     System.out.println("Hello, " + i);
  }

  public static void doom (int x){
     System.out.println("Привет, у меня день рождения " + x);

  }


  }

