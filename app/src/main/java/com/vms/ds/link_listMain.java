package com.vms.ds;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class link_listMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_link_list_main);

        Intent i=getIntent();
        Bundle b =i.getExtras(); // buldle stores the data which is coming from other activity
        String s= b.getString("name");

        TextView t= (TextView)findViewById(R.id.textView9);

        t.setText(s);




    }
}
