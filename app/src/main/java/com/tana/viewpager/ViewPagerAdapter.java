package com.tana.viewpager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    private int mNumOfPages;
    public ViewPagerAdapter(@NonNull FragmentManager fm, int numOfPages) {
        super(fm);
        mNumOfPages = numOfPages;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return  new ChatsFragment();
            case 1:
                return new StatusFragment();
            case 2:
                return new CallsFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfPages;
    }
}
