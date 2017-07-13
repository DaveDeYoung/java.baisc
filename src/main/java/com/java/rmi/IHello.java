package com.java.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by caiwenyuan on 2017/7/13.
 */
public interface IHello extends Remote {

    public String helloWorld() throws RemoteException;

    public String sayHelloToSomeBody(String someBodyName) throws RemoteException;

}
