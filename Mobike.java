class Mobike{
  public static void main(String[] args){
    int charge=0;
    System.out.println("Enter Bike no: ");
    String bno= new java.util.Scanner(System.in).nextLine();
    System.out.println("Enter Customer Name: ");
    String name= new java.util.Scanner(System.in).nextLine();
    System.out.println("Enter number of days: ");
    int days= new java.util.Scanner(System.in).nextInt();
    if(days<=5) {
      charge= days*500;
    }else if(days>5 && days<=10) {
      charge= 2500+400*(days-5);
    }else if(days>10){
      charge= 2500+2000+200*(days-10);
    }
    System.out.print("Bike no"+"\t\t"+"Customer name"+"\t"+"Days"+"\t"+"Charge");
    System.out.println("");
    System.out.print(bno+"\t\t");
    System.out.print(name+"\t");
    System.out.print(days+"\t");
    System.out.print(charge+"\t");
  }
}
