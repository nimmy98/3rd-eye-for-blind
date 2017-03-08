package com.example.nimmy.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Nimmy on 26-01-2017.
 */

 public class RecordAdapter extends BaseAdapter {

    private Context con;

    int recorder[] = new int[]{
            R.drawable.create_recorder,
            R.drawable.recorder_list,
            R.drawable.back_arrow,
    };
    String name[] = new String[]{
            "Create_Recorder",
            "Recorder_List",
            "Back",
    };
    public RecordAdapter(Context c) {
        con = c;
    }

    @Override
    public int getCount() {
        return recorder.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
    static class ViewHolder {
        ImageView iconImage;
        TextView categoryText;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        MainAdapter.ViewHolder holder;
        if (convertView == null) {
            holder = new MainAdapter.ViewHolder();
            convertView = LayoutInflater.from(con).inflate(R.layout.single_row,parent, false);
            holder.iconImage = (ImageView)convertView.findViewById(R.id.main_image);
            holder.categoryText = (TextView) convertView.findViewById(R.id.main_TV);
            convertView.setTag(holder);
        }
        else{
            holder = (MainAdapter.ViewHolder)convertView.getTag();
        }
        holder.iconImage.setPadding(3,3,3, 3);
        holder.iconImage.setImageResource(recorder[position]);
        holder.categoryText.setText(name[position]);
        return convertView;
    }
}
