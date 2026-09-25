/*
Enter the value1
34568
86543
Do you want to continue press 1 for yes 0 for no
1
Enter the value1
454545
545454
Do you want to continue press 1 for yes 0 for no
0
*/
class Reverse{
   public static void main(String args[]){
      int rev=0;
      int z;
      while(true){
         System.out.println("Enter the value1");
         int x1=new java.util.Scanner(System.in).nextInt();
         while(x1>0){
            z=x1%10;
            x1=x1/10;
            rev=rev*10+z;
         }
         System.out.println(rev);
         rev=0;
         System.out.println("Do you want to continue press 1 for yes 0 for no");
         int x2=new java.util.Scanner(System.in).nextInt();
         if(x2==1){
           continue;
         }else{
          break;
         }
      }
   }
}
