package com.softku.androidstudy.example7_0701;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.softku.androidstudy.R;

public class Fragment7_2 extends Fragment {

    private TextView txt;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_fragment7_2, container, false);

        txt=(TextView)v.findViewById(R.id.textvie);

        return v;
    }


    public void changeText(String s){
        txt.setText(s);
    }

}
