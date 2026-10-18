class CallingChain{
   void show(){
      int x=10/0;
   }
   void display(){
      show();
   }
   void xyz(){
      display();
   }
   public static void main(String args[]){
      try{
         new CallingChain().xyz();// Creating an object and calling xyz()
      }catch(Exception e){
         System.out.println(e);// Prints the exception name and message
         e.printStackTrace();// Prints the complete stack trace
      }
   }
}
/*
java.lang.ArithmeticException: / by zero
java.lang.ArithmeticException: / by zero
	at CallingChain.show(CallingChain.java:3)
	at CallingChain.display(CallingChain.java:6)
	at CallingChain.xyz(CallingChain.java:9)
	at CallingChain.main(CallingChain.java:13)
*/
