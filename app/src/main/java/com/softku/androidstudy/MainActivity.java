package com.softku.androidstudy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.softku.androidstudy.Adapter.MainAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> dataSet;
    ArrayList<Class<?>> activitySet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init()
    {
        dataSet = new ArrayList<String>();
        activitySet = new ArrayList<Class<?>>();
        makeData();
        MainAdapter adapter = new MainAdapter(this,dataSet);
        ListView list = (ListView)findViewById(R.id.list_main);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent i = new Intent(getApplicationContext(),activitySet.get(position));
                startActivity(i);

            }
        });
    }

    private void makeData()
    {
        dataSet.add("첫째주 예제\n2016-05-09 ~ 2016-05-15");
        activitySet.add(example1.class);
    }
}
