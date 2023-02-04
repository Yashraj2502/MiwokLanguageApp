package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPage =(ViewPager) findViewById(R.id.viewPager);
        // Create an adapter that knows which fragment should be shown on each page
//        simpleFragmentPagerAdapter adapter = new simpleFragmentPagerAdapter(getSupportFragmentManager(), MainActivity.this);
        simpleFragmentPagerAdapter adapter = new simpleFragmentPagerAdapter(this, getSupportFragmentManager());
        // Set the adapter onto the view pager
        viewPage.setAdapter(adapter);

        // Give the TabLayout the ViewPager
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPage);

        // Find the textView that shows the number category
        TextView numbers = (TextView) findViewById(R.id.numbers);

        // Set a click listener on that view
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numberIntent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numberIntent);
//                startActivity(new Intent(MainActivity.this, NumbersActivity.class));
            }
        });


        // Find the textView that shows the number category
        TextView family = (TextView) findViewById(R.id.family);

        // Set a click listener on that view
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(familyIntent);
//                startActivity(new Intent(MainActivity.this, NumbersActivity.class));
            }
        });


        // Find the textView that shows the number category
        TextView colour = (TextView) findViewById(R.id.colors);

        // Set a click listener on that view
        colour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent colourIntent = new Intent(MainActivity.this, ColorActivity.class);
                startActivity(colourIntent);
//                startActivity(new Intent(MainActivity.this, NumbersActivity.class));
            }
        });


        // Find the textView that shows the number category
        TextView phrase = (TextView) findViewById(R.id.phrases);

        // Set a click listener on that view
        phrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phraseIntent = new Intent(MainActivity.this, PhraseActivity.class);
                startActivity(phraseIntent);
//                startActivity(new Intent(MainActivity.this, NumbersActivity.class));
            }
        });
    }

//    public void openNumbersList(View view){
//        Intent i = new Intent(this, NumbersActivity.class);
//        startActivity(i);
//    }

//    public void openFamilyMemberList(View view){
//        Intent i = new Intent(this, FamilyActivity.class);
//        startActivity(i);
//    }
//
//    public void openColorList(View view){
//        Intent i = new Intent(this, ColorActivity.class);
//        startActivity(i);
//    }
//
//    public void openPhrasesList(View view){
//        Intent i = new Intent(this, PhraseActivity.class);
//        startActivity(i);
//    }
}