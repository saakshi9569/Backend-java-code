class A{
  {
     System.out.println("init block of Class A");
  }
  A(){
    //super();
    //init block code will be pasted here after compilation
    System.out.println("A");
  }
}
class B extends A {
   {
      System.out.println("init block of class B");
   }
   B(int x){
     //super();
    //init block code will be pasted here after compilation
    System.out.println(x);
   }
   B(){
     //super();
    //init block code will be pasted here after compilation
    System.out.println("B");
   }
}
class C extends B {
   {
      System.out.println("init block of class B");
   }
   C(int x){
     //super();
    //init block code will be pasted here after compilation
    System.out.println(x);
   }
   C(){
     //super(10);
    //init block code will be pasted here after compilation
    System.out.println("C");
   }
  public static void main(String[] args){
    //new C(); // init block of Class A  A init block of class B B  init block of class B C
    new C(12); //init block of Class A A init block of class B B init block of class B 12

  }
}

