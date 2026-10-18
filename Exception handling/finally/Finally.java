class Finally{
   static int show(){
      try{
        //System.exit(0);
        int x=10/0;
        return 20;
      }catch(NullPointerException e){
         System.out.println(e);
      }finally{
         return 400;
      }
   }
   public static void main(String args[]){
      int z=show();
      //System.out.println(z);//400
      Finally f1=null;// Creates a reference variable f1 and assigns null to it
      f1.show();// Calls the show() method using f1; this causes a NullPointerException
// because f1 does not refer to any object
   }
}
