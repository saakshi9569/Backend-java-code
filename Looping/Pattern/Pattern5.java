/*
1
1 2
1 2 3
1 2 3 4 
1 2 3 4 5
*/
class Pattern5{
   public static void main(String args[]){
      int i,j,rows;
      System.out.printf("Enter the integer:");
      rows=new java.util.Scanner(System.in).nextInt();
      for(i=1;i<=rows;++i){
         for(j=1;j<=i;j++){
            System.out.printf("%d ",j);
         }
         System.out.printf("\n");
      }
   }
}
