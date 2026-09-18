class Attendence{
  public static void main(String[] args){
    System.out.println("Number of classes held");
    int held= new java.util.Scanner(System.in).nextInt();
    System.out.println("Number of classes Attended");
    int attend= new java.util.Scanner(System.in).nextInt();
    int per=(attend*100)/held;
    if(per>=75){
      System.out.println("Student is allowed to sit in exam="+per);
    } else {
      System.out.println("Student is not allowed to sit in exam="+per);
    }
  }
}
