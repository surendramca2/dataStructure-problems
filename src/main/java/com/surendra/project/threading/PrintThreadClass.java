package com.surendra.project.threading;

public class PrintThreadClass implements Runnable{
//int number=1;
 static Object lock = new Object();
private int remainder;
static int  number=1;
public PrintThreadClass(int remender){
this.remainder =remender;
}

@Override
public void run (){
    while(number<10-1){
        synchronized (lock){
         //print 3 thread 1 to 10
        while (number%3!= remainder)
        //odd even
       // while (number%2!= remainder)
           {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
           }
            System.out.println(Thread.currentThread().getName()+ " "+number);
            number++;
           lock.notifyAll();
        }
    }
    };
}
