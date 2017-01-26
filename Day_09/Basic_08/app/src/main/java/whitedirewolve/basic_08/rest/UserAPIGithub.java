package whitedirewolve.basic_08.rest;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by juni on 26/01/17.
 */

public interface UserAPIGithub {
    @GET("/users/{user}")
    Call<User> getUser(@Path("user") String user);
}
