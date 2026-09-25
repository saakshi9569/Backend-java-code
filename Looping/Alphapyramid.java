/*
   Half Pyramid of Alphabets
   A
   BB
   CCC
   DDDD
   EEEEE
   FFFFFF
*/
class Alphapyramid{
   public static void main(String args[])throws java.io.IOException{
      int i,j;
      char input, alphabet='A';
      System.out.println("Enter a uppercase character you want to print the last row");
      int x=System.in.read();
      input=(char)x;
      for(i=1; i<=(input-'A' +1);++i){
         for(j=1;j<=i;++j){
            System.out.printf("%c",alphabet);
         }
         ++alphabet;
         System.out.println("\n");
      }
   }
}
