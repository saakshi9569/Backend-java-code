/*
A 
C B 
E D C 
G F E D 
I H G F E 
*/
class Pattern32{
   public static void main(String args[]){
      int i,j,n;
      System.out.println("Enter the values");
      n=new java.util.Scanner(System.in).nextInt();
      for(i=1;i<=n;i++){
         char ch=(char)('A'+2*i-2);
         for(j=1;j<=i;j++){
            System.out.printf("%c ",ch);
            ch--;
         }
         System.out.println();
      }
   }
}
