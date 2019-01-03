package com.gupao.multicast;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;

/**
 * Created by liujiatai on 2018/12/25.
 */
public class MulticaseClient {

    public static void main(String[] args) {
        try {
            InetAddress group = InetAddress.getByName("224.1.2.3");
            MulticastSocket socket = new MulticastSocket(8888);
            socket.joinGroup(group);

            byte[] bytes = new byte[222];

            while (true) {
                DatagramPacket packet = new DatagramPacket(bytes, bytes.length);
                socket.receive(packet);
                String data = new String(packet.getData());
                System.out.println(data);
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
