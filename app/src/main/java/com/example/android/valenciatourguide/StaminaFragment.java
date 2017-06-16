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
public class StaminaFragment extends Fragment {


    public StaminaFragment() {
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
        elements.add(new Element(getString(R.string.staminaName1),
                getString(R.string.staminaDescription1), R.drawable.ic_sentiment_very_satisfied));
        elements.add(new Element(getString(R.string.staminaName2),
                getString(R.string.staminaDescription2),
                 R.drawable.ic_sentiment_very_satisfied));
        elements.add(new Element(getString(R.string.staminaName3),
                getString(R.string.staminaDescription3), R.drawable.ic_sentiment_very_satisfied));
        elements.add(new Element(getString(R.string.staminaName4),
                getString(R.string.staminaDescription4), R.drawable.ic_sentiment_very_satisfied));
        elements.add(new Element(getString(R.string.staminaName5),
                getString(R.string.staminaDescription5), R.drawable.ic_sentiment_very_satisfied));
        elements.add(new Element(getString(R.string.staminaName6),
                getString(R.string.staminaDescription6), R.drawable.ic_sentiment_satisfied));
        elements.add(new Element(getString(R.string.staminaName7),
                getString(R.string.staminaDescription7), R.drawable.ic_sentiment_satisfied));
        elements.add(new Element(getString(R.string.staminaName8),
                getString(R.string.staminaDescription8), R.drawable.ic_sentiment_satisfied));
        elements.add(new Element(getString(R.string.staminaName9),
                getString(R.string.staminaDescription9), R.drawable.ic_sentiment_neutral));
        elements.add(new Element(getString(R.string.staminaName10),
                getString(R.string.staminaDescription10), R.drawable.ic_sentiment_neutral));

        ElementAdapter adapter =
                new ElementAdapter(getActivity(), elements, R.color.category_stamina);

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
