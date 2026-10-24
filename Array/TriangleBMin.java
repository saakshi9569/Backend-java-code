/*
Enter the no of rows
3
Enter the no of columns
3
Enter the input elements
1
34
5
6
89
23
45
6
7
print the array:
1       34      5
6       89      23
45      6       7
Min Element array: 1
*/
import java.util.Scanner;
class TriangleBMin{
    public static void main(String args[]){
       int i,j;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the no of rows");
       int rows=sc.nextInt();
       System.out.println("Enter the no of columns");
       int col=sc.nextInt();
       int arr[][]=new int [rows][col];
       System.out.println("Enter the input elements");
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
       int min=arr[0][0];
       //Max Element
       for(i=0;i<rows;i++){
          for(j=0;j<col;j++){
              if(i>=j){
                if(min>arr[i][j]){
                    min=arr[i][j];
                }
              }
          }
       }
       System.out.println("Min Element array: "+min);
    }
}