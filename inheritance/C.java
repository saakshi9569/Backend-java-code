class A{
   A(){
      //super-> implicit super() inserted by compiler
      System.out.println("A");
   }
}
class B extends A{
   B(int x){
      //super-> implicit super() inserted by compiler
      System.out.println(x);
   }
   B(){
     //super-> implicit super() inserted by compiler
      System.out.println("B");
   }
}
class C extends B{
  C(){
    super(10);
    //this(10);
    System.out.println("C");
  }
  C(int x){
    //super-> implicit super() inserted by compiler
    System.out.println(x);
  }
  public static void main(String[] args){
     new C();  //A 10 C
     //new C(12); // A B 12
  }
}
