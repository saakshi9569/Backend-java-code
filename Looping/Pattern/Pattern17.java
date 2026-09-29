/*
5 4 3 2 1 
5 4 3 2 1 
5 4 3 2 1 
5 4 3 2 1 
5 4 3 2 1 
*/
class Pattern17{
  public static void main(String args[]){
     int i,j;
     System.out.println("Enter the number:");
     int n=new java.util.Scanner(System.in).nextInt();
     for(i=n;i>=1;i--){
        for(j=n;j>=1;j--){
           System.out.printf("%d ",j);
        }
        System.out.println();
     }
  }
}
