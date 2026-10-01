class LocalBlock{
   public static void main(String[] args){
      int y=40;
      {
         int x=20;
         System.out.println(x); //20
      }
      System.out.println(y); //40
      //System.out.println(x); // compilation error
   }
}
