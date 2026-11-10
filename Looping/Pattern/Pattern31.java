/*
A 
A B 
A B C 
A B C D 
A B C D E 
*/
class Pattern31{
   public static void main(String args[]){
       int i,j,n;
       System.out.println("Enter the values");
       n=new java.util.Scanner(System.in).nextInt();
       for(i=1;i<=n;i++){
          char ch='A';
          for(j=1;j<=i;j++){
             System.out.printf("%c ",ch);
             ch++;
          }
          System.out.println();
       }
   }
}
