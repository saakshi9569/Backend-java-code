/*
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 
*/
class Pattern3{
   public static void main(String args[])throws java.io.IOException{
      int i,j,rows;
      System.out.printf("Enter the integer: ");
      rows=new java.util.Scanner(System.in).nextInt();
      for(i=rows;i>=1;--i){
         for(j=1;j<=i;++j){
            System.out.printf("%d ",j);
         }
         System.out.printf("\n");
      }
   }
}
