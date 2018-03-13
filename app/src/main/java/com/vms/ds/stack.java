package com.vms.ds;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class stack extends AppCompatActivity {
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

                if(i==0)
                {
                    Intent intent=new Intent(getApplicationContext(),webView.class);
                    intent.putExtra("page_url", "https://www.thecrazyprogrammer.com/2013/12/c-program-for-array-representation-of-stack-push-pop-display.html");
                    startActivity(intent);
                }
                if(i==2)
                {
                    Intent intent=new Intent(getApplicationContext(),webView.class);
                    intent.putExtra("page_url", "https://www.thecrazyprogrammer.com/2013/12/c-program-for-array-representation-of-stack-push-pop-display.html");
                    startActivity(intent);
                }
                if(i==3)
                {
                    Intent intent=new Intent(getApplicationContext(),webView.class);
                    intent.putExtra("page_url", "https://www.thecrazyprogrammer.com/2013/12/c-program-for-array-representation-of-stack-push-pop-display.html");
                    startActivity(intent);
                }
                if(i==4)
                {
                    Intent intent=new Intent(getApplicationContext(),webView.class);
                    intent.putExtra("page_url", "https://www.thecrazyprogrammer.com/2013/12/c-program-for-array-representation-of-stack-push-pop-display.html");
                    startActivity(intent);
                }
                if(i==5)
                {
                    Intent intent=new Intent(getApplicationContext(),webView.class);
                    intent.putExtra("page_url", "https://www.thecrazyprogrammer.com/2013/12/c-program-for-array-representation-of-stack-push-pop-display.html");
                    startActivity(intent);
                }
                if(i==6)
                {
                    Intent intent=new Intent(getApplicationContext(),webView.class);
                    intent.putExtra("page_url", "https://www.thecrazyprogrammer.com/2013/12/c-program-for-array-representation-of-stack-push-pop-display.html");
                    startActivity(intent);
                }


            }
        });
    }
}
