package com.soc;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SocServer {

    public static void main(String[] args) throws IOException {

        System.out.println("Server has started");
        ServerSocket ss = new ServerSocket(9999);

        System.out.println("Server is waiting for request");

        Socket s = ss.accept();
        System.out.println("Client connected");
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

        String str = br.readLine();
        System.out.println("Client data:" + str);

        String nickname = str.substring(0, 3);

        OutputStreamWriter os = new OutputStreamWriter(s.getOutputStream());

        PrintWriter out = new PrintWriter(os);

        out.println(nickname);
        out.flush();

        System.out.println("Data has been sent to Client");

    }
}
