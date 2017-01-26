package whitedirewolve.basic_08;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import whitedirewolve.basic_08.rest.User;
import whitedirewolve.basic_08.rest.UserAPIGithub;

public class Act_Main extends AppCompatActivity {

    final String API_GITHUB="https://api.github.com/";
    Button but;
    TextView text;
    ImageView img;
    Call<User> user;
    User inf_user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_main);
    //dnshariprasad
        but= (Button) findViewById(R.id.id_but);
        text= (TextView) findViewById(R.id.id_inf);
        img= (ImageView) findViewById(R.id.id_img);
        final Act_Main m=this;
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl(API_GITHUB)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();

                UserAPIGithub iuser=retrofit.create(UserAPIGithub.class);
                user=iuser.getUser("juniorcc");//dnshariprasad

                user.enqueue(new Callback<User>() {
                    @Override
                    public void onResponse(Call<User> call, Response<User> response) {
                        inf_user=response.body();
                        text.setText("id: "+inf_user.getId() +'\n'+
                                     "followers: "+inf_user.getFollowers() +'\n'+
                                     "user: "+ inf_user.getLogin()+'\n');

                        if(inf_user!=null){
                            Picasso picasso = Picasso.with(m);
                            picasso.load(inf_user.getAvatar_url())
                                    .placeholder(R.drawable.ic_android_black_24dp) //
                                    .error(R.drawable.ic_assignment_ind_black_24dp) //
                                    .into(img);
                        }
                    }

                    @Override
                    public void onFailure(Call<User> call, Throwable t) {
                        Toast.makeText(m,"Not internet connection",Toast.LENGTH_LONG);
                    }
                });
            }
        });



    }
}
