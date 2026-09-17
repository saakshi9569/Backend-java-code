class Rectangle{
  //public static void main(String... s)
  public static void main(String[] args){
    System.out.println("Enter the length:");
    int l=new java.util.Scanner(System.in).nextInt();
    System.out.println("Enter the breadth:");
    int b=new java.util.Scanner(System.in).nextInt();
    if(l==b){
      System.out.println("it is a square");
    }else {
      System.out.println("it is rectangle");
    }
  }
}
