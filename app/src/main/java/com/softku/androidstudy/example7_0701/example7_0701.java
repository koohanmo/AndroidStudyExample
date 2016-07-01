package com.softku.androidstudy.example7_0701;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.softku.androidstudy.R;

public class example7_0701 extends AppCompatActivity  implements Fragment7_1.EditFragmentListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example7_0701);
    }

    @Override
    public void onButtonClick(String text) {

        Fragment7_2 changeFrag = (Fragment7_2)getSupportFragmentManager().findFragmentById(R.id.fragment2);
        changeFrag.changeText(text);
    }

}
