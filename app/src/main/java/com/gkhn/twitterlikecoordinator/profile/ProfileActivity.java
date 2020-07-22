package com.gkhn.twitterlikecoordinator.profile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


import com.gkhn.twitterlikecoordinator.R;
import com.google.android.material.appbar.AppBarLayout;

public class ProfileActivity extends AppCompatActivity {


    // Palette API examples for toolbars color
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Toolbar toolbar = findViewById(R.id.profile_appbar_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        final ImageView imageView = findViewById(R.id.profile_appbar_collapsing_image);
        AppBarLayout appbarLayout = (AppBarLayout) findViewById(R.id.profile_appbar);

    }
}