/*
*****
*****
*****
*****
*****
*/
class Pattern6{
  public static void main(String args[]){
     int i,j;
     System.out.println("Enter the number");
     int n=new java.util.Scanner(System.in).nextInt();
     for(i=1;i<=n;i++){
        for(j=1;j<=n;j++){
           System.out.printf("*");
        }
        System.out.println();
     }
  }
}
