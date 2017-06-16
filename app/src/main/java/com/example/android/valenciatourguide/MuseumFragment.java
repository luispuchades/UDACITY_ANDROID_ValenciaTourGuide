package com.example.android.valenciatourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MuseumFragment extends Fragment {


    public MuseumFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //Inflate ListView defined in despription_list.xml
        View rootView = inflater.inflate(R.layout.description_list, container, false);

        // Declare an ArrayList for Elements
        final ArrayList<Element> elements = new ArrayList<Element>();

        // Modify Element into the ArrayList Element
        elements.add(new Element(getString(R.string.museumName1),
                getString(R.string.museumDescription1),
                R.drawable.museum_science, R.drawable.ic_sentiment_very_satisfied));
        elements.add(new Element(getString(R.string.museumName2),
                getString(R.string.cityPlacesDescription2),
                R.drawable.museum_arts, R.drawable.ic_sentiment_very_satisfied));
        elements.add(new Element(getString(R.string.museumName3),
                getString(R.string.museumDescription3),
                R.drawable.museum_fallas, R.drawable.ic_sentiment_very_satisfied));
        elements.add(new Element(getString(R.string.museumName4),
                getString(R.string.museumName4),
                R.drawable.museum_prehistoric, R.drawable.ic_sentiment_very_satisfied));
        elements.add(new Element(getString(R.string.museumName5),
                getString(R.string.museumDescription5),
                R.drawable.museum_etnology, R.drawable.ic_sentiment_very_satisfied));
        elements.add(new Element(getString(R.string.museumName6),
                getString(R.string.museumDescription6),
                R.drawable.museum_modernity, R.drawable.ic_sentiment_satisfied));
        elements.add(new Element(getString(R.string.museumName7),
                getString(R.string.museumDescription7),
                R.drawable.museum_ceramics, R.drawable.ic_sentiment_satisfied));


        ElementAdapter adapter =
                new ElementAdapter(getActivity(), elements, R.color.category_museums);

        // Capture the object list within the description_list.xml file
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);

        // return is final sentence from the rootView inflater
        return rootView;
    }

}
