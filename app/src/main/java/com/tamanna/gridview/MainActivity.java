package com.tamanna.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    ArrayAdapter<String> arrayAdapter;

    String[] Countries={"India","Usa","Uk","China",
            "India","Usa","Uk","China","India","Usa","Uk","China",
            "India","Usa","Uk","China",
            "India","Usa","Uk","China","Others"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        gridView = findViewById(R.id.SimpleGrid);
        arrayAdapter = new ArrayAdapter<>(MainActivity.this,R.layout.txt_layout,R.id.myText,Countries);
        gridView.setAdapter(arrayAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {

                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("uname",Countries[i]);
                startActivity(intent);


                Toast.makeText(MainActivity.this, ""+Countries[i], Toast.LENGTH_SHORT).show();


            }
        });

        gridView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "" + i, Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("uname",Countries[i]);
                startActivity(intent);

                return true;
            }
        });
    }
}

