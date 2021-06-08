package com.example.basicfunctions;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class webopen extends AppCompatActivity {
    EditText weburl;
    Button openlink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webopen);
    }

    @SuppressLint("QueryPermissionsNeeded")
    public void openinweb(View v){
        weburl=findViewById(R.id.weburl);
        openlink=findViewById(R.id.openlink);

        String urltext = weburl.getText().toString();
        Toast.makeText(this, urltext, Toast.LENGTH_SHORT).show();

        Uri webpage = Uri.parse(urltext);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
//        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
//        }
    }

}