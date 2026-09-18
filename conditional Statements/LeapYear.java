class LeapYear{
   public static void main(String[] args){
     System.out.println("Enter the year");
     int year=new java.util.Scanner(System.in).nextInt();
     if(year%4 == 0 || year%400 ==0){
       System.out.println("Leap Year");
     }else{
       System.out.println("Not Leap Year");
     }
   }
}
