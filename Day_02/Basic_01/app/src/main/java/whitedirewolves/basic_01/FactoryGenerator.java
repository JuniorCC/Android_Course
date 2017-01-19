package whitedirewolves.basic_01;

/**
 * Created by juni on 17/01/17.
 */

public class FactoryGenerator {
    public static AbstractFactory getFactory(String factory){
        if(factory==null){
            return null;
        }
        if(factory=="BRE"){
            return new BreadFactory();
        }
        if(factory=="FIL"){
            return new FillingFactory();
        }
        return null;
    }
}
