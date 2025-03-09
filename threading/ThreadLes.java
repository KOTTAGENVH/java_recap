package threading;

public class ThreadLes extends Thread {

    private int threadNumber;
    public ThreadLes (int threadNumber) {
      this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
      for (int i = 0; i < 10; i++) {
        System.out.println("Thread " + i + " from thread " + threadNumber);

        if (i == 3){
            throw new RuntimeException("Thread Exception"); // Wanted to show that despite on thread fails all other threads will continue to run
        }

        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        } 
      }
    }

}
