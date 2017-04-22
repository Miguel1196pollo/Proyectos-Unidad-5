package mx.edu.utng.seccion_07_toolbar_tabs.Adapters;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import mx.edu.utng.seccion_07_toolbar_tabs.Fragments.FirstFragment;
import mx.edu.utng.seccion_07_toolbar_tabs.Fragments.SecondFragment;
import mx.edu.utng.seccion_07_toolbar_tabs.Fragments.ThirdFragment;

/**
 * Created by Toshiba on 14/04/2017.
 */
public class PagerAdapter extends FragmentStatePagerAdapter {

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
