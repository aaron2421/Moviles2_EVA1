package com.example.eva1_3_frag_din;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button boton1;
    Button boton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton1 = findViewById(R.id.button1);
        boton2 = findViewById(R.id.button2);

        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                BlackFragment bf = new BlackFragment();
                ft.replace(R.id.frameLayout, bf);
                ft.commit();
            }
        });

        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                RedFragment rf = new RedFragment();
                ft.replace(R.id.frameLayout, rf);
                ft.commit();

            }
        });
    }
}
