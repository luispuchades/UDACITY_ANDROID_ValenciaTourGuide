package com.example.android.valenciatourguide;

/**
 * Created by luisp on 11/06/2017.
 */

public class Element {

    /* Name of the element */
    private String mElementName;

    /* Description of the element */
    private String mElementDescription;

    /** Constant value that represents no image was provided for this element*/
    private static final int NO_IMAGE_PROVIDED = -1;

    /* Image resource ID for the element */
    private int mElementImageResourceID = NO_IMAGE_PROVIDED;

    /* Rating image ID for the element */
    private int mElementRatingResourceID = NO_IMAGE_PROVIDED;

    /** Constructors creation without image */
    public Element(String elementName, String elementDescription, int elementsRatingResourceID) {
        mElementName = elementName;
        mElementDescription = elementDescription;
        mElementRatingResourceID = elementsRatingResourceID;
    }

    /** Constructors creation with image */
    public Element(String elementName, String elementDescription, int elementsImageResourceID, int elementsRatingResourceID) {
        mElementName = elementName;
        mElementDescription = elementDescription;
        mElementImageResourceID = elementsImageResourceID;
        mElementRatingResourceID = elementsRatingResourceID;
    }

    /* Methods for Element */
    /* ******************* */

    /**
     *  Get the Element name
     */
    public String getElementName(){
        return mElementName;
    }

    /**
     *  Get the Element Description
     */
    public String getElementDescription(){
        return mElementDescription;
    }

    /**
     *  Get the Element image resource ID
     */
    public int getElementImageResourceID() {
        return mElementImageResourceID;
    }

    /**
     * Returns whether or not there is an image for this word
     */
    public boolean hasImage(){
        return mElementImageResourceID != NO_IMAGE_PROVIDED;
    }

    /**
     *  Get the Element rating resource ID
     */
    public int getElementRatingResourceID(){
        return mElementRatingResourceID;
    }

}
