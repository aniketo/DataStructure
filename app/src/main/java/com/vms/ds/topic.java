package com.vms.ds;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class topic extends AppCompatActivity {
    ListView listView;
    String data[]={"Link list","Stack","Queue","Array"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic);

        listView=findViewById(R.id.listId);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,data);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
             if(i==0)
             {
                 startActivity(new Intent(getApplicationContext(),link_list.class));
             }
             if(i==1)
             {
                 startActivity(new Intent(getApplicationContext(),stack.class));
             }
             if(i==2)
             {
                 startActivity(new Intent(getApplicationContext(),queue.class));
             }
             if(i==3)
             {
                 startActivity(new Intent(getApplicationContext(),array.class));
             }

            }
        });
    }
}
