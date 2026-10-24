/*
Enter the no of rows
3
Enter the no of columns
3
Enter the input elemnets
12
23
34
56
22
3
4
5
5
print the array:
12      23      34
56      22      3
4       5       5
Max Element array: 34
*/
import java.util.Scanner;
class TriangleASum{
    public static void main(String args[]){
       int i,j;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the no of rows");
       int rows=sc.nextInt();
       System.out.println("Enter the no of columns");
       int col=sc.nextInt();
       int arr[][]=new int [rows][col];
       System.out.println("Enter the input elemnets");
       for(i=0;i<rows;i++){
           for(j=0;j<col;j++){
               arr[i][j]=sc.nextInt();
           }
       }
       System.out.println("print the array:");
       for(i=0;i<rows;i++){
           for(j=0;j<col;j++){
               System.out.print(arr[i][j]+"\t");
           }
           System.out.println();
       }
       int sum=0;
       //Max Element
       for(i=0;i<rows;i++){
          for(j=0;j<col;j++){
              if(i<=j){   //for upper triangular matrix
                  sum+=arr[i][j];
              }
          }
       }
       System.out.println("Sum of upper triangular matrix: "+sum);
    }
}