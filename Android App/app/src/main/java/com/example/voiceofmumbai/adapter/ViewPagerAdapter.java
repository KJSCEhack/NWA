package com.example.voiceofmumbai.adapter;

import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentStatePagerAdapter
{

	private final List<Fragment> fragments = new ArrayList<>();
	private final List<String> titles = new ArrayList<>();

	public ViewPagerAdapter(FragmentManager fm)
	{
		super(fm);
	}

	@Override
	public Fragment getItem(int position)
	{
		return fragments.get(position);
	}

	@Override
	public int getCount()
	{
		if (fragments.isEmpty())
		{
			return 0;
		}
		else
		{
			return fragments.size();
		}
	}

	@Nullable
	@Override
	public CharSequence getPageTitle(int position)
	{
		return titles.get(position);
	}

	public void addFragment(Fragment fragment, String title)
	{
		fragments.add(fragment);
		titles.add(title);
	}

	@Override
	public Parcelable saveState()
	{
		return null;
	}
}
