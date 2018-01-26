package com.example.android.datetimepickers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showDatePickerDialog(View view) {
        android.support.v4.app.DialogFragment newFragment = new DatePickerFragment();

        newFragment.show(getSupportFragmentManager(),
                getString(R.string.date_picker));

    }

    public void showTimePickerDialog(View view) {
        android.support.v4.app.DialogFragment newFragment = new TimePickerFragment();

        newFragment.show(getSupportFragmentManager(),
                getString(R.string.time_picker));
    }
}
