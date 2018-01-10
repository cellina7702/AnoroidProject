package com.example.user.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by user on 2018-01-10.
 */

public class ForIntent extends AppCompatActivity {

    private TextView TxtV;
    private Button Btn;
    private String get;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forintent);//뷰이미지를생성

        Intent intent = getIntent();
        get=intent.getStringExtra("container");

        TxtV = (TextView) findViewById(R.id.textview);
        Btn = (Button) findViewById(R.id.button);

        Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TxtV.setText(get);
            }
        });
    }
}