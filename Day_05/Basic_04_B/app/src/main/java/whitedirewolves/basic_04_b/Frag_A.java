package whitedirewolves.basic_04_b;


import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.BundleCompat;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag_A extends Fragment {

    public Frag_A() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.frag_a, container, false);
        final ImageButton but= (ImageButton)view.findViewById(R.id.id_but_img);
        //ImageButton but= (ImageButton) getActivity().findViewById(R.id.id_but_img);

        if (getResources().getConfiguration().orientation ==
                Configuration.ORIENTATION_LANDSCAPE) {
            but.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(getContext(),"Message",Toast.LENGTH_LONG).show();

                    Frag_B b= (Frag_B) getActivity().getSupportFragmentManager().findFragmentById(R.id.id_frag_b);
                    b.setImagen(but.getDrawable());
                }
            });

        }else{
            but.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent= new Intent(getContext(),Act_02.class);

                    getActivity().startActivity(intent);
                }
            });
        }
        RadioButton radio_a= (RadioButton) view.findViewById(R.id.id_radio_a);
        RadioButton radio_b= (RadioButton) view.findViewById(R.id.id_radio_b);
        RadioButton radio_c= (RadioButton) view.findViewById(R.id.id_radio_c);

        radio_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                but.setImageResource(R.drawable.ic_computer_black_24dp);
            }
        });

        radio_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                but.setImageResource(R.drawable.ic_desktop_mac_black_24dp);
            }
        });

        radio_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                but.setImageResource(R.drawable.ic_tablet_mac_black_24dp);
            }
        });



        // Inflate the layout for this fragment
        return view;
    }

}
