package com.example.eva1_8_transiciones;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;

import android.app.ActivityOptions;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView imageView  = findViewById(R.id.imageView);

        Button boton = findViewById(R.id.button);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(MainActivity.this, SecondActivity.class);
                //Agregar en el values>styles.xml la activacion de las transiciones
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this,
                        imageView,
                        ViewCompat.getTransitionName(imageView));
                startActivity(intent,options.toBundle());
            }
        });
    }
}
