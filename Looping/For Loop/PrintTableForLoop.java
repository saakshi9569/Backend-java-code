class PrintTableForLoop{
  public static void main(String[] args){
     System.out.println("Enter the no for table");
     int n=new java.util.Scanner(System.in).nextInt();
     for(int i=1;i<=10;i++){
       System.out.printf("%d * %d = %d", n,i,n*i);
       //System.out.println(n*i);
       System.out.println();
     }
  }
}
