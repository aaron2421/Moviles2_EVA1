package com.example.eva1_5_clima_fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


public class ClimaFragment extends Fragment {

    private Clima clima;
    private LinearLayout linearLayout;

    public ClimaFragment(Clima c) {
       clima = c;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        linearLayout = (LinearLayout) inflater.inflate(R.layout.fragment_clima, container, false);

        if(clima == null){
            clima = new Clima();
            vinculacion();
        }else {
            vinculacion();
        }
        return linearLayout;
    }


    private void vinculacion(){
        ImageView img = linearLayout.findViewById(R.id.imgFrag);
        img.setBackgroundResource(clima.getImagen());

        TextView ciudad = linearLayout.findViewById(R.id.ciudadFrag);
        ciudad.setText(clima.getCiudad());

        TextView tmp = linearLayout.findViewById(R.id.tmpFrag);
        tmp.setText(clima.getTemperatura() + "C");

        TextView desc = linearLayout.findViewById(R.id.descFrag);
        desc.setText(clima.getClima());
    }
}
