package com.gupao.socket;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by liujiatai on 2018/12/24.
 */
public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 8888);
        PrintWriter print = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
        print.write("hello world");
        print.close();
        socket.close();
    }
}
