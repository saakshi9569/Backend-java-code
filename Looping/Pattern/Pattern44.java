/*
    *
   * *
  *   *
 *     *
*       *
 *     *
  *   *
   * *
    *
*/
public class Pattern44{
   public static void main(String args[]){
       int i,j;
       System.out.println("Enter the size");
       int n=new java.util.Scanner(System.in).nextInt();
       for(i=1;i<=n;i++){
           for(j=i;j<n;j++){
               System.out.print(" ");
           }
           for(j=1;j<=2*i-1;j++){
               if(j==1 || j==2*i-1){
                  System.out.print("*");
               }else{
                  System.out.print(" ");
               }
           }
           System.out.println();
       }
       for(i=n-1;i>0;i--){
           for(j=n;j>i;j--){
               System.out.print(" ");
           }
           for(j=1;j<=2*i-1;j++){
               if(j==1 || j==2*i-1){
                  System.out.print("*");
               }else{
                  System.out.print(" ");
               }
           }
           System.out.println();
       }
   }
}
