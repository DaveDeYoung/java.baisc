package com.java.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * Created by caiwenyuan on 2017/7/13.
 */
public class HelloClient {
    public static void main(String[] args) {
        try {
            IHello rhello =(IHello) Naming.lookup("rmi://localhost:8888/RHello");
            System.out.println(rhello.helloWorld());
            System.out.println(rhello.sayHelloToSomeBody("熔岩"));
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

}
