package com.softku.androidstudy.transition;

import android.graphics.Rect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.TransformationMethod;
import android.transition.Scene;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import com.softku.androidstudy.R;

import java.util.ArrayList;

public class TransitionActivity1 extends AppCompatActivity {


    private ArrayList<TextView> textViews;
    private Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transition1);

        init();
        setBtnAction();
    }


    private void init() {

        textViews = new ArrayList<TextView>();
        textViews.add((TextView)findViewById(R.id.textView1));
        textViews.add((TextView)findViewById(R.id.textView2));
        textViews.add((TextView)findViewById(R.id.textView3));
        textViews.add((TextView)findViewById(R.id.textView4));
        textViews.add((TextView)findViewById(R.id.textView5));

        btn = (Button)findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setBtnAction();
            }
        });
    }

    private void setBtnAction(){
        Animation alpha = AnimationUtils.loadAnimation(this,R.anim.alpha);
        textViews.get(0).startAnimation(alpha);

        alpha = AnimationUtils.loadAnimation(this,R.anim.scale);
        textViews.get(1).startAnimation(alpha);

        alpha = AnimationUtils.loadAnimation(this,R.anim.rotate);
        textViews.get(2).startAnimation(alpha);

        alpha = AnimationUtils.loadAnimation(this,R.anim.translate);
        textViews.get(3).startAnimation(alpha);

        alpha = AnimationUtils.loadAnimation(this,R.anim.set);
        textViews.get(4).startAnimation(alpha);

    }
}
