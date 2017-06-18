package com.example.android.valenciatourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by luisp on 10/06/2017.
 */

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    //Context of the app
    private Context mContext;

    public SimpleFragmentPagerAdapter (Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    // Definition of constat for total number of pages
    final int PAGE_COUNT = 4;


    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new cityPlacesFragment();
            case 1:
                return new MuseumFragment();
            case 2:
                return new MonumentsFragment();
            case 3:
                return new StaminaFragment();
            default:
                return new cityPlacesFragment();
        }
    }

    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        switch (position) {
            case 0:
                return mContext.getString(R.string.cityPlacesTab);
            case 1:
                return mContext.getString(R.string.museumsTab);
            case 2:
                return mContext.getString(R.string.monumentsTab);
            case 3:
                return mContext.getString(R.string.staminaTab);
            default:
                return mContext.getString(R.string.defaultTab);
        }
    }
}
