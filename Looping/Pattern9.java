/*
1 2 3 4 5 
6 7 8 9 10 
11 12 13 14 15 
16 17 18 19 20 
21 22 23 24 25 
*/
class Pattern9{
  public static void main(String args[]){
     int i,j;
     int temp=1;
     System.out.println("Enter the number");
     int n=new java.util.Scanner(System.in).nextInt();
     for(i=1;i<=n;i++){
        for(j=1;j<=n;j++){
           System.out.printf("%d ",temp);
           temp++;
        }
        System.out.println();
     }
  }
}
