package com.example.eva1_5_clima_fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTransaction fgTrans = getSupportFragmentManager().beginTransaction();
        ListaFragment listFrag = new ListaFragment();
        fgTrans.replace(R.id.principal,listFrag);
        fgTrans.commit();
    }

    public void replaceFragment(Clima c){
        FragmentTransaction fragTr = getSupportFragmentManager().beginTransaction();
        ClimaFragment climaFrg = new ClimaFragment(c);
        fragTr.replace(R.id.principal, climaFrg);
        //Para no destruir los fragmentos anteriores y agregarlos a un stack para efectos de navecagcion
        fragTr.addToBackStack("Hello");
        fragTr.commit();
    }
}
