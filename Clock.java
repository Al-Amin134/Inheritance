/* 1. Implement a class Clock whose getHours and getMinutes methods return the current
time at your location. (Call java.time.Instant.now().toString() or, if you are not using
Java 8, new java.util.Date().toString() and extract the time from that string.) Also
provide a getTime method that returns a string with the hours and minutes by calling
the getHours and getMinutes methods. Provide a subclass WorldClock whose constructor
accepts a time offset. For example, if you live in California, a new WorldClock(3) should
show the time in New York, three time zones ahead. Which methods did you over-
ride? (You should not override getTime.)
*/

/**
 * Class Clock
 * This is the Super Class
 */

public class Clock {
   private String hours;
    private String min;
    private String time;

    public String getHours() {
        hours = java.time.Instant.now().toString().substring(0,2);
        return hours;
    }

    public String getMin() {
        min = java.time.LocalTime.now().toString().substring(3,5);
        return min;
    }
    public String getTime() {
        time = getHours()+":"+getMin();
        return time;
    }


}