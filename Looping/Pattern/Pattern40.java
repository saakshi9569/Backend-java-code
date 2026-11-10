/*
* * * * *       * 
        *       * 
        *       * 
        *       * 
        * * * * *
*/
class Pattern40{
   public static void main(String args[]){
      int i,j,n;
      System.out.println("Enter the values");
      n=new java.util.Scanner(System.in).nextInt();
      for(i=1;i<=n;i++){
          for(j=1;j<=n*2-1;j++){
             if(i==1 && j<=n){
                System.out.printf("* ");
             } 
             else if(i==n && (j>=n && j>=n/2)){
                System.out.printf("* ");
             }
             else if(j==n*2/2 || j==(n*2-1)){
                System.out.printf("* ");
             } else {
                System.out.printf("  ");
             }
          }
          System.out.println();
      }
   }
}
