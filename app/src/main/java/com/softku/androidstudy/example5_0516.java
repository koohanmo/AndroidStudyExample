package com.softku.androidstudy;

import android.gesture.Gesture;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v4.view.ScaleGestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class example5_0516 extends AppCompatActivity {

    RelativeLayout lay;
    ImageView img;
    ScaleGestureDetector scaleGestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example5_0516);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        lay=(RelativeLayout)findViewById(R.id.lay);
        img=(ImageView)findViewById(R.id.img);

        scaleGestureDetector = new ScaleGestureDetector(this, new ScaleGestureDetector.OnScaleGestureListener() {
            @Override
            public boolean onScale(ScaleGestureDetector detector) {
                float scaleFactor = detector.getScaleFactor();

                float x=(float)img.getScaleX();
                float y=(float)img.getScaleY();

                if(scaleFactor>1)
                {
                    img.setScaleX((float) (x+0.1));
                    img.setScaleY((float) (y+0.1));
                }
                else
                {
                    if(img.getScaleX()>0 && img.getScaleY()>0 ) {
                        img.setScaleX((float) (x - 0.1));
                        img.setScaleY((float) (y - 0.1));
                    }
                }

                return true;
            }

            @Override
            public boolean onScaleBegin(ScaleGestureDetector detector) {
                return true;
            }

            @Override
            public void onScaleEnd(ScaleGestureDetector detector) {

            }
        });



    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        scaleGestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }
}
