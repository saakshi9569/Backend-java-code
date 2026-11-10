/*
1 2 3 4 5 
A B C D E 
1 2 3 4 5 
A B C D E 
1 2 3 4 5
*/
class Pattern25{
   public static void main(String args[]){
      int i,j,n;
      System.out.println("Enter the values");
      n=new java.util.Scanner(System.in).nextInt();
      for(i=1;i<=n;i++){
         char ch='A';
         for(j=1;j<=n;j++){
            if(i%2==0){
               System.out.printf("%c ",ch);
               ch++;
            }else{
               System.out.printf("%d ",j);
            }
         }
         System.out.println();
      }
   }
}
