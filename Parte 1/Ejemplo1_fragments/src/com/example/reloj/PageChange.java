package com.example.reloj;

import android.support.v4.view.ViewPager.OnPageChangeListener;

public class PageChange implements OnPageChangeListener {
	int currentIndex = 0;//agregar
	@Override
	public void onPageScrollStateChanged(int arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onPageScrolled(int arg0, float arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onPageSelected(int arg0) {
		currentIndex = arg0; //agregar
		
	}

	
	//agregar
	public int getCurrentIndex() {
		return currentIndex;
	}



}
