/*
Enter the no of rows:
2
Enter the no of Columns:
3
100
23
45
6
7
9
6 7 9 
23 45 100 
*/
class Sort2D{
   public static void main(String args[]){
      int i,j,k,l;
      System.out.println("Enter the no of rows:");
      int r=new java.util.Scanner(System.in).nextInt();
      System.out.println("Enter the no of Columns:");
      int c=new java.util.Scanner(System.in).nextInt();
      int z[][]=new int[r][c];
      for(i=0;i<r;i++){
         for(j=0;j<c;j++){
            z[i][j]=new java.util.Scanner(System.in).nextInt();
         }
      }
      int temp=z[0][0];
      for(i=0;i<r;i++){
         for(j=0;j<c;j++){
            for(k=i;k<r;k++){
               for(l=(k==i ? j+1 :0);l<c;l++){
                  if(z[i][j]>z[k][l]){
                     temp=z[i][j];
                     z[i][j]=z[k][l];
                     z[k][l]=temp;
                  }
               }
            }
         }
      }
      for(i=0;i<r;i++){
         for(j=0;j<c;j++){
            System.out.print(z[i][j] + " ");
         }
         System.out.println();
      }
   }
}
