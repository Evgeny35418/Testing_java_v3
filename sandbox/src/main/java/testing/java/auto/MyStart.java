package testing.java.auto;

import java.sql.SQLOutput;

public class MyStart{
   public static void main( String[] args){

       System.out.println("Hello,World!");
       speak("Russia");
       speak("Albert");
       speak("Piter");
       double B = 5;
       System.out.println("Площадь квадрата со стороной " + B + "= "+ number(B));
       double A = 4;
       double C = 6;
       System.out.println("Площадь прямоугольника со сторонами "+ A +" и " + C + "= "+ number2(A,C));

  }
  public static void speak(String i){
     System.out.println("Hello, " + i);
  }
  public static double number(double i){
     return i*i;
  }
  public static double number2( double A, double B){
     return A*B;
  }
}