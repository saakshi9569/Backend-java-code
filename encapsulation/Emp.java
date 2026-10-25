class Emp{
   static String cname="Tcs";
   String name;
   int salary;
   void get(String S1, int S2){
      name=S1;
      salary=S2;
   }
   void show(){
     System.out.println(name);
     System.out.println(salary);
     System.out.println(cname);
   }
   static int add(int a,int b){
     return a+b;
   }
   public static void main(String args[]){
      Emp e1=new Emp();
      e1.get("lalu",5000);
      e1.show();
      System.out.println(cname);
      System.out.println(Emp.cname);
      int z=Emp.add(10,20);
      System.out.println(z);
      z=add(10,20);
      System.out.println(z);
   }
}
class Demo{
  public static void main(String args[]){
     Emp e2=new Emp();
     e2.get("rabi",6555);
     e2.show();
     int z=Emp.add(10,30);
     System.out.println(z);
     System.out.println(e2.cname);
  }
}
/*
Emp.java
lalu
5000
Tcs
Tcs
Tcs
30
30
_________________________________
Demo.java
rabi
6555
Tcs
40
Tcs

*/

