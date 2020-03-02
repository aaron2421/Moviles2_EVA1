package com.example.eva1_4_frag_din_orienta;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    FrameLayout frameLayout;
    Intent inSecundaria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onMessageFromFragToMain(){
        frameLayout = findViewById(R.id.frameLayout);
        if(frameLayout != null){ // Landscape
            //Crear el fragmento 2 dinamicamente
            Toast.makeText(this,"Landscape", Toast.LENGTH_SHORT).show();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            TextFragment textFragment = new TextFragment("Landscape");
            fragmentTransaction.replace(R.id.frameLayout,textFragment);
            fragmentTransaction.commit();
        }else{ //Portrait
            //Lanzar la actividad secundaria con intento
            Toast.makeText(this,"Portrait",Toast.LENGTH_SHORT).show();

            inSecundaria = new Intent(this, Secundaria.class);
            inSecundaria.putExtra("msg","Portrait mode");
            startActivity(inSecundaria);
        }
    }
}
