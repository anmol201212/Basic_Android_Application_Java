package com.example.randomnumgen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    EditText input1;
    EditText input2;
    Button start;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void ramdomize(View v){
        input1=findViewById(R.id.input1);
        input2=findViewById(R.id.input2);
        start =findViewById(R.id.start);
        result=findViewById(R.id.result);
        String input1str =  input1.getText().toString();
        String input2str =  input2.getText().toString();
        int min=Integer.parseInt(input1str);
        int max=Integer.parseInt(input2str);
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        String answerofcal=String.valueOf(random_int);
        result.setText(answerofcal);


    }
}