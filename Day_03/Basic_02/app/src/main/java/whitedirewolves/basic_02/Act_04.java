package whitedirewolves.basic_02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Act_04 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_04);

        Intent intent=getIntent();
        String value =intent.getStringExtra("FILL");
        TextView text_04= (TextView) findViewById(R.id.id_textV_04);
        text_04.setText(value);
        CurrentUser u=CurrentUser.getCurrentUser();
        String val=u.outputName();
        text_04.setText(val);
    }
}
