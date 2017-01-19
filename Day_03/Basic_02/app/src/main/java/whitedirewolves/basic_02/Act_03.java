package whitedirewolves.basic_02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Act_03 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_03);
        Intent intent=getIntent();
        String value =intent.getStringExtra("BRE");
        TextView text_03= (TextView) findViewById(R.id.id_textV_03);
        text_03.setText(value);
    }
}
