package org.d3ifcool.weeaboovocabulary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class TimelineActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timeline);

        ArrayList<Word> timelineList = new ArrayList<>();
        timelineList.add(new Word(R.drawable.ic_cancel_black_24dp, "Tuesday, 13 March 2018"));
        timelineList.add(new Word(R.drawable.ic_check_circle_black_24dp, "Wednesday, 14 March 2018",
                "ああばん - Perkotaan",
                "ああかいぶ - Arsip",
                "ああき　てくちゃ - Arsitektur",
                "ああみい - Tentara",
                "ああす - Bumi"));
        timelineList.add(new Word(R.drawable.ic_check_circle_black_24dp, "Thursday, 15 March 2018",
                "ああす - Tanah",
                "ああと - Seni",
                "あばんちゅうる - Petualangan",
                "あばら - Rusuk",
                "あべにゅう - Jalan"));
        timelineList.add(new Word(R.drawable.ic_cancel_black_24dp, "Friday, 16 March 2018"));
        timelineList.add(new Word(R.drawable.ic_check_circle_black_24dp, "Saturday, 17 March 2018",
                "あべれえじ - Rata-rata",
                "あびきょうかん - Hiruk Pikuk",
                "あびりんぴっく - Keterampilan",
                "あびせる - Menuangkan",
                "あぼがど - Alpokat"));
        timelineList.add(new Word(R.drawable.ic_check_circle_black_24dp, "Sunday, 18 March 2018",
                "あぼりじに - Orang pribumi",
                "あぶなく - Nyaris",
                "あぶのおまる - Abnormal",
                "あぶら - Gemuk",
                "あぶらあげ - Tahu goreng"));

        ListView listView = findViewById(R.id.list_item_tline);
        listView.setAdapter(new TimelineAdapter(this, R.layout.activity_timeline, timelineList));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:{
                        Toast.makeText(getApplicationContext(), "Didnt submit vocabulary", Toast.LENGTH_SHORT).show();
                        break;
                    }case 1:{
                        Toast.makeText(getApplicationContext(), "Success", Toast.LENGTH_SHORT).show();
                        break;
                    }case 2:{
                        Toast.makeText(getApplicationContext(), "Success", Toast.LENGTH_SHORT).show();
                        break;
                    }case 3:{
                        Toast.makeText(getApplicationContext(), "Didnt submit vocabulary", Toast.LENGTH_SHORT).show();
                        break;
                    }case 4:{
                        Toast.makeText(getApplicationContext(), "Success", Toast.LENGTH_SHORT).show();
                        break;
                    }case 5:{
                        Toast.makeText(getApplicationContext(), "Success", Toast.LENGTH_SHORT).show();
                        break;
                    }
                }
            }
        });
    }
}
