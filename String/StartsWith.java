class StartsWith{
   public static void main(String args[]){
      String str=new String("Welcome to Tutorials of String");
      System.out.print("Return Value: ");
      System.out.println(str.startsWith("Welcome"));
      System.out.print("Return Value: ");
      System.out.println(str.startsWith("Tutorials"));
      System.out.print("Return Value: ");
      System.out.println(str.startsWith("Tutorials",11));
   }
}
/*
Return Value: true
Return Value: false
Return Value: true
*/
