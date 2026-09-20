class A{
  A(){
    //super() -> implicit super() inserted by compiler
    System.out.println("A");
  }
}
class B extends A {
   B(int x){
     //super() -> implicit super() inserted by compiler
    System.out.println(x);
   }
   B(){
     //super() -> implicit super() inserted by compiler
    System.out.println("B");
   }
}
class C extends B {
   {
      System.out.println("Init Block of C");
   }
   C(int x){
    //super() -> implicit super() inserted by compiler
    System.out.println(x);
   }
   C(){
    this(10);
    System.out.println("C");
    //super(10); //compiler error ( call to super must be first statement in constructor super(10);
   }
  public static void main(String[] args){
    //new C(); // A B Init Block of C  10 C
    new C(12); // A B Init Block of C  12
  }
}

