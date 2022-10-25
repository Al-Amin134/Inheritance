/**
 * Main Class
 */

public class Test {
    public static void main(String[] args) {
       Clock clock = new Clock();
       WorldClock worldClock = new WorldClock(12);
        System.out.println("my time "+clock.getTime());
     //  System.out.println("world time "+worldClock.getTime());
    }
}
