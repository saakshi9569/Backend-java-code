/*
Enter the no of elements:
5
100
23
45
67
2
Sorted elements:
2 23 45 67 100
*/
class Sort{
   public static void main(String args[]){
      int i,j;
      int temp=0;
      System.out.println("Enter the no of elements:");
      int n=new java.util.Scanner(System.in).nextInt();
      int z[]=new int[n];
      for(i=0;i<n;i++){
         z[i]=new java.util.Scanner(System.in).nextInt();
      }
      temp=z[0];
      for(i=0;i<n-1;i++){
         for(j=0;j<n-i-1;j++){
            if(z[j]>z[j+1]){
              temp=z[j];
              z[j]=z[j+1];
              z[j+1]=temp;
           }
         }
      }
      System.out.println("Sorted elements:");
        for (i = 0; i < n; i++) {
            System.out.print(z[i] + " ");
        }
      System.out.println();
   }
}
