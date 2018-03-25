package org.d3ifcool.weeaboovocabulary;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.ListView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Calendar;

public class ScheduleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogFragment newFragment = new TimePickerFragment();
                newFragment.show(getSupportFragmentManager(), "timePicker");
            }
        });

        ArrayList<Word> timeList = new ArrayList<>();
        timeList.add(new Word("04:29", R.drawable.ic_brightness_3_black_24dp));
        timeList.add(new Word("04:39", R.drawable.ic_brightness_3_black_24dp));
        timeList.add(new Word("05:51", R.drawable.ic_brightness_3_black_24dp));
        timeList.add(new Word("12:01", R.drawable.ic_wb_sunny_black_24dp));
        timeList.add(new Word("15:09", R.drawable.ic_wb_sunny_black_24dp));
        timeList.add(new Word("18:06", R.drawable.ic_brightness_3_black_24dp));
        timeList.add(new Word("19:15", R.drawable.ic_brightness_3_black_24dp));

        ListView listView = findViewById(R.id.list_item_sch);
        listView.setAdapter(new ScheduleAdapter(this, R.layout.list_item_schedule, timeList));
    }

    public static class TimePickerFragment extends DialogFragment
            implements TimePickerDialog.OnTimeSetListener {

        @NonNull
        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            // Use the current time as the default values for the picker
            final Calendar c = Calendar.getInstance();
            int hour = c.get(Calendar.HOUR_OF_DAY);
            int minute = c.get(Calendar.MINUTE);

            // Create a new instance of TimePickerDialog and return it
            return new TimePickerDialog(getActivity(), this, hour, minute,
                    DateFormat.is24HourFormat(getActivity()));
        }

        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
            // Do something with the time chosen by the user
                Toast.makeText(getContext(), hourOfDay + ":" + minute, Toast.LENGTH_SHORT).show();
            Toast.makeText(getContext(), "Fitur ini sedang dikembangkan", Toast.LENGTH_SHORT).show();
        }
    }
}
