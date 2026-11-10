/*
print this pattern
    *
   **
  ***
 ****
*****
*/
class Pattern38{
   public static void main(String args[]){
      int i,j,n;
      System.out.println("Enter the values");
      n=new java.util.Scanner(System.in).nextInt();
      for(i=1;i<=n;i++){
         //for space
         for(j=1;j<=n-i;j++){
            System.out.print(" ");
         }
         //for pattern
         for(j=1;j<=i;j++){
            System.out.print("*");
         }
         System.out.println();
      }
   }
}
 
 //or
/*
class Pattern38{
   public static void main(String args[]){
      int i,j,n,sp=0;
      System.out.println("Enter the values");
      n=new java.util.Scanner(System.in).nextInt();
      for(i=1;i<=n;i++){
         sp=n-i;
         for(j=0;j<n;j++){
            if(sp>0){
               System.out.print(" ");
               sp--;
            }else{
               System.out.print("*");
            }
         }
         System.out.println();
      }
   }
}
*/
