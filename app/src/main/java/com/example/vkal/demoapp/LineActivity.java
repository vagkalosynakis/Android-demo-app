package com.example.vkal.demoapp;

import android.support.constraint.solver.ArrayLinkedVariables;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;

import java.util.ArrayList;

public class LineActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line);

        LineChart lineChart = (LineChart) findViewById(R.id.lineGraph);

        //Populate line entries.
        ArrayList<Entry> lineEntries = new ArrayList<Entry>();
        lineEntries.add(new Entry(1, 2));
        lineEntries.add(new Entry(2, 5));
        lineEntries.add(new Entry(3, 3));
        lineEntries.add(new Entry(4, 5));
        lineEntries.add(new Entry(5, 8));

        //Bundle entries in a dataset.
        LineDataSet dataSet = new LineDataSet(lineEntries, "Line Chart Demonstration");
        LineData data = new LineData(dataSet);
        lineChart.setData(data);

    }

    @Override
    public void onBackPressed(){
        super.onBackPressed();
        overridePendingTransition(R.anim.left_in,R.anim.right_out);
    }
}
