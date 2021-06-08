package com.example.basicfunctions;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PhoneCall extends AppCompatActivity {
    EditText phoneno;
    Button callbt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_call);
    }

//    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
//        phoneno=view.findViewById(R.id.phoneno);
//        callbt=view.findViewById(R.id.callbt);
//        callbt.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view) {
//                String phoneNumber=phoneno.getText().toString();
//                Toast.makeText(PhoneCall.this, phoneNumber, Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent(Intent.ACTION_DIAL);
//                intent.setData(Uri.parse("tel:" + phoneNumber));
//                if (intent.resolveActivity(getPackageManager()) != null) {
//                    startActivity(intent);
//                }
//
//            }
//
//        });

//    }
    public void callitbro(View v)
    {
        phoneno=findViewById(R.id.phoneno);
        callbt=findViewById(R.id.callbt);
        String phonenum =  phoneno.getText().toString();
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + phonenum));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }


    }



}