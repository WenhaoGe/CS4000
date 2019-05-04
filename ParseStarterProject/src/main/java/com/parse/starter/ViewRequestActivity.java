package com.parse.starter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ViewRequestActivity extends AppCompatActivity {

    ListView requestListView;
    ArrayList<String> requests = new ArrayList<>();
    ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_request);

        requestListView = (ListView) findViewById(R.id.requestListView);
        requests.add("Test");
        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, requests);
        requestListView.setAdapter(arrayAdapter);
    }
}
