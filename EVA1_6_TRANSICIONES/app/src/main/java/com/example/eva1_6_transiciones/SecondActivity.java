package com.example.eva1_6_transiciones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.transition.Slide;
import android.view.Window;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //SE SOLICITA QUE SE ACTIVEN LAS TRANSICIONES PARA LA ACTIVIDAD ACUTUAL
        getWindow().requestFeature(Window.FEATURE_ACTIVITY_TRANSITIONS);

        setContentView(R.layout.activity_second);
    }
}
