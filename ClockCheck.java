/**
 * Main Class
 * Checker class
 */


public class ClockCheck {
    public static void main(String[] args) {
         Clock myClock = new Clock();
        System.out.println("My standard time is :"+myClock.getTime());
        WorldClock worldClock = new WorldClock();
        System.out.println("My standard time +3 is : "+worldClock.getTime());
    }
}