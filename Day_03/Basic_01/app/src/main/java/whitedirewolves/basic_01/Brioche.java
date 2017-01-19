package whitedirewolves.basic_01;

/**
 * Created by juni on 17/01/17.
 */

public class Brioche implements Bread {
    @Override
    public String name() {
        return "Brioche";
    }

    @Override
    public String calories() {
        return "20 kcal";
    }
}
