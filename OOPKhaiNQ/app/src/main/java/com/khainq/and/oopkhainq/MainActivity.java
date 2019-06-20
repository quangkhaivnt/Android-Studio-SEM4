package com.khainq.and.oopkhainq;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Student st = new Student("Ngô Quang Khải","Bắc Giang", 1999);

//        st.Name = "Ngô Quang Khải";
//        st.Address = "Bắc Giang";
//        st.SetBirthday(1999);

        Toast.makeText(this,"Năm Sinh :"+ st.GetBirthday(),Toast.LENGTH_SHORT).show();
    }
}
