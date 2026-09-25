//programs to calculate the sum of numbers(10 numbers max)
//If the user enters a negative number,it is not added to result
class Continue{
  public static void main(String args[])throws java.io.IOException{
     int i;
     double number,sum=0.0;
     for(i=1;i<=10;++i){
         System.out.printf("Enter a no %d:",i);
         number=new java.util.Scanner(System.in).nextInt();
         if(number<0.0){
            continue;
         }
         sum+=number; //sum=sum+number
         System.out.println("The sum of numbers are="+sum);
     }
  }
}
