/*
 E  D  C  B  A 
 E  D  C  B  A 
 E  D  C  B  A 
 E  D  C  B  A 
 E  D  C  B  A 
*/
class Pattern22{
   public static void main(String args[]){
      int i,j;
      System.out.println("Enter the values");
      int n=new java.util.Scanner(System.in).nextInt();
      for(i=1;i<=n;i++){
         char ch=(char)('A'+n-1);
         for(j=n;j>=1;j--){
            System.out.printf(" %c ",ch);
            ch--;
         }
         System.out.println();
      }
   }
}
