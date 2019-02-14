package com.introtoandroid.listviewdemo_jacobmattox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private ListView class_schedule;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        class_schedule = (ListView) findViewById(R.id.class_schedule);

        //String[] classes = new String[] {"TensorFlow", "Advanced Algorithms", "Seminar for Computing in Society",
              //  "Database Concepts", "Software Engineering"};

        String[] classes =  getResources().getStringArray(R.array.classes_last_semester);

        ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, classes);
        class_schedule.setAdapter(adapter);



        class_schedule.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast new_toast = Toast.makeText(getApplicationContext(), "" + class_schedule.getItemAtPosition(position) + " was clicked",
                        Toast.LENGTH_LONG );
                new_toast.show();
            }
        });

        class_schedule.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                return true;
            }
        });

    }
}
