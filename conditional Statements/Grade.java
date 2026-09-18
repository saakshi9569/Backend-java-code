class Grade{
  public static void main(String[] args){
    System.out.println("Enter the marks");
    int marks=new java.util.Scanner(System.in).nextInt();
    if(marks<25){
    } else if(marks>=25 && marks<45){
      System.out.println("Your grade is=E");
    }else if(marks>=45 && marks<50){
      System.out.println("Your grade is=D");
    }else if(marks>=50 && marks<60){
      System.out.println("Your grade is=C");
    }else if(marks>=60 && marks<80){
      System.out.println("Your grade is=B");
    }else if(marks>=80 && marks<=100){
      System.out.println("Your grade is=A");
    } else{
      System.out.println("Invalid marks");
    }
  }
}
