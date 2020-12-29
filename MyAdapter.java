package com.example.anticorona;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class MyAdapter extends ArrayAdapter<Question> {
    Context _cont;
    int res;
    List<Question> items;
    public MyAdapter(@NonNull Context context, int resource, @NonNull List<Question> questions) {
        super(context, resource, questions);
        _cont=context;
        res=resource;
        items=questions;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
    View row;
        LayoutInflater loi=(LayoutInflater) _cont.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        row=loi.inflate(res,parent,false);
        TextView ques=row.findViewById(R.id.question);
        ques.setText(items.get(position).getQuestion());

        RadioGroup rg=row.findViewById(R.id.bla);


        RadioButton ans1=row.findViewById(R.id.ans1);
        ans1.setText(items.get(position).getAns1());

        RadioButton ans2=row.findViewById(R.id.ans2);
        ans2.setText(items.get(position).getAns2());

        RadioButton ans3=row.findViewById(R.id.ans3);
        ans3.setText(items.get(position).getAns3());
    return row;

    }
}
