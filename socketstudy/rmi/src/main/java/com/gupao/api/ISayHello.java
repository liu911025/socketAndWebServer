package com.gupao.api;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by liujiatai on 2018/12/26.
 */
public interface ISayHello extends Remote {

    String sayHello(String name) throws RemoteException;
}
