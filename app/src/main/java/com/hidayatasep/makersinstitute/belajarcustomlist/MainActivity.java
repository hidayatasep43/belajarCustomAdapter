package com.hidayatasep.makersinstitute.belajarcustomlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView mListView;
    WordAdapter mWordAdapter;
    ArrayList<Word> mWordArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //create list word
        mWordArrayList = new ArrayList<Word>();
        mWordArrayList.add(new Word("One","Satu"));
        mWordArrayList.add(new Word("Two","Dua"));
        mWordArrayList.add(new Word("Three","Tiga"));
        mWordArrayList.add(new Word("Four","Empat"));
        mWordArrayList.add(new Word("Five","Lima"));
        mWordArrayList.add(new Word("Six","Enam"));
        mWordArrayList.add(new Word("Seven","Tujuh"));
        mWordArrayList.add(new Word("Eight","Delapan"));
        mWordArrayList.add(new Word("Nine","Sembilan"));
        mWordArrayList.add(new Word("Ten","Sepuluh"));

        //create adapter
        mWordAdapter = new WordAdapter(MainActivity.this,mWordArrayList);

        //view
        mListView = (ListView) findViewById(R.id.listView);
        mListView.setAdapter(mWordAdapter);

    }
}
