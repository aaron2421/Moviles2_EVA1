package com.example.eva1_5_clima_fragment;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListaFragment extends Fragment {
    Clima[] cCiudades = {
            new Clima(),
            new Clima(R.drawable.atmospher,19.8,"Ciudad 2","Templado"),
            new Clima(R.drawable.cloudy,24,"Ciudad 3","Nublado"),
            new Clima(R.drawable.rainy,14,"Ciudad 4","Lluvioso"),
            new Clima(R.drawable.snow,-4,"Ciudad 5","Nevado"),
            new Clima(R.drawable.thunderstorm,9.8,"Ciudad 6","Truenos"),
            new Clima(R.drawable.tornado,12,"Ciudad 7","Tornado"),
    };
    ListView listaClima;

    MainActivity mainActivity;

    public ListaFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainActivity = (MainActivity) getActivity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        FrameLayout frameLayout = (FrameLayout) inflater.inflate(R.layout.fragment_lista, container, false);
        listaClima = frameLayout.findViewById(R.id.listaClima);
        listaClima.setAdapter(new ClimaAdapter(getContext(),
                R.layout.layout_clima,cCiudades));
        listaClima.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                mainActivity.replaceFragment(cCiudades[i]);
                //Toast.makeText(getContext(),""+ cCiudades[i],Toast.LENGTH_SHORT).show();
            }
        });
        return frameLayout;
    }

}
