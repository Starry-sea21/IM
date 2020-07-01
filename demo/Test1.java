package org.im.server.test;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author Jiangtao
 * @Date: 2020/4/29 10:42
 * Description: No Description
 */
public class Test1 {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}

class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("hello MyThread" + Thread.currentThread().getName());
    }


}