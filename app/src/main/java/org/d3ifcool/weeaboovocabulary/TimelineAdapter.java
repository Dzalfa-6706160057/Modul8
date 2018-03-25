package org.d3ifcool.weeaboovocabulary;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by andinu on 13/03/2018.
 */

public class TimelineAdapter extends ArrayAdapter {
    public TimelineAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listViewItem = convertView;

        if (listViewItem == null){
            listViewItem = LayoutInflater.from(getContext()).inflate(R.layout.list_item_timeline, parent, false);
        }

        Word word = (Word) getItem(position);

        ImageView img = listViewItem.findViewById(R.id.img_timeline);
        TextView dateText = listViewItem.findViewById(R.id.date_tl_text);
        TextView firstVocab = listViewItem.findViewById(R.id.first_tl_text);
        TextView secondVocab = listViewItem.findViewById(R.id.second_tl_text);
        TextView thirdVocab = listViewItem.findViewById(R.id.third_tl_text);
        TextView fourthVocab = listViewItem.findViewById(R.id.fourth_tl_text);
        TextView fifthVocab = listViewItem.findViewById(R.id.fifth_tl_text);
        LinearLayout vocabGroup = listViewItem.findViewById(R.id.vocab_group);

        img.setImageResource(word.getmImageTimeline());
        dateText.setText(word.getmDate());

        if (word.getmFirstVocab() == null){
            vocabGroup.setVisibility(View.GONE);
        } else {
            firstVocab.setText(word.getmFirstVocab());
            secondVocab.setText(word.getmSecondVocab());
            thirdVocab.setText(word.getmThirdVocab());
            fourthVocab.setText(word.getmFourthVocab());
            fifthVocab.setText(word.getmFifthVocab());
        }


        return listViewItem;
    }
}
