/*
1 
2 3 
3 4 5 
4 5 6 7 
5 6 7 8 9 
*/
class Pattern28{
   public static void main(String args[]){
       int i,j,n;
       System.out.println("Enter the values");
       n=new java.util.Scanner(System.in).nextInt();
       for(i=1;i<=n;i++){
          int temp=i;
          for(j=1;j<=i;j++){
             System.out.printf("%d ",temp);
             temp++;
          }
          System.out.println();
       }
   }
}
