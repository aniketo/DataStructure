package com.vms.ds;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class singly_link_listMain extends AppCompatActivity {
    ListView listView;
    String data []= {"Create link","Reverse","Insert at first node","Insert at last node","Insert anywhere","Delete from first node","Delete from last node",
   "Delete from anywhere","Display link list","Count link list"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singly_link_list_main);

        listView=findViewById(R.id.list_id);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,data);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0)
                {
                    Intent intent=new Intent(getApplicationContext(),webView.class);
                    intent.putExtra("page_url", "http://www.sanfoundry.com/c-program-create-linked-list-display-elements/");
                    startActivity(intent);
                }
                if(i==1)
                {
                    Intent intent=new Intent(getApplicationContext(),webView.class);
                    intent.putExtra("page_url", "https://www.geeksforgeeks.org/reverse-a-linked-list/");
                    startActivity(intent);
                }
                if(i==2)
                {
                    Intent intent=new Intent(getApplicationContext(),webView.class);
                    intent.putExtra("page_url", "http://www.c4learn.com/data-structure/insert-node-at-first-position-singly-linked-list/");
                    startActivity(intent);
                }
                if(i==3)
                {
                    Intent intent=new Intent(getApplicationContext(),webView.class);
                    intent.putExtra("page_url", "http://www.c4learn.com/data-structure/insert-node-at-last-position-singly-linked-list/");
                    startActivity(intent);
                }
                if(i==4)
                {
                    Intent intent=new Intent(getApplicationContext(),webView.class);
                    intent.putExtra("page_url", "https://www.geeksforgeeks.org/insert-node-middle-linked-list/");
                    startActivity(intent);
                }
                if(i==5)
                {
                    Intent intent=new Intent(getApplicationContext(),webView.class);
                    intent.putExtra("page_url", "http://www.c4learn.com/data-structure/delete-node-from-first-postion-in-singly-linked-list/");
                    startActivity(intent);
                }
                if(i==6)
                {
                    startActivity(new Intent(getApplicationContext(),webView.class));Intent intent=new Intent(getApplicationContext(),webView.class);
                    intent.putExtra("page_url", "https://stackoverflow.com/questions/17184511/delete-the-last-node-of-a-single-linked-list-using-the-single-pointer-to-start-n");
                    startActivity(intent);
                }
                if(i==7)
                {
                    Intent intent=new Intent(getApplicationContext(),webView.class);
                    intent.putExtra("page_url", "http://www.sanfoundry.com/c-program-create-linked-list-display-elements/");
                    startActivity(intent);
                }
                if(i==8)
                {
                    Intent intent=new Intent(getApplicationContext(),webView.class);
                    intent.putExtra("page_url", "http://www.c4learn.com/data-structure/display-singly-linked-list-from-first-to-last/");
                    startActivity(intent);
                }
                if(i==9)
                {
                    Intent intent=new Intent(getApplicationContext(),webView.class);
                    intent.putExtra("page_url", "https://www.geeksforgeeks.org/find-length-of-a-linked-list-iterative-and-recursive/");
                    startActivity(intent);
                }
            }
        });



    }
}
