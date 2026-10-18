class MyAuto{
  public static void main(String args[]){
     try(Demo d=new Demo(); Demo1 d1=new Demo1();)  // Try-with-resources automatically closes resources
     {
        //System.exit(0);
        int x =10/0;
        d.show();
        d1.show1();
     }catch(ArrayIndexOutOfBoundsException e){ 
        System.out.println(e);
     }
  }
}
class Demo implements AutoCloseable{
   void show(){
      System.out.println("show");
   }
   public void close(){  // Called automatically when the resource is closed
      System.out.println("close from Demo");
   }
}
class Demo1 implements AutoCloseable{
   void show1(){
      System.out.println("show1");
   }
   public void close(){  // Called automatically when the resource is closed
      System.out.println("close from Demo1");
   }
}
/*
close from Demo1
close from Demo
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at MyAuto.main(MyAuto.java:6)
*/
