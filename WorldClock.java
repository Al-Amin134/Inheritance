/**
 *  Sub Class
 */

public class WorldClock extends Clock {
    private int a;

    public WorldClock(int a) {
        super();
        this.a = a%24;
    }

    public int getHours() {
        int h = super.getHours();
        h = a;
        if (a > 23) {
            h = h - 24;
        }
        else if (a < 0) {
            h = h + 24;
        }
        return h;
    }
}
