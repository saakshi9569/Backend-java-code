import java.io.*;
import java.io.*;
class ThrowsException1{
   void show()throws IOException
   {
      System.out.println("base");
   }
   ThrowsException1()throws IOException
   {
   }
}
/*-------child class---------*/
class Child extends ThrowsException1{
   Child()throws IOException{
   }
   void show()//throws Exception
   {
      System.out.println("child");
   }
   public static void main(String args[])throws IOException
   {
      Child c=new Child();
      c.show();
   }
}
