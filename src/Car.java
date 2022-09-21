public class Car extends Transport implements Comparable<Car>{
    private int wheels = 4;
    public static int counter = 0;
    public static final int TTT = 555;

    public Car() {

    }
    public Car(String name, int speed, int w) {
        super(name, speed);
        wheels = w;
    }

    public static void doMove() {
        System.out.println("Moving...");
    }

    @Override
    public void doBeep() {
        System.out.println("Car beep!");
    }

    @Override
    public void turnOn() {

    }

    @Override
    public int compareTo(Car o) {
        return this.getSpeed()-o.getSpeed();
    }

    // public abstract void toDo();
}
