class GetChars{
   public static void main(String args[]){
       String str=new String("Welcome to Tutorials of String");
       char[] str1=new char[7];
       char c[]=str.toCharArray();
       try{
          str.getChars(2,9,str1,0);
          System.out.print("Copied Values = ");
          for(int i=0;i<str1.length;i++){
             System.out.print(str1[i]);
          }
          System.out.println("");
          for(int i=0;i<c.length;i++){
              System.out.print(c[i]);
          }
       }catch(Exception e){
           System.out.println("Raised Exception...");
       }
   }
}
/*
Copied Values = lcome t
*/
