/*
Enter the no of rows
3
Enter the no of columns
3
Enter the input elemnets
1
23
45
56
78
98
2
3
5
print the array:
1       23      45
56      78      98
2       3       5
Max Element array: 78
*/
import java.util.Scanner;
class TriangleBMax{
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
       int max=arr[0][0];
       //Max Element
       for(i=0;i<rows;i++){
          for(j=0;j<col;j++){
              if(i>=j){
                if(max<arr[i][j]){
                    max=arr[i][j];
                }
              }
          }
       }
       System.out.println("Max Element array: "+max);
    }
}
/*
Condition	Meaning
i == j	Main diagonal
i < j	Diagonal ke upar
i > j	Diagonal ke neeche
i <= j	Upper triangle, diagonal included
i >= j	Lower triangle, diagonal included
 */