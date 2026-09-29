/*
* * * * * 
2 2 2 2 2 
* * * * * 
4 4 4 4 4 
* * * * *
*/
class Pattern14{
  public static void main(String args[]){
     int i,j;
     System.out.println("Enter the number");
     int n=new java.util.Scanner(System.in).nextInt();
     for(i=1;i<=n;i++){
        for(j=1;j<=n;j++){
           if(i%2==0)
              System.out.printf("%d ",i);
            else
              System.out.printf("* ");
        }
        System.out.println();
     }
  }
}
