package com.gupao.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by liujiatai on 2018/12/24.
 */
public class servce {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(8888);
            Socket socket = serverSocket.accept();
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.print(reader.readLine());
            //reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
           /* if (serverSocket != null) {
                serverSocket.close();
            }*/
        }
    }
}
