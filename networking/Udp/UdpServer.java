package Udp;
import java.net.*;
import java.io.*;

public class UdpServer {
    public static void main(String s1[])throws Exception{
        DatagramSocket ds=new DatagramSocket(5000);
        byte b[]=new byte[1024];
        DatagramPacket dp=new DatagramPacket(b, b.length);
        ds.receive(dp);
        String r=new String(dp.getData());
        System.out.println(r.trim());
    }
}

/*
india is a good country
 */
