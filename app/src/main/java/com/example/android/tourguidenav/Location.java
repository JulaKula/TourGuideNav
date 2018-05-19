package com.example.android.tourguidenav;

public class Location {

    private int mNameResId;

    private int mDescriptionId;

    private int mPhotoResId;

    public Location(int nameId, int descriptionId) {
        mNameResId = nameId;
        mDescriptionId = descriptionId;
    }

    public Location(int photoId, int nameId, int descriptionId) {
        mNameResId = nameId;
        mPhotoResId = photoId;
        mDescriptionId = descriptionId;
    }

    public int getName() {
        return mNameResId;
    }

    public int getDescription() {
        return mDescriptionId;
    }

    public int getPhoto() {
        return mPhotoResId;
    }
}
