package testing.java.auto.addressbook;

public class Equation {

  public double a;
  public double b;
  public double c;

  public int n;

  public Equation(double a, double b, double c) {
    this.a = a;
    this.b = b;
    this.c = c;

    double d = b * b - 4 * a * c;

     if( d > 0){
       n = 2;
     } else if(d == 0){
         n = 1;
       } else {
         n = 0;
       }
     }
  public int rootNumber(){
    return  n;
}
}

