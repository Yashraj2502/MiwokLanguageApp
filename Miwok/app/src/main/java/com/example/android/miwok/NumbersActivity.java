package com.example.android.miwok;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

/**
 * {@link NumbersActivity} shows a list of Android platform releases.
 * For each release, display the name, version number, and image.
 */
public class NumbersActivity extends AppCompatActivity {

//    /**
//     * Handles playback of all the sound files
//     */
//    private MediaPlayer mediaPlayer;
//
//    /**
//     * Handles audio focus when playing a sound file
//     */
//    private AudioManager mAudioManager;
//
////    new MediaPlayer.OnCompletionListener() {
////        public void onCompletion(MediaPlayer mediaPlayer) {
////            releaseMediaPlayer();
////        }
////    }
//    /**
//     * This listener gets triggered whenever the audio focus changes
//     * (i.e., we gain or lose audio focus because of another app or device).
//     */
//    private AudioManager.OnAudioFocusChangeListener mOnAudioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() {
//        @Override
//        public void onAudioFocusChange(int focusChange) {
//            if (focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT ||
//                    focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK) {
//                // The AUDIOFOCUS_LOSS_TRANSIENT case means that we've lost audio focus for a
//                // short amount of time. The AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK case means that
//                // our app is allowed to continue playing sound but at a lower volume. We'll treat
//                // both cases the same way because our app is playing short sound files.
//
//                // Pause playback and reset player to the start of the file. That way, we can
//                // play the word from the beginning when we resume playback.
//                mediaPlayer.pause();
//                mediaPlayer.seekTo(0);
//            } else if (focusChange == AudioManager.AUDIOFOCUS_GAIN) {
//                // The AUDIOFOCUS_GAIN case means we have regained focus and can resume playback.
//                mediaPlayer.start();
//            } else if (focusChange == AudioManager.AUDIOFOCUS_LOSS) {
//                // The AUDIOFOCUS_LOSS case means we've lost audio focus and
//                // Stop playback and clean up resources
//                releaseMediaPlayer();
//            }
//        }
//    };
//    /**
//     * This listener gets triggered when the {@link MediaPlayer} has completed
//     * playing the audio file.
//     */
//    private MediaPlayer.OnCompletionListener completionListener = new MediaPlayer.OnCompletionListener() {
//        @Override
//        public void onCompletion(MediaPlayer mediaPlayer) {
//
//            releaseMediaPlayer();
//        }
//    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.word_list);
//
//        // Create and setup the {@link AudioManager} to request audio focus
//        mAudioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
//
////        String[] num = new String[10];
////        num[0] = "One";
////        num[1] = "Two";
////        num[2] = "Three";
////        num[3] = "Four";
////        num[4] = "Five";
////        num[5] = "Six";
////        num[6] = "Seven";
////        num[7] = "Eight";
////        num[8] = "Nine";
////        num[9] = "Ten";
////
////        Log.v("NumbersActivity", "Word at index 0: " + num[0] );
////        Log.v("NumbersActivity", "Word at index 1: " + num[1] );
////        Log.v("NumbersActivity", "Word at index 2: " + num[2] );
////        Log.v("NumbersActivity", "Word at index 3: " + num[3] );
////        Log.v("NumbersActivity", "Word at index 4: " + num[4] );
////        Log.v("NumbersActivity", "Word at index 5: " + num[5] );
////        Log.v("NumbersActivity", "Word at index 6: " + num[6] );
////        Log.v("NumbersActivity", "Word at index 7: " + num[7] );
////        Log.v("NumbersActivity", "Word at index 8: " + num[8] );
////        Log.v("NumbersActivity", "Word at index 9: " + num[9] );
//
//
////        num.add("One");
////        num.add("Two");
////        num.add("Three");
////        num.add("Four");
////        num.add("Five");
////        num.add("Six");
////        num.add("Seven");
////        num.add("Eight");
////        num.add("Nine");
////        num.add("Ten");
////        ArrayList<textView> num = new ArrayList<textView>();
////        num.add(new textView("One", "Lutti", R.drawable.number_one));
////        num.add(new textView("Two", "Otiiko", R.drawable.number_two));
////        num.add(new textView("Three", "Tolookosu", R.drawable.number_three));
////        num.add(new textView("Four", "Oyyisa", R.drawable.number_four));
////        num.add(new textView("Five", "Massokka", R.drawable.number_five));
////        num.add(new textView("Six", "Temmokka", R.drawable.number_six));
////        num.add(new textView("Seven", "Kenekaku", R.drawable.number_seven));
////        num.add(new textView("Eight", "Kawinta", R.drawable.number_eight));
////        num.add(new textView("Nine", "Wo'e", R.drawable.number_nine));
////        num.add(new textView("Ten", "Na'aacha", R.drawable.number_ten));
//
//
//        final ArrayList<textView> num = new ArrayList<textView>();
//        num.add(new textView("One", "Lutti", R.drawable.number_one, R.raw.number_one));
//        num.add(new textView("Two", "Otiiko", R.drawable.number_two, R.raw.number_two));
//        num.add(new textView("Three", "Tolookosu", R.drawable.number_three, R.raw.number_three));
//        num.add(new textView("Four", "Oyyisa", R.drawable.number_four, R.raw.number_four));
//        num.add(new textView("Five", "Massokka", R.drawable.number_five, R.raw.number_five));
//        num.add(new textView("Six", "Temmokka", R.drawable.number_six, R.raw.number_six));
//        num.add(new textView("Seven", "Kenekaku", R.drawable.number_seven, R.raw.number_seven));
//        num.add(new textView("Eight", "Kawinta", R.drawable.number_eight, R.raw.number_eight));
//        num.add(new textView("Nine", "Wo'e", R.drawable.number_nine, R.raw.number_nine));
//        num.add(new textView("Ten", "Na'aacha", R.drawable.number_ten, R.raw.number_ten));
//
//
////        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);
////        for (int i = 0; i < 10; i++) {
////            TextView numbersView = new TextView(this);
////            numbersView.setText(num.get(i));
////            rootView.addView(numbersView);
////        }
//
////        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, num);
//        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
//        // adapter knows how to create list items for each item in the list.
//        wordAdapter numAdapter = new wordAdapter(this, num, R.color.categoryNumbers);
//
//        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
//        // There should be a {@link ListView} with the view ID called list, which is declared in the
//        // word_list.xml layout file.
//        ListView listView = (ListView) findViewById(R.id.list);
//        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
//        // {@link ListView} will display list items for each {@link Word} in the list.
//        listView.setAdapter(numAdapter);
//
////        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
////            @Override
////            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
////                releaseMediaPlayer();
////                textView word = num.get(i);
////                mediaPlayer = MediaPlayer.create(NumbersActivity.this, word.getSoundResourceID());
////                mediaPlayer.start();
////                mediaPlayer.setOnCompletionListener(completionListener);
////            }
////        });
//
//        // Set a click listener to play the audio when the list item is clicked on
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
//                // Release the media player if it currently exists because we are about to
//                // play a different sound file
//                releaseMediaPlayer();
//
//                // Get the {@link Word} object at the given position the user clicked on
//                textView word = num.get(position);
//
//                // Request audio focus so in order to play the audio file. The app needs to play a
//                // short audio file, so we will request audio focus with a short amount of time
//                // with AUDIOFOCUS_GAIN_TRANSIENT.
//                int result = mAudioManager.requestAudioFocus(mOnAudioFocusChangeListener,
//                        AudioManager.STREAM_MUSIC, AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);
//
//                if (result == AudioManager.AUDIOFOCUS_REQUEST_GRANTED) {
//                    // We have audio focus now.
//
//                    // Create and setup the {@link MediaPlayer} for the audio resource associated
//                    // with the current word
//                    mediaPlayer = MediaPlayer.create(NumbersActivity.this, word.getSoundResourceID());
//
//                    // Start the audio file
//                    mediaPlayer.start();
//
//                    // Setup a listener on the media player, so that we can stop and release the
//                    // media player once the sound has finished playing.
//                    mediaPlayer.setOnCompletionListener(completionListener);
//                }
//            }
//        });

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new NumberFragment()).commit();
    }
//
//    /**
//     * Clean up the media player by releasing its resources.
//     */
//    private void releaseMediaPlayer() {
//        // If the media player is not null, then it may be currently playing a sound.
//        if (mediaPlayer != null) {
//            // Regardless of the current state of the media player, release its resources
//            // because we no longer need it.
//            mediaPlayer.release();
//
//            // Set the media player back to null. For our code, we've decided that
//            // setting the media player to null is an easy way to tell that the media player
//            // is not configured to play an audio file at the moment.
//            mediaPlayer = null;
//
//            // Regardless of whether or not we were granted audio focus, abandon it. This also
//            // unregisters the AudioFocusChangeListener so we don't get anymore callbacks.
//            mAudioManager.abandonAudioFocus(mOnAudioFocusChangeListener);
//        }
//    }
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//        // When the activity is stopped, release the media player resources because we won't
//        // be playing any more sounds.
//        releaseMediaPlayer();
//    }
}
