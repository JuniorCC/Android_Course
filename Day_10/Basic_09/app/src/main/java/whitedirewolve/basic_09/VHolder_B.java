package whitedirewolve.basic_09;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by juni on 27/01/17.
 */

public class VHolder_B extends RecyclerView.ViewHolder implements View.OnClickListener {

    private ImageView mItemImage_a;
    private ImageView mItemImage_b;
    private TextView mItemDescription;

    public VHolder_B(View itemView) {
        super(itemView);
        mItemImage_a = (ImageView) itemView.findViewById(R.id.item_image_1b);
        mItemImage_b = (ImageView) itemView.findViewById(R.id.item_image_2b);
        mItemDescription = (TextView) itemView.findViewById(R.id.item_descriptionb);
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Context context = itemView.getContext();
        Intent item = new Intent(context, Act_B.class);
        context.startActivity(item);

    }

    public ImageView getmItemImage_a() {
        return mItemImage_a;
    }

    public void setmItemImage_a(ImageView mItemImage_a) {
        this.mItemImage_a = mItemImage_a;
    }

    public ImageView getmItemImage_b() {
        return mItemImage_b;
    }

    public void setmItemImage_b(ImageView mItemImage_b) {
        this.mItemImage_b = mItemImage_b;
    }

    public TextView getmItemDescription() {
        return mItemDescription;
    }

    public void setmItemDescription(TextView mItemDescription) {
        this.mItemDescription = mItemDescription;
    }
}
