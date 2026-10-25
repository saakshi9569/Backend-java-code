class ValueOf{
   public static void main(String args[]){
      double d=102939939.939;
      boolean b=true;
      long l= 12342875;
      char[] arr= { 'a','b','c','d','e','f','g'};
      System.out.println("Return Value : " + String.valueOf(d));
      System.out.println("Return Value : " + String.valueOf(b));
      System.out.println("Return Value : " + String.valueOf(l));
      System.out.println("Return Value : " + String.valueOf(arr));
   }
}
/*
Return Value : 1.02939939939E8
Return Value : true
Return Value : 12342875
Return Value : abcdefg
*/
