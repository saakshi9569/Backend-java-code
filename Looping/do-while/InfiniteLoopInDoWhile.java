//if the user enters a negative number , it is not added to the result
class InfiniteLoopInDoWhile{
   public static void main(String[] args){
      double num,sum=0.0;
      do{
         System.out.println("Enter the number");
         num=new java.util.Scanner(System.in).nextInt();
         if(num<0.0){
           break;
         }
         sum+=num;
      } while(true);
      System.out.println("The sum of the numbers are: "+sum);
   }
}
