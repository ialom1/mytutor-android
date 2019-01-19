package com.project.mytutor;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by ac on 11/14/2017.
 */

public class SectionPagerAdapterTutor extends FragmentPagerAdapter {
    public SectionPagerAdapterTutor(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                TutorHomeFragment  tutorHomeFragment = new TutorHomeFragment();
                return tutorHomeFragment;
            case 1:
                TutorMessagesFragment tutorMessagesFragment = new TutorMessagesFragment();
                return tutorMessagesFragment;
            case 2:
                TutorRequestsFragment tutorRequestsFragment  = new TutorRequestsFragment();
                return tutorRequestsFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Home";
            case 1:
                return "Messages";
            case 2:
                return "Requests";
            default:
                return null;
        }
    }
}
