package oop.inheritance;

public class Honda extends Car {

    @Override
    public void start() {
        System.out.println("Honda is starting");
    }

    @Override
    public void stop() {
        System.out.println("Honda is stopping");
    }

    public void accelerate() {
        System.out.println("Honda is accelerating");
    }

    public void changeGear() {
        System.out.println("Honda is changing gear");
    }

    public static void main(String[] args) {
        Honda myHonda = new Honda();
        myHonda.start();
        myHonda.accelerate();
        myHonda.changeGear();
        myHonda.stop();
    }
}
