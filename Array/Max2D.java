/*
Enter the total no of rows
3
Enter the total no of columns
2
Enter the Elements
12
23
34
56
7
8
Maximum = 56
*/
class Max2D{
  public static void main(String args[]){
     int i,j;
     int max=0;
     System.out.println("Enter the total no of rows");
     int r=new java.util.Scanner(System.in).nextInt();
     System.out.println("Enter the total no of columns");
     int c=new java.util.Scanner(System.in).nextInt();
     System.out.println("Enter the Elements");
     int z[][]=new int[r][c];
     for(i=0;i<r;i++){
       for(j=0;j<c;j++){
          z[i][j]=new java.util.Scanner(System.in).nextInt();
       }
     }
     max=z[0][0];
     for(i=0;i<r;i++){
       for(j=0;j<c;j++){
          if(z[i][j]>max){
             max=z[i][j];
          }
       }
     }
     System.out.println("Maximum = " + max);
  }
}
