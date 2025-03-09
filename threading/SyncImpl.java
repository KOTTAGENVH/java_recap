package threading;

public class SyncImpl extends Thread {

    private final SyncLes syncLes;

    public SyncImpl(SyncLes syncLes, String name) {
        // We’ll name the thread for clarity
        super(name);
        this.syncLes = syncLes;
    }

    public static void main(String[] args) {
        // Create one SyncLes object
        SyncLes sharedObject = new SyncLes();

        // Create two threads that share the same SyncLes instance
        SyncImpl threadA = new SyncImpl(sharedObject, "Thread-A");
        SyncImpl threadB = new SyncImpl(sharedObject, "Thread-B");

        // Start both threads
        threadA.start();
        threadB.start();
    }

    @Override
    public void run() {
        // The synchronized method in SyncLes ensures that only
        // one thread can run displayOutput() at a time on this shared instance.
        syncLes.displayOutput();
    }
}
