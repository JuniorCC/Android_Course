package whitedirewolves.basic_05;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MainActivity m=this;
        Button but_1= (Button) findViewById(R.id.id_but_m_1);
        but_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(m,Act_A.class));
            }
        });
        Button but_2= (Button) findViewById(R.id.id_but_m_2);
        but_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(m, Act_B.class));
            }
        });
    }
}
