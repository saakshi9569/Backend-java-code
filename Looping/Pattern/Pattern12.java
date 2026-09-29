/*
1 2 3 4 5 
2 3 4 5 6 
3 4 5 6 7 
4 5 6 7 8 
5 6 7 8 9 
*/
class Pattern12{
  public static void main(String args[]){
     int i,j;
     int temp=0;
     System.out.println("Enter the number");
     int n=new java.util.Scanner(System.in).nextInt();
     for(i=1;i<=n;i++){
       temp=i;
       for(j=1;j<=n;j++){
          System.out.printf("%d ",temp);
          temp++;
       }
       System.out.println();
     }
  }
}
