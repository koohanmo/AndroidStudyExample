package com.softku.androidstudy.Adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.softku.androidstudy.Model.hangDataModel;
import com.softku.androidstudy.View.hangView;

import java.util.ArrayList;

/**
 * Created by rngks on 2016-05-15.
 */
public class hangAdapter extends BaseAdapter{

    Context mcon;
    ArrayList<hangDataModel> dataSet;

    public hangAdapter(Context con, ArrayList<hangDataModel> _data)
    {
        this.mcon=con;
        this.dataSet=_data;
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
        hangView v = (hangView) convertView;
        if(v==null) v= new hangView(mcon);
        v.setView(dataSet.get(position));
        return v;
    }
}
