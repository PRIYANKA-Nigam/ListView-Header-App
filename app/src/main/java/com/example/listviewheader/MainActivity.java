package com.example.listviewheader;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView=(ListView)findViewById(R.id.ll);
        ViewGroup headerview=(ViewGroup)getLayoutInflater().inflate(R.layout.header,listView,false);
        listView.addHeaderView(headerview);
        String[] items=getResources().getStringArray(R.array.alphabets);
        ListAdapter adapter=new ListAdapter(this,R.layout.row_layout,R.id.tt,items);
        listView.setAdapter(adapter);
    }
}