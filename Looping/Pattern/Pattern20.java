/*
Enter the no of values
5
 E  D  C  B  A 
 F  E  D  C  B 
 G  F  E  D  C 
 H  G  F  E  D 
 I  H  G  F  E 

*/
class Pattern20{
   public static void main(String args[]){
      int i,j;
      System.out.println("Enter the no of values");
      int n=new java.util.Scanner(System.in).nextInt();
      char ch='A';
      for(i=1;i<=n;i++){
         ch=(char)('A'+n-2+i);
         for(j=1;j<=n;j++){
            System.out.printf(" %c ",ch);
            ch--;
         }
         System.out.println();
      }
   }
}
