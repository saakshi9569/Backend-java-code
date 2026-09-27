/*
11111
22222
33333
44444
55555
*/
class Pattern8{
  public static void main(String args[]){
     int i,j;
     System.out.println("Enter the number");
     int n=new java.util.Scanner(System.in).nextInt();
     for(i=1;i<=n;i++){
        for(j=1;j<=n;j++){
           System.out.printf("%d",i);
        }
        System.out.println();
     }
  }
}
