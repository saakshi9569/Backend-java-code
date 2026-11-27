package CHAT;
import java.io.*;
import java.net.*;

public class MyServer {
    ServerSocket ss;
    Socket s;
    DataInputStream dis;
    DataOutputStream dos;
    public MyServer(){
        try {
            System.out.println("Server Started");
            ss=new ServerSocket(5000);
            s=ss.accept();
            System.out.println(s);
            System.out.println("Client Connected");
            dis=new DataInputStream(s.getInputStream());
            dos=new DataOutputStream(s.getOutputStream());
            serverChat();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String ar[]){
        new MyServer();
    }
    public void serverChat() throws IOException{
        String str;
        do{
            str=dis.readUTF();
            System.out.println("Client Message"+str);
            dos.writeUTF("hello"+str);
            dos.flush();
        }while(!str.equals("stop"));
    }
}

/*
Server Started
Socket[addr=/127.0.0.1,port=38410,localport=5000]
Client Connected
Client Messagehello
hi
Client Messageiindia is a good country
Client Messagestop
*/
