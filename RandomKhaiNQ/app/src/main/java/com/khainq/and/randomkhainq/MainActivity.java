package com.khainq.and.randomkhainq;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView txtNumber;
    Button btnRandom;
    EditText edtNumber1, edtNumber2;
    private void AnhXa(){
        txtNumber = (TextView) findViewById(R.id.textViewNumber);
        btnRandom = (Button) findViewById(R.id.btnRandom);
        edtNumber1 = (EditText) findViewById(R.id.editTextNumberOne);
        edtNumber2 = (EditText) findViewById(R.id.editTextNumberTwo);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();

        btnRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String chuoi1 = edtNumber1.getText().toString().trim();
                String chuoi2 = edtNumber2.getText().toString().trim();

                if(chuoi1.length() == 0 || chuoi2.length() == 0){
                    Toast.makeText(MainActivity.this,"Vui lòng nhập đủ số",Toast.LENGTH_SHORT).show();
                }else{
                    int min = Integer.parseInt(chuoi1);
                    int max = Integer.parseInt(chuoi2);
                    // tạo số ngẫu nhiên
                    Random rd = new Random();

                    int number = rd.nextInt(max - min + 1) + min;
                    txtNumber.setText(String.valueOf(number));
                }


            }
        });
    }
}
