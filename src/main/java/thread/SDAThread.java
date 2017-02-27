package thread;

/**
 * Created by m.losK on 2017-02-27.
 */
public class SDAThread implements Runnable {
    private int number;

    public SDAThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread number: " + number);
        }
    }
}
