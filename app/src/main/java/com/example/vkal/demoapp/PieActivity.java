package com.example.vkal.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PieActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie);

        PieChart pie = (PieChart) findViewById(R.id.pieChart);

        //Populate pie entries.
        ArrayList<PieEntry> pieEntries = new ArrayList<PieEntry>();
        pieEntries.add(new PieEntry(1,5));
        pieEntries.add(new PieEntry(2,1));
        pieEntries.add(new PieEntry(3,10));
        pieEntries.add(new PieEntry(4,18));
        pieEntries.add(new PieEntry(5,22));

        //Bundle entries in a dataset.
        PieDataSet dataSet = new PieDataSet(pieEntries,"Pie Chart Demonstration");
        dataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        PieData data = new PieData(dataSet);
        pie.setData(data);
    }

    @Override
    public void onBackPressed(){
        super.onBackPressed();
        overridePendingTransition(R.anim.left_in,R.anim.right_out);
    }
}
