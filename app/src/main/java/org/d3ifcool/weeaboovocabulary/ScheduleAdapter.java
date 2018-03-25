package org.d3ifcool.weeaboovocabulary;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by andinu on 13/03/2018.
 */

public class ScheduleAdapter extends ArrayAdapter {
    public ScheduleAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_schedule, parent, false);
        }

        Word word = (Word) getItem(position);

        TextView timeText = convertView.findViewById(R.id.time_sch_text);
        timeText.setText(word.getTimeSchedule());

        ImageView img = convertView.findViewById(R.id.img_sch);
        img.setImageResource(word.getImageSchedule());

        return convertView;
    }
}
