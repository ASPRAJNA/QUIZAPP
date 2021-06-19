package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class JAVA extends AppCompatActivity {
    private RadioGroup rg;
    private RadioButton rb,r1,r2,r3,r4;
    private TextView tex;
 private String[] questions={"Which is true about an anonymous inner class?",
         "Which of the following class level (nonlocal) variable declarations will not compile?",
         "You want subclasses in any package to have access to members of a superclass. Which is the most restrictive access that accomplishes this objective?",
         "Which of the below are reserved keyword in Java?",
         "Which of the below is valid way to instantiate an array in java?",
 "What is the default value of int variable?","This is the parent of Error and Exception classes.",
 "Which interface does java.util.Hashtable implement?",
 "Which class does not override the equals() and hashCode() methods, inheriting them directly from class Object?",
 "What is the name of the method used to start a thread execution?"};
 private String o1[]={"It can extend exactly one class and can implement multiple interfaces.","protected int a;","protected","array","int myArray [] = {1, 3, 5};","1","Excep","Java.util.Collection","java.lang.Double","init();"};
 private String o2[]={"It can extend exactly one class and implement exactly one interface.","private synchronized int e;","public","while","int myArray [] [] = {1,2,3,4};","not defined","Err","Java.util.HashTable","java.lang.String","start();"};
 private String o3[]={"It can extend exactly one class or implement exactly one interface.","transient int b = 3;","default","force","int [] myArray = (5, 4, 3);","null","Throwable","Java.util.List","java.lang.StringBuffer","resume()"};
 private String o4[]={"It can implement multiple interfaces regardless of whether it also extends a class.","volatile int d;","private","null"," int [] myArray = {“1”, “2”, “3”};","0","Catchable","Java.util.Map","java.lang.Character","restart();"};
 private  String ans[]={"It can extend exactly one class or implement exactly one interface.","private synchronized int e;","protected","while","int myArray [] = {1, 3, 5};","0","Throwable","Java.util.Map","java.lang.StringBuffer","start();"};
 public   int index=0,score=0;
public int count=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_j_a_v);
        tex=findViewById(R.id.textView2);
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