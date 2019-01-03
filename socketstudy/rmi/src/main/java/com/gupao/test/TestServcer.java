package com.gupao.test;

import com.gupao.api.ISayHello;
import com.gupao.api.impl.SayHelloImpl;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * Created by liujiatai on 2018/12/26.
 */
public class TestServcer {

    public static void main(String[] args) {
        try {
            ISayHello sayHello = new SayHelloImpl();
            LocateRegistry.createRegistry(8888);
            Naming.bind("rmi://localhost:8888/say", sayHello);

            System.out.println("server start success");
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (AlreadyBoundException e) {
            e.printStackTrace();
        }
    }
}
