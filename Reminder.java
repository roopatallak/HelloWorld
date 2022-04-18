import java.util.Timer;
import java.util.TimerTask;

/**
 * This timer starts after 5 seconds
 * Runs for "n" number of rounds
 * at interval of 1 sec
 * and terminates after "n" rounds
 */

public class Reminder {
    Timer timer;

    public Reminder(int seconds) {
        timer = new Timer();
        timer.schedule(new RemindTask(7), seconds, 1000);

    }

    class RemindTask extends TimerTask {
        int howManyTimes;
        int count = 0;
        public RemindTask(int arg) {
            howManyTimes = arg;
        }
        public void run() {
            if (howManyTimes > 0) {
                count++;
                System.out.println("Reminder for " + count + "th time after 1000 ms Delay");
                howManyTimes--;
            } else {
                System.out.println("I ran " + count + "times, now I am done");
                timer.cancel();
            }
        }
    }

    public static void main(String args[]) {
        new Reminder(5000);
        System.out.println("Task scheduled.");
    }
}
