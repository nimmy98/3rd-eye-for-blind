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
            ImageAdapter1 dataAdapter = new ImageAdapter1(this);
            gridView.setAdapter(dataAdapter);
           // Toast.makeText(this,"position"+position,Toast.LENGTH_LONG).show();
        }
        if(position == 1) {
            GridView gridView = (GridView) findViewById(R.id.activity_main2);
            ImageAdapter2 dataAdapter = new ImageAdapter2(this);
            gridView.setAdapter(dataAdapter);
        }
        if(position == 2) {
            GridView gridView = (GridView) findViewById(R.id.activity_main2);
            ImageAdapter3 dataAdapter = new ImageAdapter3(this);
            gridView.setAdapter(dataAdapter);
        }
        if(position == 3) {
            GridView gridView = (GridView) findViewById(R.id.activity_main2);
            ImageAdapter4 dataAdapter = new ImageAdapter4(this);
            gridView.setAdapter(dataAdapter);
        }
        if(position == 4) {
            GridView gridView = (GridView) findViewById(R.id.activity_main2);
            ImageAdapter5 dataAdapter = new ImageAdapter5(this);
            gridView.setAdapter(dataAdapter);
        }
        if(position == 5) {
            GridView gridView = (GridView) findViewById(R.id.activity_main2);
            ImageAdapter6 dataAdapter = new ImageAdapter6(this);
            gridView.setAdapter(dataAdapter);
        }
        if(position == 6) {
            GridView gridView = (GridView) findViewById(R.id.activity_main2);
            ImageAdapter7 dataAdapter = new ImageAdapter7(this);
            gridView.setAdapter(dataAdapter);
        }
        if(position == 7) {
            GridView gridView = (GridView) findViewById(R.id.activity_main2);
            ImageAdapter8 dataAdapter = new ImageAdapter8(this);
            gridView.setAdapter(dataAdapter);
        }
    }
}