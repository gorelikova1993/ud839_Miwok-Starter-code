package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create an array of words

        ArrayList<Word> words = new ArrayList<Word>();
//        Word w = new Word("one", "lutti");
        words.add(new Word("one", "lutti"));
        words.add(new Word("two", "otiiko"));
        words.add(new Word("three", "tolookosu"));
        words.add(new Word("four", "oyyisa"));
        words.add(new Word("five", "massokka"));
        words.add(new Word("six", "temmokka"));
        words.add(new Word("seven", "kenekaku"));
        words.add(new Word("eight", "kawinta"));
        words.add(new Word("nine", "wo’e"));
        words.add(new Word("ten", "na’aacha"));
/*        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");*/

//        LinearLayout rootView = (LinearLayout)findViewById(R.id.rootView);
//        ArrayAdapter<Word> itemsAdapter = new ArrayAdapter<Word>(this, R.layout.list_item, words);
          WordAdapter adapter = new WordAdapter(this, words);


        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
/*        int index = 0;
        while(index < words.size()){
            TextView wordView = new TextView(this);
            wordView.setText(words.get(index));
            rootView.addView(wordView);
            index++;
        }*/
/*
        for(int index=0; index<words.size(); index++){
            TextView wordView = new TextView(this);
            wordView.setText(words.get(index));
            rootView.addView(wordView);
        }
*/

/*
        TextView wordView = new TextView(this);
        wordView.setText(words.get(0));
        rootView.addView(wordView);
*/

        /*  for (int i = 0; i < words.size(); i++) {
            Log.v("NumbersActivity","Word at index " + i+ ": " + words.get(i));
        }*/


    }
}
