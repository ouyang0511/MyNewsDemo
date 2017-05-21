package com.example.adward.mynewsdemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

/**
 * Created by Adward on 2017/5/20.
 */

public class MypageAdapter extends FragmentPagerAdapter {
    private ArrayList<NewsFragment> mFragmentArrayList;
    private ArrayList<String> mTitleList;


    public MypageAdapter(FragmentManager fm, ArrayList<NewsFragment> fragmentArrayList, ArrayList<String> mTitleList) {
        super(fm);
        this.mFragmentArrayList = fragmentArrayList;
        this.mTitleList = mTitleList;
    }

    @Override
    public Fragment getItem(int position) {
        if (position < mFragmentArrayList.size()) {
            return mFragmentArrayList.get(position);
        }
        return null;
    }

    @Override
    public int getCount() {
        if (mFragmentArrayList == null) {
            return 0;
        }
        return mFragmentArrayList.size();
    }


    public CharSequence getPageTitle(int position) {
        if (mTitleList != null && position < mTitleList.size()) {
            return mTitleList.get(position);
        }

        return "notitle";
    }

}