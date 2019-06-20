package com.khainq.and.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Quang Khải");
        arrayList.add("Bắc Giang");
        arrayList.add("Hà Nội");

        Log.d("Quang Khải","Size:" + arrayList.size());

        Log.d("Quang Khải","Phần tử:" + arrayList.get(0));

        for (int i = 0; i < arrayList.size(); i++){
            Log.d("Quang Khải",arrayList.get(i));
        }

    }
}
