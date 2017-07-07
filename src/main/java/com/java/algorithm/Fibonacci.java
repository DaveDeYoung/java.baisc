package com.java.algorithm;

/**
 * Created by caiwenyuan on 2017/7/7.
 */
public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(jumpStep(3));
    }

    public static int jumpStep(int n){
        if(n<0) return 0;
        if(n==1||n==2) return n;
        return jumpStep(n-1) + jumpStep(n-2);
    }

}
