package com.example.android.valenciatourguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by luisp on 10/06/2017.
 */

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    public SimpleFragmentPagerAdapter (FragmentManager fm) {
        super(fm);
    }

    // Definition of constat for total number of pages
    final int PAGE_COUNT = 4;

    // Definition of Tab Tittles
    private String tabTitles[] = new String[] {
            "City Places", "Museums", "Monuments", "Stamina"
    };

    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new cityPlacesFragment();
        } else if (position == 1) {
            return new MuseumFragment();
        } else if (position == 2) {
            return new MonumentsFragment();
        } else {
            return new StaminaFragment();
        }
    }

    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}
