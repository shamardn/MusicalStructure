package com.example.musicalstructure;

public class Song {
    private String mSong ;
    private String mSinger ;
    private int mSongResourceId ;

    public Song(String song, String singer, int songResourceId){
        mSong = song ;
        mSinger = singer ;
        mSongResourceId = songResourceId ;
    }

    public String getSong(){
        return mSong;
    }

    public String getSinger(){
        return mSinger;
    }

    public int getSongResourceId(){
        return mSongResourceId ;
    }

}
