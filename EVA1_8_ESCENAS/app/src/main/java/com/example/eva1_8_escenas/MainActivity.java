package com.example.eva1_8_escenas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.transition.Fade;
import android.transition.Scene;
import android.transition.Slide;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Scene escenaA, escenaB;
    Button boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewGroup remplazar = findViewById(R.id.layoutSe);
        escenaA = Scene.getSceneForLayout(remplazar,R.layout.escena_a,this);
        escenaB = Scene.getSceneForLayout(remplazar,R.layout.escena_b,this);

        Transition fade = new Fade();
        TransitionManager.go(escenaA,fade);

        boton = findViewById(R.id.button);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Transition fade = new Slide();
                TransitionManager.go(escenaB,fade);
            }
        });
    }
}
