package whitedirewolves.basic_02;

import android.util.Log;

/**
 * Created by juni on 18/01/17.
 */

public class CurrentUser {

    private static final String DEBUG_TAG = "tag";

    private String name;
    private static CurrentUser user=new CurrentUser();

    private CurrentUser(){
    }
    public static CurrentUser getCurrentUser(){
        return user;
    }
    protected void setName(String n){
        this.name= n;
    }
    protected String outputName(){
        //Log.d(DEBUG_TAG,this.name);
        return  this.name;
    }
}
