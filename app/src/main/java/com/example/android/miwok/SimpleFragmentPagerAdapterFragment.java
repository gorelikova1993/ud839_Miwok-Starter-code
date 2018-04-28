package com.example.android.miwok;


import android.app.FragmentManager;
import android.os.Bundle;
import android.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class SimpleFragmentPagerAdapterFragment extends FragmentPagerAdapter {


    public SimpleFragmentPagerAdapterFragment(FragmentManager fm) {
        super(fm);

        public Fragment getItem(int position) {
            if (position == 0) {
                return new FamilyFragment();
            } else if (position == 1){
                return new PhrasesActivity();
            } else {
                return new ColorsFragment();
            }
        }

        @Override
        public int getCount() {
            return 3;
        }
    }




}
