package com.softku.androidstudy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.softku.androidstudy.Adapter.MainAdapter;
import com.softku.androidstudy.example6_0701.example6_0701;

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

        dataSet.add("Design support Library\n2016-05-15");
        activitySet.add(example2.class);

        dataSet.add("Listview\n2016-05-15");
        activitySet.add(example3.class);

        dataSet.add("Touch Event Listener\n2016-05-15");
        activitySet.add(example4_0506.class);

        dataSet.add("Gesture Listener\n2016-05-15");
        activitySet.add(example5_0516.class);

        dataSet.add("Tab + Fragment + View Pager\n2016-07-01");
        activitySet.add(example6_0701.class);
    }
}
