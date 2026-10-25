class Trim{
    public static void main(String args[]){
        String str=new String("  Welcome to Tutorials of String  ");
        System.out.println(str);
        System.out.println("before Trim:"+ str.length());
        System.out.println("Return Value:");
        String z=str.trim();
        System.out.println(z);
        System.out.println("after Trim:"+ z.length());
    }
}
/*
  Welcome to Tutorials of String  
before Trim:34
Return Value:
Welcome to Tutorials of String
after Trim:30
*/
