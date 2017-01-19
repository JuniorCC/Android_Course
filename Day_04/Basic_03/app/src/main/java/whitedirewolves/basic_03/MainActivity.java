package whitedirewolves.basic_03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton but_1= (ImageButton) findViewById(R.id.id_but_1);
        ImageButton but_2= (ImageButton) findViewById(R.id.id_but_2);
        ImageButton but_3= (ImageButton) findViewById(R.id.id_but_3);
        ImageButton but_4= (ImageButton) findViewById(R.id.id_but_4);
        ImageButton but_5= (ImageButton) findViewById(R.id.id_but_5);

        final MainActivity m=this;
        but_1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(m,Act_1.class);
                startActivity(intent);
            }
        });
        but_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(m,Act_2.class);
                startActivity(intent);
            }
        });
        but_3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(m,Act_3.class);
                startActivity(intent);
            }
        });
        but_4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(m,Act_4.class);
                startActivity(intent);
            }
        });
        but_5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(m,Act_5.class);
                startActivity(intent);
            }
        });
    }
}
