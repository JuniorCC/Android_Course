package whitedirewolves.basic_01;

/**
 * Created by juni on 17/01/17.
 */

public class Baguette implements Bread{
    @Override
    public String name() {
        return "Baguette";
    }

    @Override
    public String calories() {
        return "10 kcal";
    }
}
