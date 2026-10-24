/*
Enter the no of Elements in array:
3
Enter elements of array:
1
2
3
4
5
6
7
8
9
1       2       3
4       5       6
7       8       9
Diagonal Sum = 15
Row 1 Sum = 6
Row 2 Sum = 15
Row 3 Sum = 24
Column 1 Sum = 12
Column 2 Sum = 15
Column 3 Sum = 18
*/
import java.util.Scanner;
class MatrixSum{
    public static void main(String args[]){
        int i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of Elements in array:");
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        int diagonalSum=0;
        System.out.println("Enter elements of array:");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        //Diagonal Sum
        for(i=0;i<n;i++){
            diagonalSum += arr[i][i];
        }
        System.out.println("Diagonal Sum = " + diagonalSum);
        //row
        for(i=0;i<n;i++){
            int rowSum=0;
            for(j=0;j<n;j++){
                rowSum += arr[i][j];
            }
            System.out.println("Row " + (i + 1) + " Sum = " + rowSum);
        }
        //column
        for(j=0;j<n;j++){
            int colSum=0;
            for(i=0;i<n;i++){
                colSum += arr[i][j];
            }
            System.out.println("Column " + (j + 1) + " Sum = " + colSum);
        }
    }
}
