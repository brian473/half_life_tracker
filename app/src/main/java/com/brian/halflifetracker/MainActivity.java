package com.brian.halflifetracker;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import com.brian.halflifetracker.adapter.ActiveDrugAdapter;
import com.melnykov.fab.FloatingActionButton;


public class MainActivity extends Activity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private FloatingActionButton mFloatingActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Using RecyclerView just to try it out. It's probably not the best thing to use here.
        mRecyclerView = (RecyclerView) findViewById(R.id.active_drug_recycler);
        mFloatingActionButton = (FloatingActionButton) findViewById(R.id.fab);

        mFloatingActionButton.attachToRecyclerView(mRecyclerView);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new ActiveDrugAdapter(new String[] {"Aspirin", "Ibuprofen", "Acetaminophen"});
        mRecyclerView.setAdapter(mAdapter);
    }
}