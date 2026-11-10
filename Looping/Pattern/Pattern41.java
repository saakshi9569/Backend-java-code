/*
1 2 3 4 5 
2       4 
3       3 
4       2 
5 4 3 2 1 
*/
class Pattern41{
   public static void main(String args[]){
      int i,j,n,temp=0;
      System.out.println("Enter the values");
      n=new java.util.Scanner(System.in).nextInt();
      for(i=1;i<=n;i++){
          temp=n;
          for(j=1;j<=n;j++){
             if(i==1){
                System.out.printf("%d ",j);
             } 
             else if(j==1){
                System.out.printf("%d ",i);
             }
             else if(j==n){
                System.out.printf("%d ",n-i+1);
                temp--;
             }else if(i==n){
                System.out.printf("%d ",temp-1);
                temp--;
             } else {
                System.out.printf("  ");
             }
          }
          System.out.println();
      }
   }
}
