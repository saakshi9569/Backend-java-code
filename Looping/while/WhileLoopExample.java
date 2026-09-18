class WhileLoopExample{
   public static void main(String[] args){
      System.out.println("Enter the no");
      int no=new java.util.Scanner(System.in).nextInt();
      int i=0;
      while(i<=no){
        System.out.println("no="+i);
        i++;
      }
   }
}
