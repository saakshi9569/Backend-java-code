/*
Enter the no of rows
2
Enter the no of columns
3
23
45
89
100
2
4
Minimum :2
*/
class Min2D{
   public static void main(String args[]){
      int i,j;
      int min=0;
      System.out.println("Enter the no of rows");
      int r=new java.util.Scanner(System.in).nextInt();
      System.out.println("Enter the no of columns");
      int c=new java.util.Scanner(System.in).nextInt();
      int z[][]=new int[r][c];
      for(i=0;i<r;i++){
         for(j=0;j<c;j++){
            z[i][j]=new java.util.Scanner(System.in).nextInt();
         }
      }
      min=z[0][0];
      for(i=0;i<r;i++){
         for(j=0;j<c;j++){
            if(z[i][j]<min){
               min=z[i][j];
            }
         }
      }
      System.out.println("Minimum :"+min);
   }
}
