/*
5 
4 4 
3 3 3 
2 2 2 2 
1 1 1 1 1 
*/
class Pattern27{
   public static void main(String args[]){
      int i,j,n;
      System.out.println("Enter the values");
      n=new java.util.Scanner(System.in).nextInt();
      int temp=n;
      for(i=1;i<=n;i++){
         for(j=1;j<=i;j++){
            System.out.printf("%d ",temp);
         }
         temp--;
         System.out.println();
      }
   }
}
