/*
Enter the no of rows:
3
Enter the columns:
4
Enter the no of elements
1
2
3
4
5
6
7
8
9
12
34
56
Print the array:
1       2       3       4
5       6       7       8
9       12      34      56
Transpose of matrix:
1       5       9
2       6       12
3       7       34
4       8       56
*/
import java.util.Scanner;
class MatrixTranspose{
    public static void main(String args[]){
        int i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of rows:");
        int row=sc.nextInt();
        System.out.println("Enter the columns:");
        int col=sc.nextInt();
        int [][]array=new int[row][col];
        int [][]transpose=new int[col][row];
        System.out.println("Enter the no of elements");
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                array[i][j]=sc.nextInt();
            }
        }
        System.out.println("Print the array:");
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
        //Transpose the array
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                transpose[j][i]=array[i][j];
            }
        }
        System.out.println("Transpose of matrix:");
        for (i = 0; i < col; i++) {
            for (j = 0; j < row; j++) {
                System.out.print(transpose[i][j] + "\t");
            }
            System.out.println();
        }
    }
}