package whitedirewolves.basic_02;

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
        CurrentUser u=CurrentUser.getCurrentUser();
        u.setName("Luis");

        Button but_1= (Button) findViewById(R.id.but_Act_1);
        Button but_2= (Button) findViewById(R.id.but_Act_2);
        Button but_3= (Button) findViewById(R.id.but_Act_3);
        Button but_4= (Button) findViewById(R.id.but_Act_4);

        final MainActivity m=this;
        but_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(m,Act_01.class);
                startActivity(intent);
            }
        });

        but_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(m,Act_02.class);
                startActivity(intent);
            }
        });
        but_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(m,Act_03.class);
                intent.putExtra("BRE","HOLA BRE");
                startActivity(intent);
            }
        });
        but_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(m,Act_04.class);
                intent.putExtra("FILL","HOLA FILL");
                startActivity(intent);
            }
        });
    }
}
