package com.example.whattimeisit;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SimpleDateFormat") //Esto me lo genera Android Studio
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateFormat;
        dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat timeFormat;
        timeFormat = new SimpleDateFormat("HH:mm");

        TextView lblDate_now = findViewById(R.id.lblDate_now);
        lblDate_now.setText(dateFormat.format(calendar.getTime()));
        TextView lblTime_Now = findViewById(R.id.lblTime_now);
        lblTime_Now.setText(timeFormat.format(calendar.getTime()));
    }
}