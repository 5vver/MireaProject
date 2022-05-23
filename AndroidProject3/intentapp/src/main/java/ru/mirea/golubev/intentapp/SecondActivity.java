package ru.mirea.golubev.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView textView =(TextView) findViewById(R.id.textView);
        String text = getIntent().getStringExtra("date");
        textView.setText(text);
    }
}