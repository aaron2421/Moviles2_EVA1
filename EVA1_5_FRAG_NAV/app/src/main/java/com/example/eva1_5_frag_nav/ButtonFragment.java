package com.example.eva1_5_frag_nav;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;

public class ButtonFragment extends Fragment {
    //Modo 1
    MainActivity main;
    Button btn;

    //Modo 2
    private View.OnClickListener miClick;

    public void setMiClick(View.OnClickListener click){
        miClick = click;
    }

    public ButtonFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        main = (MainActivity) getActivity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        FrameLayout frameLayout = (FrameLayout) inflater.inflate(R.layout.fragment_button, container, false);
        btn = frameLayout.findViewById(R.id.buttonFrag);

        //METODO 1 (CLASE)
        btn.setOnClickListener(miClick);

        //METODO 2 (PROPIO)
        /*btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                main.replaceFragment();
            }
        });*/

        return frameLayout;
    }

}
