package com.java.classloader;

import java.net.URLClassLoader;

/**
 * Created by caiwenyuan on 2017/7/5.
 */
public class ClassLoaderTest extends ClassLoader{

    public static void main(String[] args) {

    }

    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        return super.loadClass(name);
    }

    //获取ClassLoader加载的路径
    public void printlnClassPath(){
        System.out.println(System.getProperty("java.class.path"));//AppClassLoader
        System.out.println(System.getProperty("java.ext.dirs"));//ExtClaaLoader
    }

    public void loadClass(){
        try {
            this.getClass().getClassLoader().loadClass("");
            Class.forName("");
            this.loadClass("");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void urlClassLoader(){

    }

}
