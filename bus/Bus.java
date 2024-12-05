
public class Bus {

    private int currentStop;
    private int lastStop;
    private boolean forward;

    public Bus(int num) {
        currentStop = 1;
        lastStop = num;
        forward = true;
    }

    public int getCurrentStop() {
        return currentStop;
    }

    public void move() {
        if (currentStop == 1) {
            forward = true;
        }
        if (currentStop < lastStop && forward) {
            currentStop++;
        } else {
            currentStop--;
            forward = false;
        }
    }
}
