/*
Enter elements of first matrix:
1
2
3
4
5
6
7
8
9
First Matrix:
1 2 3 
4 5 6 
7 8 9 
Enter elements of second matrix:
1
2
3
4
5
6
7
8
9
Second Matrix:
1 2 3 
4 5 6 
7 8 9 
Result:
2 4 6 
8 10 12 
14 16 18 
*/
import java.util.Scanner;
class MatrixAdd{
    public static void main(String args[]){
        int i,j,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of rows and col:");
        n=sc.nextInt();
        int arr1[][]=new int[n][n];
        int arr2[][]=new int[n][n];
        int res[][]=new int[n][n];
        System.out.println("Enter elements of first matrix:");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
               arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("First Matrix:");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
               System.out.print(arr1[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("Enter elements of second matrix:");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
               arr2[i][j]=sc.nextInt();
            }
        }
        System.out.println("Second Matrix:");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
               System.out.print(arr2[i][j]+ " ");
            }
            System.out.println();
        }
        //matric add
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
               res[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        System.out.println("Result:");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
               System.out.print(res[i][j]+ " ");
            }
            System.out.println();
        }
    }
}