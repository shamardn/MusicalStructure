package com.example.musicalstructure;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class AlarmAdapter extends ArrayAdapter<Song> {

    public AlarmAdapter(Activity context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Song currentSong = getItem(position);

        TextView songName = (TextView) listItemView.findViewById(R.id.song_title);
        songName.setText(currentSong.getSong());

        TextView singerName = (TextView) listItemView.findViewById(R.id.singer_name);
        singerName.setText(currentSong.getSinger());

        return listItemView;
    }
}