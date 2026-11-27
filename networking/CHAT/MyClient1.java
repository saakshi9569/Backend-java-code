package CHAT;
import java.net.*;
import java.io.*;

public class MyClient1 {
    Socket s;
    DataInputStream din;
    DataOutputStream dout;
    public MyClient1(){
        try{
            s=new Socket("localhost",5000);
            System.out.println(s.getLocalPort());
            System.out.println(s);
            din=new DataInputStream(s.getInputStream());
            dout=new DataOutputStream(s.getOutputStream());
            clientChat();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public void clientChat() throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s1;
        do{
            s1=br.readLine();
            dout.writeUTF(s1);
            dout.flush();
            System.out.println("Server Message: "+din.readUTF());
        }while(!s1.equals("stop"));
    }
    public static void main(String ar[]){
        new MyClient1();
    }
}


/*
myServer1:-----

59470
Socket[addr=localhost/127.0.0.1,port=5000,localport=59470]
hi
Server Message: hello
im good
Server Message: i ma also good
 */


/*
for MyServer:-----------
38410
Socket[addr=localhost/127.0.0.1,port=5000,localport=38410]
hello
Server Message: hellohello
iindia is a good country
Server Message: helloiindia is a good country
stop
Server Message: hellostop

 */
