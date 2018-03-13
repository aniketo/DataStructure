package com.vms.ds;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FunctionLinklist extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_function_linklist);

        Intent i= getIntent();
        Bundle b=i.getExtras();
        String s= b.getString("name");

        textView=findViewById(R.id.textViewFunction);

        textView.setText("Welcome to "+s);

    }
}
