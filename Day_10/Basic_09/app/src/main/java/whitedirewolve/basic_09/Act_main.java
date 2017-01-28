package whitedirewolve.basic_09;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;
import java.util.List;

public class Act_main extends AppCompatActivity {

    private RecyclerView recyclerView_a;
    private RecyclerView recyclerView_b;
    private GridLayoutManager gridLayoutManager;
    private LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_main);

        LinkedList<Data_Item> list= new LinkedList<>();
        Data_Item a=new Data_Item(R.drawable.ic_icon_a,R.drawable.ic_icon_d,"Description A");
        Data_Item b=new Data_Item(R.drawable.ic_icon_b,R.drawable.ic_icon_c,"Description B");
        Data_Item c=new Data_Item(R.drawable.ic_icon_c,R.drawable.ic_icon_b,"Description C");
        Data_Item d=new Data_Item(R.drawable.ic_icon_d,R.drawable.ic_icon_a,"Description D");
        Data_Item e=new Data_Item(R.drawable.ic_icon_a,R.drawable.ic_icon_d,"Description E");
        Data_Item f=new Data_Item(R.drawable.ic_icon_b,R.drawable.ic_icon_c,"Description F");
        Data_Item g=new Data_Item(R.drawable.ic_icon_c,R.drawable.ic_icon_b,"Description F");
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);
        list.add(f);
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);
        list.add(f);
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);
        list.add(f);
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);
        list.add(f);

        recyclerView_a = (RecyclerView) findViewById(R.id.id_recycler_grid);
        gridLayoutManager = new GridLayoutManager(this,2);
        recyclerView_a.setLayoutManager(gridLayoutManager);
        recyclerView_a.setAdapter(new RecyclerAdapter_A(list));

        recyclerView_b = (RecyclerView) findViewById(R.id.id_recycler_linear);
        linearLayoutManager = new LinearLayoutManager(this);
        recyclerView_b.setLayoutManager(linearLayoutManager);
        recyclerView_b.setAdapter(new RecyclerAdapter_B(list));

    }
}
