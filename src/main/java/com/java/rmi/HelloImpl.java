package com.java.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by caiwenyuan on 2017/7/13.
 */
public class HelloImpl extends UnicastRemoteObject implements IHello {


    protected HelloImpl() throws RemoteException {
    }

    public String helloWorld() throws RemoteException {
        return "Hello World!";
    }

    public String sayHelloToSomeBody(String someBodyName) throws RemoteException {
        return "你好," + someBodyName +"!";
    }
}
