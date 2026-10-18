/*
A B C D E 
* * * * * 
A B C D E 
* * * * * 
A B C D E 
*/
class Pattern23{
   public static void main(String args[]){
       int i,j,n;
       System.out.println("Enter the values");
       n=new java.util.Scanner(System.in).nextInt();
       for(i=0;i<n;i++){
          char ch='A';
          for(j=0;j<n;j++){
             if(i%2==0){
                System.out.printf("%c ",ch);
                ch++;
             }else{
                System.out.print("* ");
             }
          }
          System.out.println();
       }
   }
}
