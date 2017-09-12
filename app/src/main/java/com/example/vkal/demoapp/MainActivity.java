package com.example.vkal.demoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button graphButton = (Button) findViewById(R.id.graphButton);

        //Graph button actions
        graphButton.setOnClickListener(
                new OnClickListener(){

                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), GraphList.class);
                        startActivity(intent);
                        overridePendingTransition(R.anim.right_in, R.anim.left_out);
                    }
                }
        );

    }
}
