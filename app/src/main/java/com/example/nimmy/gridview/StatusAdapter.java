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

//public class ImageAdapter8 extends BaseAdapter {
//    private Context con;
//
//    int status[] = new int[]{
//            R.drawable.create_alarm,
//            R.drawable.alarmlist,
//            R.drawable.back_arrow,
//    };
//    String name[] = new String[]{
//            "Create_alarm",
//            "Alarm_List",
//            "Back",
//    };
//    public ImageAdapter8(Context c) {
//        con = c;
//    }
//
//    @Override
//    public int getCount() {
//        return status.length;
//    }
//
//    @Override
//    public Object getItem(int position) {
//        return null;
//    }
//    static class ViewHolder {
//        ImageView iconImage;
//        TextView categoryText;
//    }
//
//
//    @Override
//    public long getItemId(int position) {
//        return 0;
//    }
//
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//        ImageAdapter.ViewHolder holder;
//        if (convertView == null) {
//            holder = new ImageAdapter.ViewHolder();
//            convertView = LayoutInflater.from(con).inflate(R.layout.single_row,parent, false);
//            holder.iconImage = (ImageView)convertView.findViewById(R.id.main_image);
//            holder.categoryText = (TextView) convertView.findViewById(R.id.main_TV);
//            convertView.setTag(holder);
//        }
//        else{
//            holder = (ImageAdapter.ViewHolder)convertView.getTag();
//        }
//        holder.iconImage.setPadding(3,3,3, 3);
//        holder.iconImage.setImageResource(status[position]);
//        holder.categoryText.setText(name[position]);
//
//        return convertView;
//    }
//}
