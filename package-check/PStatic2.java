/*
case of static
pkg p3
case of non-static
pkg p3
pkg p3 via show1(non-static)
*/
package p4;
import static p3.PStatic.*;//this work only in case of static
//import p3.PStatic;//this work for both static and non static
import static java.lang.System.*;
public class PStatic2{
  public static void main(String args[]){
     //for static case
     out.println(PStatic.x);
     show();
     new PStatic().show1();
     //Non-static
     //System.out.println(PStatic.x);
     //PStatic.show();
     //new PStatic().show1();
  }
}

