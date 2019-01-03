package com.gupao.api.impl;

import com.gupao.api.ISayHello;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by liujiatai on 2018/12/26.
 */
public class SayHelloImpl extends UnicastRemoteObject implements ISayHello {

    public SayHelloImpl() throws RemoteException {
    }

    @Override
    public String sayHello(String name) throws RemoteException {
        return "你好!" + name;
    }
}
