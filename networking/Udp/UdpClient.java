package Udp;
import java.net.*;
import java.io.*;

public class UdpClient {
    public static void main(String s1[])throws Exception {
        DatagramSocket ds=new DatagramSocket();
        String s="india is a good country";
        byte b[]=s.getBytes();
        DatagramPacket dp=new DatagramPacket(b, b.length, InetAddress.getLocalHost(),5000);
        ds.send(dp);
    }
}
