package org.d3ifcool.weeaboovocabulary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class TodayVocabularyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_today_vocabulary);

        ArrayList<Word> listVocabulary = new ArrayList<>();
        listVocabulary.add(new Word("ああばん - Perkotaan", "ああかいぶ - Arsip", "ああき　てくちゃ - Arsitektur", "ああみい - Tentara", "ああす - Bumi"));

//        listVocabulary.add(new Word("ああばん - Perkotaan"));
//        listVocabulary.add(new Word("ああかいぶ - Arsip"));
//        listVocabulary.add(new Word("ああき　てくちゃ - Arsitektur"));
//        listVocabulary.add(new Word("ああみい - Tentara"));
//        listVocabulary.add(new Word("ああす - Bumi"));

        ListView listView = findViewById(R.id.list_item_tovo);
        listView.setAdapter(new TimelineAdapter(this, R.layout.list_item_today_vocabulary, listVocabulary));
    }
}
