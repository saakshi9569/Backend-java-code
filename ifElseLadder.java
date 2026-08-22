class ifElseLadder{
    public static void main(String[] args){
        System.out.println("Enter a Number:");
        int marks= new java.util.Scanner(System.in).nextInt();
        if(marks>75){
          System.out.println("First Class");
        } else if(marks>65){
          System.out.println("Second class");
        } else if(marks>55){
        System.out.println("Third Class");
        } else {
          System.out.println("Fourth Class");
        }
    }
}
