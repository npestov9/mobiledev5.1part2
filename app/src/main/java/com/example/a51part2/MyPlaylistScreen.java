package com.example.a51part2;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MyPlaylistScreen extends AppCompatActivity {

    private ListView playlistView;
    private ArrayList<String> playlistItems; // This could be a list of video titles or URLs

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_playlist);

        playlistView = findViewById(R.id.playlistView);
        playlistItems = new ArrayList<>();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, playlistItems);
        playlistView.setAdapter(adapter);

        // You may want to load existing playlist items from a database or shared preferences
    }
}
