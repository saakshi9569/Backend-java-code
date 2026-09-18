class AscendingOrder{
  public static void main(String[] args){
     System.out.println("Enter the first number");
     int n1=new java.util.Scanner(System.in).nextInt();
     System.out.println("Enter the Second number");
     int n2=new java.util.Scanner(System.in).nextInt();
     System.out.println("Enter the Third number");
     int n3=new java.util.Scanner(System.in).nextInt();
     if(n1>n2 && n2>n3){
       System.out.println(n1+" "+n2+" "+n3);
     }else if(n1>n3 && n3>n2){
       System.out.println(n1+" "+n3+" "+n2);
     }else if(n2>n1 && n1>n3){
       System.out.println(n2+" "+n1+" "+n3);
     }else if(n2>n3 && n3>n1){
       System.out.println(n2+" "+n3+" "+n1);
     }else if(n3>n1 && n1>n2){
       System.out.println(n3+" "+n1+" "+n2);
     }else{
       System.out.println(n3+" "+n2+" "+n1);
     }
  }
}
