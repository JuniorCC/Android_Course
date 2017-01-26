package whitedirewolve.basic_07_progressbar;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

public class Act_Splash extends AppCompatActivity {

    ProgressBar progressBar;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_splash);
        loadResources();
    }

    private void loadResources() {
        progressBar = (ProgressBar) findViewById(R.id.id_bar);
        progressBar.getProgressDrawable().setColorFilter(Color.WHITE, PorterDuff.Mode.SRC_IN);
        textView = (TextView) findViewById(R.id.id_progress);
        new LongOperation().execute("");
    }

    private void initMain() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    private class LongOperation extends AsyncTask<String, Integer, String> {
        @Override
        protected void onPreExecute() {
            textView.setText("0");
            progressBar.setProgress(0);
        }
        @Override
        protected void onProgressUpdate(Integer... values) {
            textView.setText(values[0].toString());
            progressBar.setProgress(values[0]);
        }
        @Override
        protected String doInBackground(String... params) {

            //some heavy processing resulting in a Data String
            int count=100;
            for (int i = 0; i < count; i++) {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                publishProgress((int) ((i / (float) count) * 100));
            }
            return "whatever result you have";
        }
        @Override
        protected void onPostExecute(String result) {
            initMain();
        }

    }
}
