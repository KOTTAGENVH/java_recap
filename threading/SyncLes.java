package threading;

public class SyncLes {

    // By making this method synchronized, only one thread at a time
    // can execute the contents of displayOutput() on a given SyncLes instance.
    public synchronized void displayOutput() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " -> " + i);
            
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
