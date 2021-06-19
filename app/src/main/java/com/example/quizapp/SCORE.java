package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class SCORE extends AppCompatActivity {
TextView s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s_c_o_r_e);
        s=findViewById(R.id.s);
        Intent intent=getIntent();
        String sc=intent.getStringExtra("extra");
        s.setText(" "+sc);
    }
    public  void home(View view){
        Intent i=new Intent(this,MainActivity.class);
        startActivity(i);
    }
    public void onBackPressed(){
        Toast.makeText(this, "You Can't go back", Toast.LENGTH_SHORT).show();
    }
}