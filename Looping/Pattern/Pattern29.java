/*
1 
3 2 
5 4 3 
7 6 5 4 
9 8 7 6 5 
*/
class Pattern29{
   public static void main(String args[]){
       int i,j,n;
       System.out.println("Enter the values");
       n=new java.util.Scanner(System.in).nextInt();
       for(i=1;i<=n;i++){
          for(j=2*i-1;j>=i;j--){
             System.out.printf("%d ",j);
          }
          System.out.println();
       }
   }
}
