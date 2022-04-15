import java.util.Timer;
import java.util.TimerTask;

import static java.lang.Thread.sleep;

public class ThreadTest implements Runnable {
    @Override
    public void run() {
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("in Run: " + System.currentTimeMillis());
    }

    public static void main(String[] args) {
        ThreadTest tObj = new ThreadTest();
        Thread t = new Thread(tObj);
        t.start();

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                try {
                    Thread.sleep(100);
                    System.out.println("Doing this task..");

                } catch (InterruptedException e) {
                    System.out.println("exception");
                }
            }
        };

        timer.schedule(task, 1, 3);
        try {
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            System.out.println("exception");
        }


        timer.cancel();
    }
}