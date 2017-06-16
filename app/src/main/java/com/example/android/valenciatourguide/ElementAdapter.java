package com.example.android.valenciatourguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by luisp on 11/06/2017.
 */

public class ElementAdapter extends ArrayAdapter<Element> {

    /** Resource ID for the backgroung color for this list of words */
    private int mColorResourceID;

    public ElementAdapter(Activity context, ArrayList<Element> elements, int colorResourceID) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, elements);
        mColorResourceID = colorResourceID;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView =
                    LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Get the (@link Element) object located at this position in the list
        Element currentElement = getItem(position);

        // Capture the TextView in the list_item.xml layout with the ID text_view_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.text_view_name);
        // Get the name text from the current Element object and set this text on the
        // text_view_name
        nameTextView.setText(currentElement.getElementName());

        // Capture the TextView in the list_item.xml layout with the ID text_view_description
        TextView descriptionTextView =
                (TextView) listItemView.findViewById(R.id.text_view_description);
        // Get the name text from the current Element object and set this text on the
        // text_view_name
        descriptionTextView.setText(currentElement.getElementDescription());

        // Find the ImageView in the list_item.xml layout with the ID image
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_view_image);
        // Get the iconImage from the current Word object and
        // set this image on the image ImageView
        // imageView.setImageResource(currentWord.getImageResourceID());
        // Return the whole list item layout (containing 2 TextViews and 2 ImageView)
        // so that it can be shown in the ListView

        // Check if an image is provided for this Element or not
        if(currentElement.hasImage()){
            //If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentElement.getElementImageResourceID());
            //Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            //Otherwise hide the ImageView (set visibility to gone)
            imageView.setVisibility(View.GONE);
        }

        // Capture the ImageView containing the rating image
        ImageView ratingView = (ImageView) listItemView.findViewById(R.id.image_view_rating);

        // Set the rating image to the ImageView Layout
        ratingView.setImageResource(currentElement.getElementRatingResourceID());

        // Set the theme color for the list item
        // Capture the text_container Linear Layout
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceID);
        // Set the text background color for the text container view
        textContainer.setBackgroundColor(color);

        return listItemView;
    }

}
