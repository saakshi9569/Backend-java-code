/*
ABCDE
BCDEF
CDEFG
DEFGH
EFGHI

*/
class Pattern19{
   public static void main(String args[]){
      int i,j;
      System.out.println("Enter the number");
      int n=new java.util.Scanner(System.in).nextInt();
      for(i=0;i<n;i++){
         char ch='A';
         ch+=i;
         for(j=1;j<=n;j++){
            System.out.print(ch+"");
            ch++;
         }
         System.out.println();
      }
   }
}
