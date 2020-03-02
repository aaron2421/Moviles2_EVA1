package com.example.eva1_4_frag_din_orienta;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class Secundaria extends AppCompatActivity {

    TextFragment textFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria);
        Intent intent = getIntent();
        textFragment.onMessageFromMaintoFrag(intent.getStringExtra("msg"));
        Log.wtf("onCreate","Paso");
    }

    @Override
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        textFragment = (TextFragment) fragment;
        Log.wtf("onAttach","Paso");
    }


}
