/*
1 
2 1 
3 2 1 
4 3 2 1 
5 4 3 2 1 
*/
class Pattern30{
   public static void main(String args[]){
       int i,j,n;
       System.out.println("Enter the values");
       n=new java.util.Scanner(System.in).nextInt();
       for(i=1;i<=n;i++){
       int temp=i;
          for(j=1;j<=i;j++){
             System.out.printf("%d ",temp);
             temp--;
          }
          System.out.println();
       }
   }
}
