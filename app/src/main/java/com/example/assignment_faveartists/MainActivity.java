package com.example.assignment_faveartists;
// recycler view
// used https://developer.android.com/guide/topics/ui/layout/cardview site for gradle script dependencies
/*
for putting url for imageview, we are importing external library glide dependency https://github.com/bumptech/glide
Glide is a fast and efficient open source media management and image loading framework for Android that wraps media decoding, memory and disk caching, and resource pooling into a simple and easy to use interface.
*/
// for material, use https://material.io/develop/android/docs/getting-started for gradle script dependencies
// give permission to use internet in manifest file

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    RecyclerView Songs;
    private RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // find view by id for all items.
        Songs = findViewById(R.id.Songs);
    }
}