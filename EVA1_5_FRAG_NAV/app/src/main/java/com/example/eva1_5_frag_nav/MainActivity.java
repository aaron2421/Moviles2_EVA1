package com.example.eva1_5_frag_nav;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        ButtonFragment btnFrag = new ButtonFragment();
        btnFrag.setMiClick(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                replaceFragment();
            }
        });
        fragmentTransaction.replace(R.id.frameLayMain,btnFrag);
        //Para no destruir los fragmentos anteriores y agregarlos a un stack para efectos de navecagcion
        fragmentTransaction.addToBackStack("Hola");
        fragmentTransaction.commit();
    }

    public void replaceFragment(){
        FragmentTransaction fragTr = getSupportFragmentManager().beginTransaction();
        //Animacion
                                    //Para cuando aparece el fragmento  Cuando desaparece
        fragTr.setCustomAnimations(R.anim.anim_enter,R.anim.anim_out,R.anim.anim_enter,R.anim.anim_out);
        //Remplazar el fragmento
        ColorFragment colorFg = new ColorFragment();
        fragTr.replace(R.id.frameLayMain, colorFg);
        //Para no destruir los fragmentos anteriores y agregarlos a un stack para efectos de navecagcion
        fragTr.addToBackStack("Hello");
        fragTr.commit();
    }
}
