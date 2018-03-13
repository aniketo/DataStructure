package com.vms.ds;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class queue extends AppCompatActivity {

    ListView listView;
    String data[]={"Push on array","Pop on array","Display array stack","Push on Link list","Pop on Link list","Display link list stack","Arithmetic operations",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stack);

        listView=findViewById(R.id.list_id);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                data);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent=new Intent(getApplicationContext(),FunctionLinklist.class);
                intent.putExtra("name",listView.getItemAtPosition(i).toString());
                startActivity(intent);

            }
        });
    }
}
