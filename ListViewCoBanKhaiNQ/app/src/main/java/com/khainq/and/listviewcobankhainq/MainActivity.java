package com.khainq.and.listviewcobankhainq;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvMonHoc;
    ArrayList<String> arrayCourse;
    Button btnCreate,btnUpdate;
    EditText edtMonHoc;

    int vitri = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMonHoc = (ListView) findViewById(R.id.listviewMonHoc);
        btnCreate = (Button) findViewById(R.id.btnCreate);
        edtMonHoc = (EditText) findViewById(R.id.editTextMonHoc);
        btnUpdate = (Button) findViewById(R.id.btnUpdate);
        arrayCourse = new ArrayList<>();

        arrayCourse.add("Android");
        arrayCourse.add("PHP");
        arrayCourse.add("ASP.NET");
        arrayCourse.add("JAVA");
        arrayCourse.add("IOS");

        final ArrayAdapter ad = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1,arrayCourse);

        lvMonHoc.setAdapter(ad);

        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String monHoc = edtMonHoc.getText().toString();
                arrayCourse.add(monHoc);
                ad.notifyDataSetChanged();
            }
        });

        lvMonHoc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                edtMonHoc.setText(arrayCourse.get(position));
                vitri = position;
            }
        });

        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arrayCourse.set(vitri, edtMonHoc.getText().toString());
                ad.notifyDataSetChanged();
            }
        });

        lvMonHoc.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                arrayCourse.remove(vitri);
                ad.notifyDataSetChanged();
                return false;
            }
        });
    }
}
