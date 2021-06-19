package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class PYTHON extends AppCompatActivity {
    private RadioGroup rg;
    private RadioButton rb,r1,r2,r3,r4;
    private TextView tex;
    private String[] questions={"Which of the following commands will create a list?",
            "What is the output when we execute list(“hello”)?",
            "OUTPUT\n >>>example=\"helloworld\"\n >>>example[::-1].startswith(\"d\")",
            "OUTPUT\n >>>example = \"snow world\"\n >>>print(\"%s\" % example[4:7])",
            "To concatenate two strings to a third what statements are applicable?",
            "OUTPUT\n >>>example = \"helle\"\n >>>example.find(\"e\")",
            "OUTPUT \n>>max(\"what are you\")","How to output in python?",
            "import functools\n l=[1,2,3,4]\n print(functools.reduce(lambda x,y:x*y,l))",
            "Which of these in not a core data type?"    };
    private String[] o1={"list1 = list()","[‘h’, ‘e’, ‘l’, ‘l’, ‘o’]","error","wo","s3 = s1 * s2","0","error","print()","no output","Dictionary"};
    private String[] o2={"list1 = []","[‘hello’]","False","ow","s3 = s1.__add__(s2)","error","123","cout>>","error","class"};
    private String[] o3={"list1 = list([1, 2, 3])","[‘llo’]","True","so","s3 = s1 . s2","2","y","println()","24","Tuples"};
    private String[] o4={"ALL OF THE ABOVE","[‘olleh’]","dlrowolleh","worl","s3 = s1.add(s2)","1","exception","printf()","30","Lists"};
    private String[] ans={"ALL OF THE ABOVE","[‘h’, ‘e’, ‘l’, ‘l’, ‘o’]","True","wo","s3 = s1.__add__(s2)","1","y","print()","24","class"};
    public   int index=0,score=0;
    public int count=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p_y_t_h_o_n);
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