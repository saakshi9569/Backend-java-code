/*
A 
B C 
C D E 
D E F G 
E F G H I 
*/
class Pattern36{
   public static void main(String args[]){
      int i,j,n;
      System.out.println("Enter the values");
      n=new java.util.Scanner(System.in).nextInt();
      for(i=1;i<=n;i++){
         char ch=(char)('A'+i-1);
         for(j=1;j<=i;j++){
            System.out.printf("%c ",ch);
            ch++;
         }
         System.out.println();
      }
   }
}
