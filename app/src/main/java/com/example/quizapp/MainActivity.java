package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void openq1(View view){
        Toast.makeText(this, "C QUIZ SELECTED", Toast.LENGTH_SHORT).show();
        Intent i3=new Intent(this,C.class);
        startActivity(i3);
    }
    public void openq2(View view){
        Toast.makeText(this, "C++ QUIZ SELECTED", Toast.LENGTH_SHORT).show();
        Intent i3=new Intent(this,CPP.class);
        startActivity(i3);
    }
    public void openq3(View view){
        Toast.makeText(this, "JAVA QUIZ SELECTED", Toast.LENGTH_SHORT).show();
        Intent i3=new Intent(this,JAVA.class);
        startActivity(i3);
    }
    public void openq4(View view){
        Toast.makeText(this, "PYTHON QUIZ SELECTED", Toast.LENGTH_SHORT).show();
        Intent i3=new Intent(this,PYTHON.class);
        startActivity(i3);
    }

}