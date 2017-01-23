package whitedirewolves.basic_05;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Act_A extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_a);

        Button but= (Button) findViewById(R.id.id_but);
        Button but_2= (Button) findViewById(R.id.id_but_2);
        final TextView text= (TextView) findViewById(R.id.id_text);
        final EditText editText= (EditText) findViewById(R.id.id_edText);

        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Scanner scan = new Scanner(
                        getResources().openRawResource(R.raw.info));
                StringBuilder sb = new StringBuilder();
                while (scan.hasNextLine()) {
                    String line = scan.nextLine();
                    sb.append(line);
                    sb.append('\n');
                }
                text.setText(sb.toString());

            }
        });
        but_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PrintStream output = null;
                try {
                    output = new PrintStream(openFileOutput("out.txt", MODE_PRIVATE));
                    output.println("Hello!");
                    output.println(editText.getText().toString());
                    output.println("How are you?");

                    output.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }

                Scanner scan = null;
                try {
                    scan = new Scanner(openFileInput("out.txt"));
                    String allText = "";
                    while (scan.hasNextLine()) {
                        String line = scan.nextLine();
                        allText += line + '\n';
                    }
                    text.setText(allText);
                    scan.close();

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }

            }
        });

    }
}
