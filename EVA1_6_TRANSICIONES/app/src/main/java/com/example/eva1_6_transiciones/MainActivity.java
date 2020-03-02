package com.example.eva1_6_transiciones;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.transition.Slide;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //SE SOLICITA QUE SE ACTIVEN LAS TRANSICIONES PARA LA ACTIVIDAD ACUTUAL
        getWindow().requestFeature(Window.FEATURE_ACTIVITY_TRANSITIONS);

        //ASIGNAR LA TRANSICION QUE SE UTILIZARA
       // getWindow().setEnterTransition(new Slide().setDuration(500));
        getWindow().setExitTransition(new Slide().setDuration(500));


        setContentView(R.layout.activity_main);

        buton = findViewById(R.id.button);
        buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                accion();
            }
        });
    }

    public void accion(){
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
    }
}
