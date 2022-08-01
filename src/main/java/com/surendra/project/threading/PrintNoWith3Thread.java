package com.surendra.project.threading;

public class PrintNoWith3Thread {
    public static void main(String[] args) {
    PrintThreadClass p = new PrintThreadClass(1);
    PrintThreadClass p2 = new PrintThreadClass(2);
    PrintThreadClass p3 = new PrintThreadClass(0);
    Thread t1 = new Thread(p,"T1");
     Thread t2 = new Thread(p2,"T2");
    Thread t3 = new Thread(p3,"T3");
    t1.start();
    t2.start();
    t3.start();
    }



}
