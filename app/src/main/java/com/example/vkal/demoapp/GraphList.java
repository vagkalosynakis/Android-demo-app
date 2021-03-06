package com.example.vkal.demoapp;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class GraphList extends AppCompatActivity {

    private ListView list;
    private List<Graph> graphs = new ArrayList<Graph>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph_list);
        list = (ListView) findViewById(R.id.graphList);
        populateList();
        populateGraphList();

        list.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i==0) {
                    Intent intent = new Intent(getApplicationContext(), BarActivity.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.right_in, R.anim.left_out);
                }else if (i==1) {
                    Intent intent = new Intent(getApplicationContext(), LineActivity.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.right_in, R.anim.left_out);
                }else{
                    Intent intent = new Intent(getApplicationContext(), PieActivity.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.right_in, R.anim.left_out);
                }
            }
        });
    }

    private void populateList(){
        graphs.add(new Graph("bar","This is a bar graph.", R.drawable.ic_bar));
        graphs.add(new Graph("line","This is a line graph.", R.drawable.ic_graph));
        graphs.add(new Graph("pie","This is a pie chart.", R.drawable.ic_pie));
    }

    private void populateGraphList(){
        ArrayAdapter<Graph> adapter = new GraphAdapter();
        list.setAdapter(adapter);
    }

    private class GraphAdapter extends ArrayAdapter<Graph>{

        public GraphAdapter(){
            super(GraphList.this, R.layout.list_item_layout, graphs);
        }

        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            View graphView = convertView;
            if(graphView == null){
                graphView = getLayoutInflater().inflate(R.layout.list_item_layout, parent, false);
            }

            Graph currentGraph = graphs.get(position);
            ImageView image = (ImageView) graphView.findViewById(R.id.list_image);
            image.setImageResource(currentGraph.getGraphImageID());

            TextView text = (TextView) graphView.findViewById(R.id.list_text);
            text.setText(currentGraph.getGraphText());
            return  graphView;
        }
    }

    @Override
    public void onBackPressed(){
        super.onBackPressed();
        overridePendingTransition(R.anim.left_in,R.anim.right_out);
    }
}
