package thread;

/**
 * Created by m.losK on 2017-02-27.
 */
public class Main {
    public static void main(String[] args) {

        Runnable runnable = new SDAThread(1);
        Runnable runnable2 = new SDAThread(2);
        Runnable runnable3 = new SDAThread(3);
        Runnable runnable4 = new SDAThread(4);

        Thread thread = new Thread(runnable);
        Thread thread2 = new Thread(runnable2);
        Thread thread3 = new Thread(runnable3);
        Thread thread4 = new Thread(runnable4);

        thread.start();
        thread2.start();
        thread3.start();
        thread4.start();

        System.out.println("Here main terminated");
    }
}
