/*
enter the no of elements
5
Enter5Elements
23
12
8
9
34
Minimum :8
*/
class Min{
  public static void main(String args[]){
      int i;
      int min=0;
      System.out.println("enter the no of elements");
      int n=new java.util.Scanner(System.in).nextInt();
      int arr[]=new int[n];
      System.out.println("Enter" + n +"Elements");
      for(i=0;i<n;i++){
         arr[i]=new java.util.Scanner(System.in).nextInt();
      }
      min=arr[0];
      for(i=0;i<n;i++){
         if(arr[i]<min){
             min=arr[i];
         }
      }
      System.out.println("Minimum :"+ min);
  }
}
