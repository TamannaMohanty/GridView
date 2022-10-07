package com.tamanna.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView usertext;
    String txtname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

            usertext = findViewById(R.id.txtUname);
            txtname = getIntent().getStringExtra("uname");
            usertext.setText(""+txtname);
        }
    }
