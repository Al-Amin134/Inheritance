/*
2:Add an alarm feature to the Clock class. When setAlarm(hours,
 minutes) is called, the clock stores the alarm. When you call getTime, and the alarm
 time has been reached or exceeded, return the time followed by the string "Alarm" (or,
 if you prefer, the string "\u23F0") and clear the alarm. What do you need to do to
 make the setAlarm method work for WorldClock objects?
 */


/**
 * Super Class
 */

import java.util.Date;

public class Clock {
    public int getHours(){
        String time = new Date().toString().split("")[3];
        int hours = Integer.parseInt(time.split(":")[0]);
        return hours;

    }
    public int getMinutes(){
        String time = new Date().toString().split("")[3];
        int minutes = Integer.parseInt(time.split(":")[1]);
        return minutes;
    }
    public String getTime(){
        return String.format("",getHours(),getMinutes());
    }
}
