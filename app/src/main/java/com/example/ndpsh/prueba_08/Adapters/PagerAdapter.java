package com.example.ndpsh.prueba_08.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.ndpsh.prueba_08.Fragments.FirstFragment;
import com.example.ndpsh.prueba_08.Fragments.SecondFragment;
import com.example.ndpsh.prueba_08.Fragments.ThirdFragment;

public class PagerAdapter extends FragmentPagerAdapter {

    private int numberOfTabs;


    public PagerAdapter(FragmentManager fm, int numberOfTabs) {
        super(fm);
        this.numberOfTabs = numberOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return new FirstFragment();
            case 1:
                return new SecondFragment();
            case 2:
                return new ThirdFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numberOfTabs;
    }
}
