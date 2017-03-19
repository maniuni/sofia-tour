package com.example.android.sofiatour;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * An adapter for the fragments that specifies
 * how many fragments there are and their names.
 */
public class CategoryAdapter extends FragmentPagerAdapter {

    Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0){
            return new ParksFragment();
        }
        else if(position == 1) {
            return new PastriesFragment();
        }
        else if(position == 2){
            return new LandmarksFragment();
        }
        else {
            return new TheatersFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        switch (position){
            case 0:
                return mContext.getString(R.string.category_parks);
            case 1:
                return mContext.getString(R.string.category_pastryShops);
            case 2:
                return mContext.getString(R.string.category_landmarks);
            default:
                return mContext.getString(R.string.category_theaters);
        }
    }
}
