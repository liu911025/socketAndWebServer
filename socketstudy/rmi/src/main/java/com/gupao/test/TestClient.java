package com.gupao.test;

import com.gupao.api.ISayHello;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * Created by liujiatai on 2018/12/26.
 */
public class TestClient {

    public static void main(String[] args) {
        try {
            ISayHello sayHello = (ISayHello)Naming.lookup("rmi://localhost:8888/say");
            System.out.println(sayHello.sayHello("未来的你！"));
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
