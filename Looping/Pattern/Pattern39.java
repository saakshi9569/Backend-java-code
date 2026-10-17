/*
    * 
   * * 
  * * * 
 * * * * 
* * * * * 
*/
class Pattern39{
   public static void main(String args[]){
      int i,j,n;
      System.out.println("Enter the values");
      n=new java.util.Scanner(System.in).nextInt();
      for(i=1;i<=n;i++){
         for(j=i;j<n;j++){
            System.out.printf(" ");
         }
         for(j=1;j<=i;j++){
            System.out.printf("* ");
         }
         System.out.println();
      }
   }
}
