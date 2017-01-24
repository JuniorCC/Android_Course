package whitedirewolve.basic_06;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView= (TextView) findViewById(R.id.id_text);

        SQLiteDatabase db = openOrCreateDatabase( "banco01",
                MODE_PRIVATE, null);

        db.execSQL("CREATE TABLE IF NOT EXISTS A\n" +
                "(\n" +
                "    id INT,\n" +
                "    name VARCHAR,\n" +
                "    age INT\n" +
                ");");

        ContentValues cvalues1 = new ContentValues();
        cvalues1.put("id", 10);
        cvalues1.put("name", "Alex");
        cvalues1.put("age", 22);
        db.insert("A", null, cvalues1);

        ContentValues cvalues2 = new ContentValues();
        cvalues2.put("id", 11);
        cvalues2.put("name", "Maria");
        cvalues2.put("age", 23);
        db.insert("A", null, cvalues2);


        Cursor cursor = db.rawQuery("SELECT id,name FROM A",null);
        cursor.moveToFirst();

        String inf="";
        do {

            int id = cursor.getInt(cursor.getColumnIndex("id"));
            String name = cursor.getString(
                    cursor.getColumnIndex("name"));
            inf+=id+name+'\n';

        } while (cursor.moveToNext());

        textView.setText(inf);
        cursor.close();
        db.close();
    }
}
