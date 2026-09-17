class MaxValue{
  public static void main(String[] args){
     System.out.println("Enter First Number:");
     int num1 = new java.util.Scanner(System.in).nextInt();
     System.out.println("Enter Second Number:");
     int num2 = new java.util.Scanner(System.in).nextInt();  
     if(num1>num2){
       System.out.printf("Max value is: %d", + num1);
     } else {
       System.out.printf("Max value is: %d", + num2);
     }
  }
}
