import java.io.*;
import java.util.*;
class SInput{
   public static void main(String s1[])throws IOException{
       //for two input Stream
       //SequenceInputStream sin=new SequenceInputStream(
       //               new FileInputStream("chachi.txt"),
       //               new FileInputStream("chacha.txt")
       //);
       //for more than two input Stream
       SequenceInputStream sin=new SequenceInputStream(new MyEnum());
       DataInputStream din=new DataInputStream(sin);
       String s=" ";
       while(s!=null){
          s=din.readLine();
          if(s!=null)
          System.out.println(s);
       }
       din.close();
   }
}
class MyEnum implements Enumeration{
   InputStream in[];
   int i=-1;
   MyEnum(){
      try{
         in=new InputStream[]{
                new FileInputStream("chachi.txt"),
                new FileInputStream("chacha.txt"),
                new FileInputStream("pss.txt")
            };
      }catch(Exception e){
      }
   }
   public boolean hasMoreElements(){ //Checks whether another stream exists
       System.out.println("hasMoreElements");
       if(++i<in.length)
           return true;
       else
           return false;
   }
   public Object nextElement(){ //Returns the next InputStream
       System.out.println("nextElement "+i);
       return in[i];
   }
}
/*
//for two input Stream
//SequenceInputStream sin=new SequenceInputStream(
//               new FileInputStream("chachi.txt"),
//               new FileInputStream("chacha.txt")
//);
Hello from Chachi
Hello from Chacha

-------------------------------------
//for more than two input Stream
SequenceInputStream sin=new SequenceInputStream(new MyEnum());

hasMoreElements
nextElement 0
Hello from Chachi
hasMoreElements
nextElement 1
Hello from Chacha
hasMoreElements
nextElement 2
Hello from PSS
hasMoreElements

*/
