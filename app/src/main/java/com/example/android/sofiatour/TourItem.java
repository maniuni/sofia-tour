package com.example.android.sofiatour;

/**
 * com.example.android.sofiatour.TourItem represents the information for one place of interest in Sofia
 * It contains a picture of the place and its name
 */
public class TourItem {

    /** Image resource Id for the image associated with the item */
    private int imageResourceId;

    /** String resource Id for the name of the item */
    private int defaultStringId;

    /** Create a new com.example.android.sofiatour.TourItem object instance.
     * @param defaultStringId is Id for the default translation for the name of the item
     * @param imageResourceId is the Id for the image associated with the item
     */
    public TourItem(int imageResourceId, int defaultStringId){
        this.imageResourceId = imageResourceId;
        this.defaultStringId = defaultStringId;
    }

    /** Gets the Id for the default translation for the name of the item */
    public int getDefaultStringId() {
        return defaultStringId;
    }

    /** Gets the Id for the image associated with the item */
    public int getImageResourceId() {
        return imageResourceId;
    }
}
