class Fibonacci{
   public static void main(String args[]){
       int i,n;
       //intialize the first and second terms
       int t1=0,t2=1;
       //intialize the next term (3rd term)
       int nextTerm=t1+t2;
       // get no of terms from user
       System.out.printf("Enter the number of terms:");
       n=new java.util.Scanner(System.in).nextInt();
       //print the first two terms t1 and t2
       System.out.printf("Fibonacci Series: %d, %d",t1,t2);
       //print the 3rd to nth terms
       for(i=3;i<=n;++i){
          System.out.printf("%d, ",nextTerm);
          t1=t2;
          t2=nextTerm;
          nextTerm=t1+t2;
       }
   }
}
