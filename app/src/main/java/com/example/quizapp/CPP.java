package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class CPP extends AppCompatActivity {
    private RadioGroup rg;
    private RadioButton rb,r1,r2,r3,r4;
    private TextView tex;
    private String[] questions={"How to output in C++?"};
    private String[] o1={"cout<<"};
    private String[] o2={"cout>>"};
    private String[] o3={"cin>>"};
    private String[] o4={"cin<<"};
    private String[] ans={"cout<<"};
    public   int index=0,score=0;
    public int count=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_p_p);
        tex=findViewById(R.id.textView5);
        r1=findViewById(R.id.radioButton);
        r2=findViewById(R.id.radioButton1);
        r3=findViewById(R.id.radioButton2);
        r4=findViewById(R.id.radioButton3);
        tex.setText(" "+count+" "+questions[index]);
        r1.setText(o1[index]);
        r2.setText(o2[index]);
        r3.setText(o3[index]);
        r4.setText(o4[index]);
    }
    public void SUBMIT(View view){
        rg=findViewById(R.id.radiogroup);
        int rid=rg.getCheckedRadioButtonId();
        rb=findViewById(rid);
        if(rid>0)
        {
            if(ans[index].equals(rb.getText())){
                score++;
            }
            index++;
            count++;
            if(index>=questions.length){

                Toast.makeText(this, "QUIZ ENDED", Toast.LENGTH_SHORT).show();
                Intent i3=new Intent(this,SCORE.class);
                i3.putExtra("extra",""+score);
                startActivity(i3);
            }
            else{
                rg.clearCheck();
                tex.setText(" "+count+" "+questions[index]);
                r1.setText(o1[index]);
                r2.setText(o2[index]);
                r3.setText(o3[index]);
                r4.setText(o4[index]);}
        }
        else
            Toast.makeText(this, "PLEASE SELECT ANY OPTION", Toast.LENGTH_SHORT).show();

    }
    public void onBackPressed(){
        Toast.makeText(this, "OOPS! YOU HAVE TO FINISH QUIZ ", Toast.LENGTH_SHORT).show();
    }
}