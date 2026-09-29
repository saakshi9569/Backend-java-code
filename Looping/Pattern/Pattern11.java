/*
1 1 1 1 1 
0 0 0 0 0 
1 1 1 1 1 
0 0 0 0 0 
1 1 1 1 1 
*/
class Pattern11{
  public static void main(String args[]){
     int i,j;
     int temp=0;
     System.out.println("Enter the number");
     int n=new java.util.Scanner(System.in).nextInt();
     for(i=1;i<=n;i++){
       if(temp==1)
          temp=0;
       else
          temp=1;
       for(j=1;j<=n;j++){
          System.out.printf("%d ",temp);
       }
       System.out.println();
     }
  }
}
