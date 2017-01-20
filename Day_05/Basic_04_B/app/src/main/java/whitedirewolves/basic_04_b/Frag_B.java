package whitedirewolves.basic_04_b;


import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag_B extends Fragment {
    private ImageView img;

    public Frag_B() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.frag_b, container, false);
        img= (ImageView) view.findViewById(R.id.id_img_view);
        // Inflate the layout for this fragment
        return view;
    }

    public void setImagen(Drawable background){
        img.setImageDrawable(background);

    }

}
