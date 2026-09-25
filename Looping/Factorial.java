class Factorial{
  public static void main(String args[])throws java.io.IOException{
     int n,i;
     int fact=1;
     System.out.printf("Enter the integer: ");
     n=new java.util.Scanner(System.in).nextInt();
     if(n<0){
       System.out.printf("Error! Factorial of a negative number does't exist");
     }else{
       for(i=1; i<=n;i++){
          fact *=i;
       }
       System.out.printf("Factorial of %d = %d",n,fact);
     }
  }
}
