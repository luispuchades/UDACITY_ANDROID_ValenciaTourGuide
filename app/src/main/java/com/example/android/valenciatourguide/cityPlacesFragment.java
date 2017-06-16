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
public class cityPlacesFragment extends Fragment {


    public cityPlacesFragment() {
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
        elements.add(new Element(getString(R.string.cityPlacesName1),
                getString(R.string.cityPlacesDescription1),
                R.drawable.town_hall_square, R.drawable.ic_sentiment_very_satisfied));
        elements.add(new Element(getString(R.string.cityPlacesName2),
                getString(R.string.cityPlacesDescription2),
                R.drawable.queens_square, R.drawable.ic_sentiment_very_satisfied));
        elements.add(new Element(getString(R.string.cityPlacesName3),
                getString(R.string.cityPlacesDescription3),
                R.drawable.central_market, R.drawable.ic_sentiment_very_satisfied));
        elements.add(new Element(getString(R.string.cityPlacesName4),
                getString(R.string.cityPlacesDescription4),
                R.drawable.turia_gardens, R.drawable.ic_sentiment_very_satisfied));
        elements.add(new Element(getString(R.string.cityPlacesName5),
                getString(R.string.cityPlacesDescription5),
                R.drawable.malvarrosa_beach_240, R.drawable.ic_sentiment_very_satisfied));
        elements.add(new Element(getString(R.string.cityPlacesName6),
                getString(R.string.cityPlacesDescription6),
                R.drawable.gullivers_park, R.drawable.ic_sentiment_satisfied));
        elements.add(new Element(getString(R.string.cityPlacesName7),
                getString(R.string.cityPlacesDescription7),
                R.drawable.real_gardens, R.drawable.ic_sentiment_satisfied));
        elements.add(new Element(getString(R.string.cityPlacesName8),
                getString(R.string.cityPlacesDescription8),
                R.drawable.bioparc_zoo, R.drawable.ic_sentiment_satisfied));
        elements.add(new Element(getString(R.string.cityPlacesName9),
                getString(R.string.cityPlacesDescription9),
                R.drawable.colon_market, R.drawable.ic_sentiment_neutral));
        elements.add(new Element(getString(R.string.cityPlacesName10),
                getString(R.string.cityPlacesDescription10),
                R.drawable.monforte_gardens, R.drawable.ic_sentiment_neutral));

        ElementAdapter adapter =
                new ElementAdapter(getActivity(), elements, R.color.category_cityPlaces);

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
