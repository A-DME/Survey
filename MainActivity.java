package com.example.anticorona;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RadioGroup;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView lst;
    MyAdapter adt;
    RadioGroup rg;
    List<Question> questions;

    Button sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lst =findViewById(R.id.lstvew);
        questions=new ArrayList<Question>();
        questions.add(new Question(getString(R.string.tempq),getString(R.string.tempa1),getString(R.string.tempa2),getString(R.string.tempa3)));
        questions.add(new Question(getString(R.string.headq),getString(R.string.heada1),getString(R.string.heada2),getString(R.string.heada3)));
        questions.add(new Question(getString(R.string.cufq),getString(R.string.cufa1),getString(R.string.cufa2),getString(R.string.cufa3)));
        questions.add(new Question(getString(R.string.brtq),getString(R.string.brta1),getString(R.string.brta2),getString(R.string.brta3)));
        questions.add(new Question(getString(R.string.prgq),getString(R.string.prga1),getString(R.string.prga2),getString(R.string.prga3)));
        questions.add(new Question(getString(R.string.sntq),getString(R.string.snta1),getString(R.string.snta2),getString(R.string.snta3)));
        questions.add(new Question(getString(R.string.bpq),getString(R.string.bpa1),getString(R.string.bpa2),getString(R.string.bpa3)));

        //        todos.add(new Todo("2","decribtion 2"));
//        todos.add(new Todo("3","decribtion 3"));


        adt=new MyAdapter(this,R.layout.row,questions);
        lst.setAdapter(adt);
        sub=findViewById(R.id.submit);
        String[] res=Rosheta(questions);
















        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in= new Intent(MainActivity.this,Analysis.class);
//                in.putExtra("Survey",res);

                startActivity(in);
            }
        });
        
    }
    public String[] Rosheta(List<Question> s){
        Log.i("shako","1");
        Question q=s.get(0);
        Log.i("shako","2");
        Log.i("shako",q.getAns());
        String[] t=new String[18];
        Log.i("shako","3");
        if(q.getAns()==getString(R.string.tempa2)){
            Log.i("shako","4");
            t[0]="Good Condition";
            t[1]="Keep up";
        }
        Log.i("shako","5");
        return t;
    }
}