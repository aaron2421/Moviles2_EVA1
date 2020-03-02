package com.example.eva1_4_frag_din_orienta;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class TextFragment extends Fragment {

    TextView textView;
    String msg_param;
    public TextFragment() {
        // Required empty public constructor
    }

    public TextFragment(String msg){
        msg_param = msg;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        FrameLayout  frameLayout= (FrameLayout)inflater.inflate(R.layout.fragment_text, container, false);
        textView = frameLayout.findViewById(R.id.txtFragment);
        if(msg_param != null){
           onMessageFromMaintoFrag(msg_param);
        }
        return frameLayout;
    }

    public void onMessageFromMaintoFrag(String msg){
        textView.setText(msg);
    }
}
