class PrintTableDoWhile{
  public static void main(String[] args){
     int i=1;
     System.out.println("Enter the no for table");
     int n=new java.util.Scanner(System.in).nextInt();
     do{
       System.out.printf("%d * %d = %d", n,i,n*i);
       //System.out.println(n*i);
       System.out.println();
       i++;
     }while(i<=10);
  }
}
