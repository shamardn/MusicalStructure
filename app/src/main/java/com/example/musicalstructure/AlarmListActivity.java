package com.example.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.musicalstructure.databinding.ActivityAlarmListBinding;

import java.util.ArrayList;

public class AlarmListActivity extends AppCompatActivity {
    private ActivityAlarmListBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAlarmListBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        String song = "Alarm";
        String singer = "Windows Alarms";

        final ArrayList<Song> files = new ArrayList<>();
        files.add(new Song(song + " #01", singer, R.raw.alarm01));
        files.add(new Song(song + " #02", singer, R.raw.alarm01));
        files.add(new Song(song + " #03", singer, R.raw.alarm01));
        files.add(new Song(song + " #04", singer, R.raw.alarm01));
        files.add(new Song(song + " #05", singer, R.raw.alarm01));
        files.add(new Song("disambiguation", singer, R.raw.alarm01));
        files.add(new Song("misrecognition", singer, R.raw.alarm01));
        files.add(new Song("off", singer, R.raw.alarm01));
        files.add(new Song("on", singer, R.raw.alarm01));
        files.add(new Song("sleep", singer, R.raw.alarm01));
        files.add(new Song("tada", singer, R.raw.alarm01));

        AlarmAdapter adapter = new AlarmAdapter(AlarmListActivity.this, files);
        binding.list.setAdapter(adapter);
        binding.list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Song song1 = files.get(position);

                Intent intent = new Intent(AlarmListActivity.this, PlayingActivity.class);
                intent.putExtra("song title", song1.getSong());
                intent.putExtra("singer name", song1.getSinger());
                intent.putExtra("song resource Id", song1.getSongResourceId());
                startActivity(intent);
            }
        });

    }
}