package com.nanddgroup.itea_app;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nikita on 17.01.2017.
 */

public class TabsAdapter extends FragmentStatePagerAdapter {

    public static final int FRAGMENT_COUNT = 2;
    private final String[] tabNames;
    //integer to count number of tabs
    private final List<Fragment> fragments = new ArrayList<>();

    public TabsAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.tabNames = context.getResources().getStringArray(R.array.dialog_tab_names);
        //Initializing tab count
        fragments.add(new TestFragment());
        fragments.add(new TestFragment());

    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabNames[position];
    }

    @Override
    public Fragment getItem(int position) {
        //Returning the current tabs
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return FRAGMENT_COUNT;
    }
}