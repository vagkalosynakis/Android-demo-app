package com.example.vkal.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;

import java.util.ArrayList;

public class BarActivity extends AppCompatActivity {

    BarChart barChart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar);

        barChart = (BarChart) findViewById(R.id.barGraph);

        //Populate bar entries.
        ArrayList<BarEntry> barEntries = new ArrayList<>();
        barEntries.add(new BarEntry(1,10));
        barEntries.add(new BarEntry(2,25));
        barEntries.add(new BarEntry(3,12));
        barEntries.add(new BarEntry(4,7));
        barEntries.add(new BarEntry(5,40));

        //Bundle bars in a dataset.
        BarDataSet dataSet = new BarDataSet(barEntries,"Bar Demonstration");
        BarData barData = new BarData(dataSet);
        barData.setBarWidth(0.5f);

        //Show the dataset on the chart.
        barChart.setData(barData);
        barChart.invalidate();
    }

    @Override
    public void onBackPressed(){
        super.onBackPressed();
        overridePendingTransition(R.anim.left_in,R.anim.right_out);
    }
}
