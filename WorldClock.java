/**
 * Class WorldClock
 * This is the subclass
 */

public class WorldClock extends Clock{


    public WorldClock() {
        super();


    }

    @Override
    public String getHours() {
String hours = String.valueOf(Integer.parseInt(super.getHours())+3);
        return hours;
    }
}