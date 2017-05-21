package com.example.adward.mynewsdemo;

import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentActivity;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends FragmentActivity {
    private TabLayout mTablayout;
    private ViewPager mViewPager;
    private MypageAdapter mypageAdapter;
    private ArrayList<NewsFragment> mFragmentArrayList = new ArrayList<NewsFragment>();
    private ArrayList<String> mTitleList = new ArrayList<String>();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //插入Fragment列表
        initFragmentArrayList();
        //设置title列表
        initTitleList();
        mTablayout= (TabLayout) findViewById(R.id.sliding_tabs);
       //初始化控件
        mViewPager = (ViewPager) findViewById(R.id.viewpager);
        //定义适配器实例
        mypageAdapter = new MypageAdapter(getSupportFragmentManager(),mFragmentArrayList,mTitleList);
        //设置适配器
        mViewPager.setAdapter(mypageAdapter);
        //
        mTablayout.setupWithViewPager(mViewPager);
    }

    private void initTitleList() {
        mTitleList.add("头条");
        mTitleList.add("娱乐");
        mTitleList.add("体育");
        mTitleList.add("科技");

    }

    private void initFragmentArrayList() {
        NewsFragment fa = new NewsFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("NEWSTYPE",1);
        fa.setArguments(bundle);

        NewsFragment fb = new NewsFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putInt("NEWSTYPE", 2);
        fb.setArguments(bundle2);

        NewsFragment fc = new NewsFragment();
        Bundle bundle3 = new Bundle();
        bundle3.putInt("NEWSTYPE", 3);
        fc.setArguments(bundle3);

        NewsFragment fd = new NewsFragment();
        Bundle bundle4 = new Bundle();
        bundle4.putInt("NEWSTYPE", 4);
        fd.setArguments(bundle4);


        mFragmentArrayList.add(fa);
        mFragmentArrayList.add(fb);
        mFragmentArrayList.add(fc);
        mFragmentArrayList.add(fd);
    }
}
