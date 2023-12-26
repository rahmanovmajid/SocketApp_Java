package com.soc;

import java.io.*;
import java.net.Socket;

public class SocClient {

    public static void main(String[] args) throws IOException {

        String ip = "localhost";
        int port = 9999;
        Socket s = new Socket(ip, port);

        String str = "Majid";

        OutputStreamWriter os = new OutputStreamWriter(s.getOutputStream());

        PrintWriter out = new PrintWriter(os);

        out.println(str);

        os.flush();// buffer size is limited

        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

        String nickname = br.readLine();

        System.out.println("Data from Server" + nickname);


    }
}
