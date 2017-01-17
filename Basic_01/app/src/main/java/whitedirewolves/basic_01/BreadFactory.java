package whitedirewolves.basic_01;

/**
 * Created by juni on 17/01/17.
 */

public class BreadFactory extends AbstractFactory {
    @Override
    Bread getBread(String bread) {
        if (bread ==null){
            return null;
        }
        if(bread=="BAG"){
            return new Baguette();
        }
        if(bread=="BRI"){
            return new Brioche();
        }
        return null;
    }

    @Override
    Filling getFilling(String filling) {
        return null;
    }
}
