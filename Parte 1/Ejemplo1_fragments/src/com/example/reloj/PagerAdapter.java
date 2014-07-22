package com.example.reloj;

import java.util.ArrayList;
import java.util.List;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {
	List<Fragment> fragments = null;
	public PagerAdapter(FragmentManager fm) {
		super(fm);
		fragments = new ArrayList<Fragment>();
		//agregar
		// TODO Auto-generated constructor stub
	}
	
	//agregar metodo
	public void addFragment(Fragment fragment){
		fragments.add(fragment);
	}

	@Override
	public Fragment getItem(int arg0) {
		// TODO Auto-generated method stub
		return fragments.get(arg0);//agregar
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return fragments.size();//agregar
	}

}

