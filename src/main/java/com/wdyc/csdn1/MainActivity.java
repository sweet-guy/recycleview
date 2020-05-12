package com.wdyc.csdn1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRec;
    private MyAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRec = (RecyclerView) findViewById(R.id.activity_main);
        mAdapter = new MyAdapter();
        mRec.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        mRec.setHasFixedSize(true);
        mRec.setAdapter(mAdapter);
    }
}
