package com.softku.androidstudy.View;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.softku.androidstudy.Model.hangDataModel;
import com.softku.androidstudy.R;

/**
 * Created by rngks on 2016-05-15.
 */
public class hangView extends FrameLayout {

    TextView txt;
    ImageView img;

    public hangView(Context context) {
        super(context);
        initUI();
    }

    private void initUI()
    {
        LayoutInflater.from(getContext()).inflate(R.layout.hangview,this);
        txt=(TextView)findViewById(R.id.txt);
        img=(ImageView)findViewById(R.id.img);
    }

    public void setView(hangDataModel data)
    {
        txt.setText(data.text);
        img.setImageResource(data.img);
    }

}
