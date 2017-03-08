package com.example.nimmy.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Nimmy on 03-01-2017.
 */

public class MainAdapter extends BaseAdapter {
    private  Context con;
    int menu[] = new int[]{
            R.drawable.call , R.drawable.msg,
            R.drawable.contact , R.drawable.music,
            R.drawable.alaram , R.drawable.recorder,
            R.drawable.settings , R.drawable.status,

    };

    String name[] = new String[]{
            "Call",
            "Message",
            "Contact",
            "Music",
            "Alarm",
            "Recorder",
            "Settings",
            "Status"
    };

    public MainAdapter(Context c) {
        con = c;
    }

    public MainAdapter() {

    }


    @Override
    public int getCount() {
        return menu.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
    static class ViewHolder{
        ImageView iconImage;
        TextView categoryText;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            holder = new ViewHolder();
            convertView = LayoutInflater.from(con).inflate(R.layout.single_row,parent, false);
            holder.iconImage = (ImageView)convertView.findViewById(R.id.main_image);
            holder.categoryText = (TextView) convertView.findViewById(R.id.main_TV);
            convertView.setTag(holder);
        }
        else{
                holder = (ViewHolder)convertView.getTag();
        }
        holder.iconImage.setPadding(3,3,3, 3);
        holder.iconImage.setImageResource(menu[position]);
        holder.categoryText.setText(name[position]);
        //holder.categoryText.setText("call");

        return convertView;

    }
}
