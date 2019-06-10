package com.example.android.tourguideapp;

public class Subjects {
    private String mPlace;
    private String mDescription;
    private String mLocation;
    private String mHours;
    private int mImageResourceId;

    public Subjects(String place, String description, String location, String hours, int imageResourceId) {
        mPlace = place;
        mDescription = description;
        mLocation = location;
        mHours = hours;
        mImageResourceId = imageResourceId;
    }

    public String getPlace() {
        return mPlace;
    }

    public String getDescription(){
        return mDescription;
    }

    public String getLocation() {
        return mLocation;
    }

    public String getHours() {
        return mHours;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**Code attributed to Lara Martin**/
    /**https://github.com/laramartin/android_tokyo_guide/blob/master/app/src/main/java/eu/laramartin/tokyoguide/Location.java**/
    @Override
    public String toString() {
        String output = getPlace() + "\n" +
                getDescription() + "\n" +
                getLocation() + "\n" +
                getHours() + "\n" +
                getImageResourceId();
        return output;
    }
}
