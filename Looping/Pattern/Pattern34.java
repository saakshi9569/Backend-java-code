/*
1 
1 0 
1 0 1 
1 0 1 0 
1 0 1 0 1  
*/
class Pattern34{
   public static void main(String args[]){
      int i,j,n;
      System.out.println("Enter the values");
      n=new java.util.Scanner(System.in).nextInt();
      for(i=1;i<=n;i++){
         for(j=1;j<=i;j++){
            if(j%2==0){
               System.out.printf("0 ");
            }else {
               System.out.printf("1 ");
            }
         }
         System.out.println();
      }
   }
}
