package whitedirewolves.basic_03;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Act_2 extends AppCompatActivity {

    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_2);
        mp = MediaPlayer.create(this, R.raw.music);
        mp.start();
    }

    @Override
    protected void onStop() {
        super.onStop();
        mp.stop();
    }

}
