package Url;
import java.net.*;
import java.io.*;

public class URLConnectionReader {
    static String inputLine=" ";
    public static void main(String args[])throws Exception {
        URL google = new URL("http://google.com/");
        URLConnection yc=google.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
        while(inputLine!=null){
            inputLine = in.readLine();
            System.out.println(inputLine);
        }
        in.close();
    }
}

/*
cmds
networking/	javac Url/URLConnectionReader.java
networking/Url/	javac URLConnectionReader.java>urlConnection.html
------------------
generate urlConnection.html
 */
