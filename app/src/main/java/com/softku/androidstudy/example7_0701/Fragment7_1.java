package com.softku.androidstudy.example7_0701;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.softku.androidstudy.R;

public class Fragment7_1 extends Fragment {


    EditFragmentListener activityCallback;

    TextInputEditText text;
    Button btn;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        activityCallback=(EditFragmentListener)context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v =inflater.inflate(R.layout.fragment_fragment7_1, container, false);

        text=(TextInputEditText)v.findViewById(R.id.editText);
        btn = (Button)v.findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activityCallback.onButtonClick(text.getText().toString());
            }
        });

        return v;
    }
    public interface EditFragmentListener{
        public void onButtonClick(String text);
    }

}
