package whitedirewolves.basic_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("BASIC","OnCreate()");
        setContentView(R.layout.activity_main);

        TextView text_brioche= (TextView) findViewById(R.id.id_brioche);
        final TextView text_baguette= (TextView) findViewById(R.id.id_baguette);
        TextView text_cheese= (TextView) findViewById(R.id.id_cheese);
        TextView text_tomato= (TextView) findViewById(R.id.id_tomato);
        Button but_x= (Button) findViewById(R.id.id_but);
        but_x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_baguette.setText("HOLA");
            }
        });



        AbstractFactory breadFactory= FactoryGenerator.getFactory("BRE");
        AbstractFactory fillingFactory= FactoryGenerator.getFactory("FIL");

        Bread bread=breadFactory.getBread("BAG");
        Bread bread2=breadFactory.getBread("BRI");
        Filling filling=fillingFactory.getFilling("CHE");
        Filling filling2=fillingFactory.getFilling("TOM");


        text_brioche.setText(bread2.name() + bread2.calories());
        text_baguette.setText(bread.name()+bread.calories());
        text_cheese.setText(filling.name()+filling.calories());
        text_tomato.setText(filling2.name()+filling2.calories());

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("BASIC","OnStart()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("BASIC","OnStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("BASIC","OnDestroy()");
    }
}
