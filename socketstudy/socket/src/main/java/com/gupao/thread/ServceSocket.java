package com.gupao.thread;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by liujiatai on 2018/12/24.
 */
public class ServceSocket {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(8888);
            Socket socket = serverSocket.accept();
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String readLine = reader.readLine();
            //if (null == readLine) break;
            System.out.print(readLine);
            socket.shutdownInput();

            PrintWriter writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
            writer.write("客户端,你好!");
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
           if (serverSocket != null) {
                serverSocket.close();
            }
        }

     /*   *//**
         * 基于TCP协议的Socket通信，实现用户登录，服务端
         *//*
//1、创建一个服务器端Socket，即ServerSocket，指定绑定的端口，并监听此端口
        ServerSocket serverSocket =new ServerSocket(10086);//1024-65535的某个端口
//2、调用accept()方法开始监听，等待客户端的连接
        Socket socket = serverSocket.accept();
//3、获取输入流，并读取客户端信息
        InputStream is = socket.getInputStream();
        InputStreamReader isr =new InputStreamReader(is);
        BufferedReader br =new BufferedReader(isr);
        String info =null;
        while((info=br.readLine())!=null){
            System.out.println("我是服务器，客户端说："+info);
        }
        socket.shutdownInput();//关闭输入流
//4、获取输出流，响应客户端的请求
        OutputStream os = socket.getOutputStream();
        PrintWriter pw = new PrintWriter(os);
        pw.write("欢迎您！");
        pw.flush();


//5、关闭资源
        pw.close();
        os.close();
        br.close();
        isr.close();
        is.close();
        socket.close();
        serverSocket.close();*/
    }
}
