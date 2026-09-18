class Age{
  public static void main(String[] args){
	  System.out.println("Enter the age1");
	  int age1= new java.util.Scanner(System.in).nextInt();
	  System.out.println("Enter the age2");
	  int age2= new java.util.Scanner(System.in).nextInt();
	  System.out.println("Enter the age3");
	  int age3= new java.util.Scanner(System.in).nextInt();
	  if(age1>age2 && age1>age3){
	    System.out.println("Max age is="+age1);
	  } else if(age2>age1 && age2>age3){
	    System.out.println("Max age is="+age2);
	  } else if(age3>age1 && age3>age2){
	    System.out.println("Max age is="+age3);
	  }
	  
	  if(age1<age2 && age1<age3){
	    System.out.println("Min age is="+age1);
	  } else if(age2<age1 && age2<age3){
	    System.out.println("Min age is="+age2);
	  } else if(age3<age1 && age3<age2){
	    System.out.println("Min age is="+age3);
	  }
  }
}
