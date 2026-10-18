/*
Enter the no of Elements for first array:
3
Enter elements of first:
12
23
45
First array:
12 23 45 
Enter the no of Elements for second array:
5
Enter elements of Second:
12
34
67
78
89
Second array:
12 34 67 78 89 
Intersection:
12
*/
import java.util.Scanner;
class Intersection{
    public static void main(String args[]){
        int i,j,n1,n2,k=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of Elements for first array:");
        n1=sc.nextInt();
        int arr1[]=new int[n1];
        System.out.println("Enter elements of first:");
        for(i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("First array:");
        for(i=0;i<n1;i++){
            System.out.print(arr1[i]+ " ");
        }
        System.out.println("\nEnter the no of Elements for second array:");
        n2=sc.nextInt();
        int arr2[]=new int[n2];
        System.out.println("Enter elements of Second:");
        for(i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }
        System.out.println("Second array:");
        for(i=0;i<n2;i++){
             System.out.print(arr2[i]+ " ");
        }
        //intersection array
        int res[]=new int[Math.min(n1,n2)];
        for(i=0;i<n1;i++){
            for(j=0;j<n2;j++){
                if(arr1[i]==arr2[j]){
                    res[k]=arr1[i];
                    k++;
                    break;
                }
            }
        }
        System.out.println("\nIntersection:");
        for(i=0;i<k;i++){
            System.out.print(res[i]+" ");
        }
        
    }
}