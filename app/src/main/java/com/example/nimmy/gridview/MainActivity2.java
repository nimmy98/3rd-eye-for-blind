package com.example.nimmy.gridview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;
import android.widget.Toast;

/**
 * Created by Nimmy on 06-01-2017.
 */

public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        int position = intent.getIntExtra("position",-1);
        //Toast.makeText(this,"hey",Toast.LENGTH_LONG).show();
        if(position == 0){
            GridView gridView = (GridView)findViewById(R.id.activity_main2);
            //int call[] = getResources().getIntArray(R.array.call);
            CallAdapter dataAdapter = new CallAdapter(this);
            gridView.setAdapter(dataAdapter);
        }
        if(position == 1) {
            GridView gridView = (GridView) findViewById(R.id.activity_main2);
            MsgAdapter dataAdapter = new MsgAdapter(this);
            gridView.setAdapter(dataAdapter);
        }
        if(position == 2) {
            GridView gridView = (GridView) findViewById(R.id.activity_main2);
            ContactAdapter dataAdapter = new ContactAdapter(this);
            gridView.setAdapter(dataAdapter);
        }
        if(position == 3) {
            GridView gridView = (GridView) findViewById(R.id.activity_main2);
            MusicAdapter dataAdapter = new MusicAdapter(this);
            gridView.setAdapter(dataAdapter);
        }
        if(position == 4) {
            GridView gridView = (GridView) findViewById(R.id.activity_main2);
            AlarmAdapter dataAdapter = new AlarmAdapter(this);
            gridView.setAdapter(dataAdapter);
        }
        if(position == 5) {
            GridView gridView = (GridView) findViewById(R.id.activity_main2);
            RecordAdapter dataAdapter = new RecordAdapter(this);
            gridView.setAdapter(dataAdapter);
        }
        if(position == 6) {
            GridView gridView = (GridView) findViewById(R.id.activity_main2);
            SettingsAdapter dataAdapter = new SettingsAdapter(this);
            gridView.setAdapter(dataAdapter);
        }
//        if(position == 7) {
//            GridView gridView = (GridView) findViewById(R.id.activity_main2);
//             StatusAdapter    dataAdapter = new StatusAdapter(this);
////            gridView.setAdapter(dataAdapter);
//        }

    }
}