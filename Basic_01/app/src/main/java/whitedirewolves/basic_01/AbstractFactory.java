package whitedirewolves.basic_01;

/**
 * Created by juni on 17/01/17.
 */

public abstract class AbstractFactory {
    abstract Bread getBread(String bread);
    abstract Filling getFilling(String filling);
}
