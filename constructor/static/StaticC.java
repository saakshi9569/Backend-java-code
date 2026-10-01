class StaticC{
  static int x;
  static{
    System.out.println("static block");
    x=new java.util.Scanner(System.in).nextInt();
  }
}
class StaticTest1{
   public static void main(String[] args){
     System.out.println("main from StaticTest1");
     System.out.println(StaticC.x);
     System.out.println("After static block from StaticTest1");
     //main from StaticTest1 static block 23 23 After static block from StaticTest1
   }
}
class StaticTest2{
   public static void main(String[] args){
     System.out.println("main from StaticTest2");
     System.out.println(StaticC.x);
     System.out.println("After static block from StaticTest2");
     //main from StaticTest2 static block 213 213 After static block from StaticTest2
   }
}
