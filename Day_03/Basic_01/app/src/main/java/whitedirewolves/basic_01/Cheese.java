package whitedirewolves.basic_01;

/**
 * Created by juni on 17/01/17.
 */

public class Cheese implements Filling {
    @Override
    public String name() {
        return "Cheese";
    }

    @Override
    public String calories() {
        return "30 kcal";
    }
}
