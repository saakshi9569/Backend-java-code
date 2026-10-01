package p3;
public class PStatic{
  public static int x=100;
  public static void show(){
     System.out.println("pkg p3");
  }
  public void show1(){
     System.out.println("pkg p3 via show1(non-static)");
  }
  public static void main(String args[]){
     new PStatic().show();
     new PStatic().show1();
  }
}
