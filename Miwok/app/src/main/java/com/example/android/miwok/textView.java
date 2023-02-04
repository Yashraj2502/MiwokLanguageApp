package com.example.android.miwok;

/**
 * {@link textView} represents a single Android platform release.
 * Each object has 3 properties: name, version number, and image resource ID.
 */
public class textView {

    /**
     * Creating a value to set the default value of Resource ID as -1, since no color has a negative value.
     * Indicating it has no color.
     */
    private static final int NO_IMAGE_PROVIDED = -1;
    /**
     * Default translation for the word
     */
    private String mDefaultTranslation;
    /**
     * Miwok translation for the word
     */
    private String mMiwokTranslation;
    /**
     * Drawable resource ID
     */
    private int mImageResourceID = NO_IMAGE_PROVIDED;
    /**
     *
     */
    private int mSoundResourceID;


    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation   is the word in the Miwok language
     */

    public textView(String defaultTranslation, String miwokTranslation, int soundResourceID) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mSoundResourceID = soundResourceID;
    }

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation   is the word in the Miwok language
     * @param imageResourceID    is used for storing the resource ID for the images linked to the words.
     */
    public textView(String defaultTranslation, String miwokTranslation, int imageResourceID, int soundResourceID) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceID = imageResourceID;
        mSoundResourceID = soundResourceID;
    }

    /**
     * Get the default translation of the word.
     *
     * @return the value/word of the english language.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     *
     * @return the value/word of Miwok language.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Get the image resource Id.
     *
     * @return the value of Image Resource ID.
     */
    public int getImageResourceID() {
        return mImageResourceID;
    }

    /**
     *
     */
    public int getSoundResourceID() {
        return mSoundResourceID;
    }

    /**
     * Get the image presence confirmation.
     *
     * @return the boolean value of whether the image is present or not.
     */
    public boolean hasImage() {
        return mImageResourceID != NO_IMAGE_PROVIDED;
    }

    /**
     * Returns the string representation of the {@link textView} object.
     */
    @Override
    public String toString() {
        return "textView{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceID=" + mImageResourceID +
                ", mSoundResourceID=" + mSoundResourceID +
                '}';
    }
}
