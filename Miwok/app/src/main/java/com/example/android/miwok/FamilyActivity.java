package com.example.android.miwok;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

/**
 * {@link FamilyActivity} shows a list of Android platform releases.
 * For each release, display the name, version number, and image.
 */
public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new FamilyFragment()).commit();
    }


}