package whitedirewolves.basic_05;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Act_B extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_b);

        File outDir = getExternalFilesDir(null);
        File outFile = new File(outDir, "example.txt");
        PrintStream output = null;
        try {
            output = new PrintStream(outFile);
            output.println("Hello!");
            output.println("Friend");
            output.println("You know that Android can read/write files from two locations: internal and external storage.\n" +
                    "Both are persistent storage; data remains after power-off / reboot.");
            output.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Button but= (Button) findViewById(R.id.id_but_b);
        final TextView textView=(TextView) findViewById(R.id.id_viewb);
        final EditText editText=(EditText)findViewById(R.id.id_edTextb);

        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                File outDir = getExternalFilesDir(null);
                String name=editText.getText().toString();
                if(!name.equals("example.txt")){
                    textView.setText("name invalid");
                }else{
                    File input= new File(outDir, "example.txt");
                    Scanner scan = null;
                    try {
                        scan = new Scanner(input);
                        StringBuilder sb = new StringBuilder();
                        while (scan.hasNextLine()) {
                            String line = scan.nextLine();
                            sb.append(line);
                            sb.append('\n');
                        }
                        textView.setText(sb.toString());
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

    }
}
