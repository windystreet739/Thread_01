//多线程的实现方案一：继承Thread类，重写run()方法
//1、定义一个类继承Thread类。

class  MyThread extends Thread{
    private String name;
    MyThread(String name){
        this.name = name;
    }
    // 2、覆盖Thread类中的run方法。
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(name+"...i = " + i + "..ThreadName = " + Thread.currentThread().getName());
        }
    }

}

public class example01 {
    public static  void main(String[] argc){
        MyThread d1 = new MyThread("First");
        MyThread d2 = new MyThread("Second");
        d1.start();
        d2.start();
        for(int i=0;i<5;i++){
            System.out.println( "I = " + i + "...over..."+Thread.currentThread().getName());
        }
    }
}
