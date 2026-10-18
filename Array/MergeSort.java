/*
Enter the no of Elements in array:
6
Enter elements of array:
90
23
67
34
4
6
Before sort array:
90 23 67 34 4 6 
After Sort:
4 6 23 34 67 90
*/
import java.util.Scanner;
class MergeSort{

   static void mergeSort(int arr[], int left, int right){
        if(left<right){
            int mid=(left+right)/2;

            mergeSort(arr,left,mid);
            mergeSort(arr,mid+1,right);

            merge(arr,left,mid,right);
        }
   }

   static void merge(int arr[], int left, int mid, int right){
        int n1=mid-left+1;
        int n2=right-mid;
        int a[]=new int[n1];
        int b[]=new int[n2];
        for(int i=0;i<n1;i++){
            a[i]=arr[left+i];
        }
        for(int j=0;j<n2;j++){
            b[j]=arr[mid+1+j];
        }
        int i=0,j=0,k=left;
        //compare and merge
        while(i<n1 && j<n2){
           if(a[i]<=b[j]){
               arr[k]=a[i];
               i++;
           }else{
               arr[k]=b[j];
               j++;
           }
           k++;
        }
        // Copy remaining elements from left array
        while(i<n1){
            arr[k]=a[i];
            i++;
            k++;
        }
        // Copy remaining elements from second array
        while(j<n2){
            arr[k]=a[j];
            j++;
            k++;
        }
   }
   public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i,j;
        System.out.println("Enter the no of Elements in array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements of array:");
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Before sort array:");
        for(i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        mergeSort(arr, 0 , n-1);
        System.out.println("\nAfter Sort:");
        for(int x: arr){
            System.out.print(x + " ");
        }
   }
}