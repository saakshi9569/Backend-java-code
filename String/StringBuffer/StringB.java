class StringB{
   public static void main(String args[]){
      StringBuffer sb= new StringBuffer();
      //StringBuffer sb= new StringBuffer(20);
      //StringBuffer sb= new StringBuffer("javaprogram");
      System.out.println(sb.length());
      System.out.println(sb.capacity());
      StringBuffer sb1=sb.append("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
      System.out.println("after append:");
      System.out.println(sb.length());
      System.out.println(sb.capacity());
      sb.append("q");
      System.out.println("after second append:");
      System.out.println(sb.length());
      System.out.println(sb.capacity());
   }
}
/*
0
16
after append:
35
35
after second append:
36
72
*/

