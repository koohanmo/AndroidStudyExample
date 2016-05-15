package com.softku.androidstudy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.softku.androidstudy.Adapter.hangAdapter;
import com.softku.androidstudy.Model.hangDataModel;

import java.util.ArrayList;

/**
 * Created by rngks on 2016-05-15.
 */
public class example3 extends AppCompatActivity{

    ListView list;
    hangAdapter adapter;
    ArrayList<hangDataModel> dataSet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example3);
        initUI();
    }

    //UI초기화
    private void initUI()
    {
        list=(ListView)findViewById(R.id.list);
        makeData();
        adapter = new hangAdapter(this,dataSet);
        list.setAdapter(adapter);
    }

    private void makeData()
    {
        dataSet = new ArrayList<hangDataModel>();

        hangDataModel temp = new hangDataModel();
        temp.text="상협이 병신 나는 바보래요";
        temp.img=R.drawable.ic_hang;
        dataSet.add(temp);

        temp = new hangDataModel();
        temp.text="상협이 병신 나는 바보래요";
        temp.img=R.drawable.ic_hang;
        dataSet.add(temp);

        temp = new hangDataModel();
        temp.text="상협이 병신 나는 바보래요";
        temp.img=R.drawable.ic_hang;
        dataSet.add(temp);

        temp = new hangDataModel();
        temp.text="상협이 병신 나는 바보래요";
        temp.img=R.drawable.ic_hang;
        dataSet.add(temp);

        temp = new hangDataModel();
        temp.text="상협이 병신 나는 바보래요";
        temp.img=R.drawable.ic_hang;
        dataSet.add(temp);

        temp = new hangDataModel();
        temp.text="상협이 병신 나는 바보래요";
        temp.img=R.drawable.ic_hang;
        dataSet.add(temp);

        temp = new hangDataModel();
        temp.text="상협이 병신 나는 바보래요";
        temp.img=R.drawable.ic_hang;
        dataSet.add(temp);

        temp = new hangDataModel();
        temp.text="상협이 병신 나는 바보래요";
        temp.img=R.drawable.ic_hang;
        dataSet.add(temp);

        temp = new hangDataModel();
        temp.text="상협이 병신 나는 바보래요";
        temp.img=R.drawable.ic_hang;
        dataSet.add(temp);

        temp = new hangDataModel();
        temp.text="상협이 병신 나는 바보래요";
        temp.img=R.drawable.ic_hang;
        dataSet.add(temp);

        temp = new hangDataModel();
        temp.text="상협이 병신 나는 바보래요";
        temp.img=R.drawable.ic_hang;
        dataSet.add(temp);

        temp = new hangDataModel();
        temp.text="상협이 병신 나는 바보래요";
        temp.img=R.drawable.ic_hang;
        dataSet.add(temp);

        temp = new hangDataModel();
        temp.text="상협이 병신 나는 바보래요";
        temp.img=R.drawable.ic_hang;
        dataSet.add(temp);

    }

}
