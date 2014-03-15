package com.schrws.kakaotalkbackup;

import com.schrws.kakaotalkbackup.backup.*;
import com.schrws.kakaotalkbackup.restore.*;
import com.schrws.kakaotalkbackup.developer.*;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {
	Context mContext;

	public SectionsPagerAdapter(Context context, FragmentManager fm) {
		super(fm);
		mContext = context;
	}

	@Override
	public Fragment getItem(int position) {
		// getItem is called to instantiate the fragment for the given page.
		// Return a DummySectionFragment (defined as a static inner class
		// below) with the page number as its lone argument.
		switch(position) {
		case 0:
			return new BackUp(mContext);
		case 1:
			return new Restore(mContext);
		case 2:
			return new Developer(mContext);
		}
		return null;
	}

	@Override
	public int getCount() {
		// Show 3 total pages.
		return 3;
	}
	
	@Override
	public CharSequence getPageTitle(int position) {
		// TODO Auto-generated method stub
		switch (position) {
		case 0:
			return mContext.getString(R.string.title_section1).toUpperCase();
		case 1:
			return mContext.getString(R.string.title_section2).toUpperCase();
		case 2:
			return mContext.getString(R.string.title_section3).toUpperCase();
		}
		return null;
	}

}
