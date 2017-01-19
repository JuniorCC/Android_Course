package whitedirewolves.basic_01;

/**
 * Created by juni on 17/01/17.
 */

public class FillingFactory extends AbstractFactory {
    @Override
    Bread getBread(String bread) {
        return null;
    }

    @Override
    Filling getFilling(String filling) {
        if(filling ==null){
            return null;
        }
        if(filling=="CHE"){
            return new Cheese();
        }
        if(filling =="TOM"){
            return new Tomato();
        }
        return null;
    }
}
