package com.softku.androidstudy;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/*
    Touch Event listener 로 사진 움직이가
 */

public class example4_0506 extends AppCompatActivity {

    private RelativeLayout mLay;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example4_0506);

        //기본 툴바 설정
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        img=(ImageView)findViewById(R.id.img);

        mLay = (RelativeLayout)findViewById(R.id.lay);
        mLay.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                handleTouch(event);
                return true;
                //false면 이벤트가 하위 이벤트에게 전달.
                //true면 이벤트가 하위이벤트에게 전달되지 않음
            }
        });

    }

    //발생한 이벤트를 처리하는 함수
    private void handleTouch(MotionEvent event)
    {
        //감지된 이벤트 수
        int pointerCount = event.getPointerCount();
        //감지된 이벤트 수만큼 반복
        for(int i=0;i<pointerCount;i++)
        {
            //현재 좌표값 설정
            int X = (int) event.getX();
            int Y = (int) event.getY();
            switch (event.getAction()) {
                case MotionEvent.ACTION_DOWN:
                    break;
                case MotionEvent.ACTION_UP:
                    break;
                case MotionEvent.ACTION_POINTER_DOWN:
                    break;
                case MotionEvent.ACTION_POINTER_UP:
                    break;
                case MotionEvent.ACTION_MOVE: //움직일 경우
                    img.setTranslationX(X-450); //지정된 좌표로 이동(상수는 이미지 뷰의 중심을 맞추기위함)
                    img.setTranslationY(Y-500);
                    break;
            }
        }
    }

}
