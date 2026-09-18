class CheckUppercase{
  public static void main(String s[])throws java.io.IOException{
    System.out.println("Enter the Characters");
    int ch=System.in.read(); //to read asciis characters
    if(ch>=65 && ch<=91){
       System.out.println("Upper case Letter");
    } else if(ch>=97 && ch<=123){
       System.out.println("Lower case Letter");
    } else {
       System.out.println("Special Characters");
    }
  }
}
