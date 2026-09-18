class EmployeeDetails{
  public static void main(String[] args){
    System.out.println("Enter your age:");
    int age=new java.util.Scanner(System.in).nextInt();
    System.out.println("Enter your Sex(M or F)");
    char sex=new java.util.Scanner(System.in).next().charAt(0);
    System.out.println("Enter your Marital Status(Y or N):");
    char marital_status=new java.util.Scanner(System.in).next().charAt(0);
     if(sex == 'F' || sex == 'f'){
	 System.out.println("Work in Urban Areas");
     } else if((sex == 'M' || sex == 'm') && (20<=age && age<=40)){
	 System.out.println("Remotly work");
     } else if((sex == 'M' || sex == 'm') && (40<=age && age<=60)){
	 System.out.println("Work in Urban Areas");
     } else{
	 System.out.println("Error");
     }
  }
}
