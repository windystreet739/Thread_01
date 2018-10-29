//多线程的实现方案二：实现Runnable接口
//1、定义类实现Runnable接口。
class MThread implements Runnable{
    public void run(){
        show();
    }
    public void show(){
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName() + "..." + i);
        }
    }
}

public class example02 {
    public static  void main(String[] argc){
        MThread d = new MThread();
        // 3、通过Thread类创建线程对象，并将Runnable接口的子类对象作为Thread类的构造函数的参数进行传递。
        Thread t1 = new Thread(d);
        Thread t2 = new Thread(d);
        // 4、调用线程对象的start方法开启线程。
       // t1.setName("One");
      //  t2.setName("Two");
        t1.start();
        t2.start();
    }
}