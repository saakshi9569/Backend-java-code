/*
Enter the total no of elements
5
Enter 5 elements:
12
23
34
45
10
Maximum = 45
*/
class Max{
  public static void main(String args[]){
     int i,j;
     int max=0;
     System.out.println("Enter the total no of elements");
     int n=new java.util.Scanner(System.in).nextInt();
     int z[]=new int[n];
     System.out.println("Enter " + n + " elements:");
     for(i=0;i<n;i++){
        z[i]=new java.util.Scanner(System.in).nextInt();
     }
     max=z[0];
     for(i=0;i<n;i++){
        if(z[i]>max){
            max=z[i];
        }
     }
     System.out.println("Maximum = " + max);
  }
}
