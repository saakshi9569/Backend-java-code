/*
E  E  E  E  E 
D  D  D  D  D 
C  C  C  C  C 
B  B  B  B  B 
A  A  A  A  A 
*/
class Pattern21{
   public static void main(String args[]){
       int i,j;
       System.out.println("enter the no");
       int n=new java.util.Scanner(System.in).nextInt();
       int ch='A';
       ch=(char)('A'+n-1);
       for(i=0;i<n;i++){
          for(j=0;j<n;j++){
             System.out.printf(" %c ",ch);
          }
          ch--;
          System.out.println();
       }
   }
}
