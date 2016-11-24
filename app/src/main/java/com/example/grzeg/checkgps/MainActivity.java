package com.example.grzeg.checkgps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.grzeg.checkgps.api.ApiEngine;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_start = (Button)findViewById(R.id.btn_ON);
        Button btn_stop = (Button)findViewById(R.id.btn_OFF);
        btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startService();
            }
        });
        btn_stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopService();
            }
        });
    }
    public void startService()
    {
        Intent intent = new Intent(this,ApiEngine.class);
        startService(intent);
    }
    public void stopService()
    {
        Intent intent = new Intent(this,ApiEngine.class);
        stopService(intent);
    }
}
