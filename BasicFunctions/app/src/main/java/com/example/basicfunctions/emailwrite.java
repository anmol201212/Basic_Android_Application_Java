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

public class emailwrite extends AppCompatActivity {
    Button sentmsg;
    EditText emailadd;
    EditText msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emailwrite);
    }
//    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
//        sentmsg=view.findViewById(R.id.sentmsg);
//        emailadd=view.findViewById(R.id.emailadd);
//        msg=view.findViewById(R.id.msg);
//        sentmsg.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view) {
//                String addresses=emailadd.getText().toString();
//                String subject=msg.getText().toString();
//
//                Intent intent = new Intent(Intent.ACTION_SEND);
//                intent.setType("*/*");
//                intent.putExtra(Intent.EXTRA_EMAIL, addresses);
//                intent.putExtra(Intent.EXTRA_SUBJECT, subject);
////                intent.putExtra(Intent.EXTRA_STREAM, attachment);
//                if (intent.resolveActivity(getPackageManager()) != null) {
//                    startActivity(intent);
//                }
//
//            }
//
//        });





    public void sendmessage(View view){
        sentmsg=findViewById(R.id.sentmsg);
        emailadd=findViewById(R.id.emailadd);
        msg=findViewById(R.id.msg);

        String addresses=emailadd.getText().toString();
        String subject=msg.getText().toString();
        Toast.makeText(this, sentmsg+" "+emailadd, Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_EMAIL, addresses);
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
//        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
//        }

    }
}
