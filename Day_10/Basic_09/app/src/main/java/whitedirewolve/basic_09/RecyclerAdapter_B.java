package whitedirewolve.basic_09;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by juni on 27/01/17.
 */

public class RecyclerAdapter_B extends RecyclerView.Adapter<VHolder_B>{
    private List<Data_Item> list;

    public RecyclerAdapter_B(List<Data_Item> list) {
        this.list = list;
    }

    @Override
    public VHolder_B onCreateViewHolder(ViewGroup parent, int viewType) {
        View thisItemsView = LayoutInflater.from(parent.getContext()).inflate(R.layout.rview_item_row_b,parent, false);
        return new VHolder_B(thisItemsView);
    }

    @Override
    public void onBindViewHolder(VHolder_B holder, int position) {
        Data_Item item = list.get(position);
        holder.getmItemDescription().setText(item.getDescription());
        holder.getmItemImage_a().setImageResource(item.getId_img_a());
        holder.getmItemImage_b().setImageResource(item.getId_img_b());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
