package com.esprit.insta360.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.esprit.insta360.Fragments.HomeFragment;
import com.esprit.insta360.Fragments.NotificationsFragment;
import com.esprit.insta360.Fragments.ProfileFragment;
import com.esprit.insta360.Fragments.SearchFragment;
import com.esprit.insta360.Fragments.UploadFragment;
import com.esprit.insta360.R;
import com.esprit.insta360.Utils.ViewPagerAdapter;

public class MainActivity extends AppCompatActivity {


    private ViewPagerAdapter mViewPagerAdapter;

    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mViewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        mViewPagerAdapter.addFragments(new HomeFragment());
        mViewPagerAdapter.addFragments(new SearchFragment());
        mViewPagerAdapter.addFragments(new UploadFragment());
        mViewPagerAdapter.addFragments(new NotificationsFragment());
        mViewPagerAdapter.addFragments(new ProfileFragment());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mViewPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_home);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_search);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_upload);
        tabLayout.getTabAt(3).setIcon(R.drawable.ic_notifications);
        tabLayout.getTabAt(4).setIcon(R.drawable.ic_profile);

        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });
    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public void onResume() {
        super.onResume();

    }


}
