package com.example.nimmy.gridview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String name[] = getResources().getStringArray(R.array.name);
        GridView gridView = (GridView)findViewById(R.id.activity_main);
        ImageAdapter dataAdapter = new ImageAdapter(MainActivity.this);
        gridView.setAdapter(dataAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("position",position);
                startActivity(intent);
                //Toast.makeText(MainActivity.this,"hello"+parent.getItemAtPosition(position),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
