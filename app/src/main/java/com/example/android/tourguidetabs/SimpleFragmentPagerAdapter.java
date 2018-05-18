package com.example.android.tourguidetabs;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new AntiqueFragment();
        } else if (position == 1){
            return new AttractionsFragment();
        } else if (position == 2){
            return new NatureFragment();
        } else {
            return new MuseumsFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "Antique";
        } else if (position == 1){
            return "Fun";
        } else if (position == 2){
            return "Nature";
        } else {
            return "Museum";
        }    }
}
