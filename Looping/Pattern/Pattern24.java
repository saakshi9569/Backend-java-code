/*
A B C D E 
a b c d e 
A B C D E 
a b c d e 
A B C D E 
*/
class Pattern24{
   public static void main(String args[]){
      int i,j,n;
      System.out.println("Enter the values");
      n=new java.util.Scanner(System.in).nextInt();
      for(i=1;i<=n;i++){
          char cap='A';
          char sm='a';
          for(j=1;j<=n;j++){
            if(i%2==0){
               System.out.printf("%c ",sm);
               sm++;
            }else{
               System.out.printf("%c ",cap);
               cap++;
            }
         }
         System.out.println();
      }
   }
}
