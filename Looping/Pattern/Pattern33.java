/*
* 
1 2 
* * * 
1 2 3 4 
* * * * *  
*/
class Pattern33{
   public static void main(String args[]){
      int i,j,n;
      System.out.println("Enter the values");
      n=new java.util.Scanner(System.in).nextInt();
      for(i=1;i<=n;i++){
         for(j=1;j<=i;j++){
            if(i%2==0){
               System.out.printf("%d ",j);
            }else {
               System.out.printf("* ");
            }
         }
         System.out.println();
      }
   }
}
