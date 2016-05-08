package com.softku.androidstudy.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.softku.androidstudy.R;

import java.util.ArrayList;

/**
 * Created by 구한모 on 2016-05-09.
 */
public class MainAdapter extends BaseAdapter {

    ArrayList<String> dataSet;
    Context mcon;

    public MainAdapter(Context con,ArrayList<String> data)
    {
        this.dataSet=data;
        this.mcon=con;
    }

    @Override
    public int getCount() {
        return dataSet.size();
    }

    @Override
    public Object getItem(int position) {
        return dataSet.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if(convertView==null) {
            LayoutInflater inflater = (LayoutInflater) mcon.getSystemService(mcon.LAYOUT_INFLATER_SERVICE);
            v =(View)inflater.inflate(R.layout.mainlist_item,null);
        }
        TextView txt = (TextView)v.findViewById(R.id.txt);
        txt.setText(dataSet.get(position));

        return v;
    }

}
