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
public class MonumentsFragment extends Fragment {


    public MonumentsFragment() {
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
        elements.add(new Element(getString(R.string.monumentsName1),
                getString(R.string.monumentsDescription1),
                R.drawable.monuments_miguelete, R.drawable.ic_sentiment_very_satisfied));
        elements.add(new Element(getString(R.string.monumentsName2),
                getString(R.string.monumentsDescription2),
                R.drawable.monuments_torres_serrano, R.drawable.ic_sentiment_very_satisfied));
        elements.add(new Element(getString(R.string.monumentsName3),
                getString(R.string.monumentsDescription3),
                R.drawable.monuments_torres_quart, R.drawable.ic_sentiment_very_satisfied));
        elements.add(new Element(getString(R.string.monumentsName4),
                getString(R.string.monumentsDescription4),
                R.drawable.monuments_santacatalina_church,
                R.drawable.ic_sentiment_very_satisfied));
        elements.add(new Element(getString(R.string.monumentsName5),
                getString(R.string.monumentsDescription5),
                R.drawable.monuments_palau_generalitat, R.drawable.ic_sentiment_very_satisfied));
        elements.add(new Element(getString(R.string.monumentsName6),
                getString(R.string.monumentsDescription6),
                R.drawable.monuments_catedral_west, R.drawable.ic_sentiment_satisfied));
        elements.add(new Element(getString(R.string.monumentsName7),
                getString(R.string.monumentsDescription7),
                R.drawable.monuments_basilica_virgen, R.drawable.ic_sentiment_satisfied));


        ElementAdapter adapter =
                new ElementAdapter(getActivity(), elements, R.color.category_monuments);

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
