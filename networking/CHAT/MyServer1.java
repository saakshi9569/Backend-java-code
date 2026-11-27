package CHAT;
import java.io.*;
import java.net.*;

public class MyServer1 {
    ServerSocket ss;
    Socket s;
    DataInputStream dis;
    DataOutputStream dos;
    public MyServer1(){
        try{
            System.out.println("Server Started");
            ss=new ServerSocket(5000);
            s=ss.accept();
            System.out.println(s);
            System.out.println("Client Connected");
            dis=new DataInputStream(s.getInputStream());
            dos=new DataOutputStream(s.getOutputStream());
            serverChat();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String ar[]){
        new MyServer1();
    }
    public void serverChat()throws IOException{
        String str,s1;
        do{
            str=dis.readUTF();
            System.out.println("Client Message"+str);
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            s1=br.readLine();
            dos.writeUTF(s1);
            dos.flush();
        }while(!s1.equals("stop"));
    }
}

/*
Server Started
Socket[addr=/127.0.0.1,port=59470,localport=5000]
Client Connected
Client Messagehi
hello
Client Messageim good
i ma also good
*/
