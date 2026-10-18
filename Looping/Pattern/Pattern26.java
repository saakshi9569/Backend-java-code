/*
1 
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5 
*/
class Pattern26{
   public static void main(String args[]){
      int i,j,n;
      System.out.println("Enter the values");
      n=new java.util.Scanner(System.in).nextInt();
      for(i=1;i<=n;i++){
         for(j=1;j<=i;j++){
            System.out.printf("%d ",i);
         }
         System.out.println();
      }
   }
}
