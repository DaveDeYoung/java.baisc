package com.java.rmi;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

/**
 * Created by caiwenyuan on 2017/7/13.
 */
public class HelloServer {

    public static void main(String[] args) {
        try {
            IHello rhello = new HelloImpl();
            LocateRegistry.createRegistry(8888);
            Naming.bind("rmi://localhost:8888/RHello",rhello);
            System.out.println(">>>>>INFO:远程IHello对象绑定成功！");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
