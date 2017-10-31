package com.shakibcsekuet.tabhost;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by md sakib on 9/29/2017.
 */
public class CSE extends AppCompatActivity {
    ListView simpleList;
    String countryList[] = {"Discreate mathematics", "Differential calculus,MATH", "Physics", "Circuit analysis,EEE"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cse);
        simpleList = (ListView)findViewById(R.id.simpleListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.cse_book_listview, R.id.textView, countryList);
        simpleList.setAdapter(arrayAdapter);
    }
}