/*
1 
0 1 
0 1 0 
0 1 0 1 
0 1 0 1 0  
*/
class Pattern35{
   public static void main(String args[]){
      int i,j,n;
      System.out.println("Enter the values");
      n=new java.util.Scanner(System.in).nextInt();
      for(i=1;i<=n;i++){
         for(j=1;j<=i;j++){
            if(i==1){
               System.out.printf("1 ");
            }else if(j%2==0){
               System.out.printf("1 ");
            }else {
               System.out.printf("0 ");
            }
         }
         System.out.println();
      }
   }
}
