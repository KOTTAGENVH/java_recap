package threading;

public class Main {
    public static void main(String[] args) {
        //Thread
        // for (int i = 0; i < 10; i++) {
        //     ThreadLes thread = new ThreadLes(i);
        //     ThreadLes thread2 = new ThreadLes(i);

        //     // Use start method if you want multiple concurrent threads to run
        //     thread2.start();
        //     // Use run method if you want to run the thread in the same thread
        //     // thread.run();
        // }
        // throw new RuntimeException("Main Exception"); // Wanted to show that despite on thread fails all other threads will continue to run
        //Runnable
        for (int i = 0; i < 10; i++) {
            RunnableLes runable1 = new RunnableLes(i);
            Thread myThread = new Thread(runable1);
            // Use start method if you want multiple concurrent threads to run
            myThread.start();
        }
        throw new RuntimeException("Main Exception"); // Wanted to show that despite on thread fails all other threads will continue to run
    }
}
