package com.example.eva1_1_fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class BlackFragment extends Fragment {
    Context context;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_black, container, false);
    }

    //El contexto se recibe en el onAttach
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        //Se ancla a una variable global para poder usar el contexto en el restro de clase
        this.context = context;

        //Mensaje en el log verbose
        Log.wtf("Black", "onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.wtf("Black", "onCreate");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.wtf("Black", "onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.wtf("Black", "onResume");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.wtf("Black", "onStop");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.wtf("Black", "onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.wtf("Black", "onDetach");
    }
}
