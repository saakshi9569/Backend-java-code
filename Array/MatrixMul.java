/*
Matrix Multiplication:
24 29 
6 25 
*/
class MatrixMul{
    public static void main(String args[]){
        int i,j,n;
        int r1 = 2, c1 = 3;
        int r2 = 3, c2 = 2;
        int[][] arr1 = { {3, -2, 5}, {3, 0, 4} };
        int[][] arr2 = { {2, 3}, {-9, 0}, {0, 4} };
        int product[][] = new int[r1][c2];
        for(i=0;i<r1;i++){
            for(j=0;j<c2;j++){
                for(int k=0;k<c1;k++){ 
                    product[i][j] += arr1[i][k] * arr2[k][j]; 
                }
            }
        }
        System.out.println("Matrix Multiplication:");
        for(int []arr : product){
            for(int col : arr){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
/*
|-    (a11 x b11) + (a12 x b21) + (a13 x b31)    (a11 x b12) + (a12 x b22) + (a13 x b32)    -| (i=1 , k=2 )=> a12  , (j=1 , k=2 => b21)
|_    (a21 x b11) + (a22 x b21) + (a23 x b31)    (a21 x b12) + (a22 x b22) + (a23 x b32)    _|
*/
