package com.example.reloj;

import android.os.Bundle;
import android.graphics.Color;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends FragmentActivity {
	    
		ViewPager pager = null;
		PageChange pageChangeListener = null;
		
		/** Called when the activity is first created. */
	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.main);
	        pager = (ViewPager) findViewById(R.id.pager);
	        
	        PagerAdapter adapter = 
	        		new PagerAdapter(getSupportFragmentManager());
	        adapter.addFragment(PlainColor.newInstance(Color.RED));
	        adapter.addFragment(PlainColor.newInstance(Color.GREEN));
	        adapter.addFragment(PlainColor.newInstance(Color.BLUE));
	        pageChangeListener = new PageChange();
	        pager.setOnPageChangeListener(pageChangeListener);
	        pager.setPageTransformer(true, new PageTransformer());
	        pager.setAdapter(adapter);
	    }
	    
	  @Override
		public boolean onCreateOptionsMenu(Menu menu) {
			MenuInflater inflater = new MenuInflater(this);
			inflater.inflate(R.menu.main, menu);
			return super.onCreateOptionsMenu(menu);
		}

		@Override
		public boolean onOptionsItemSelected(MenuItem item) {
			switch(item.getItemId()){
				case R.id.action_settings:
					startAnimationOnCurrentPage();
				default:
					return super.onOptionsItemSelected(item);
			}
		}
	    
		private void startAnimationOnCurrentPage(){
	    PagerAdapter adapter =  
	        (PagerAdapter) pager.getAdapter();
	    PlainColor fragment = 
	        (PlainColor) adapter.getItem(pageChangeListener.getCurrentIndex());
	    fragment.startAnimationOnClock();
	  }
	    
	}
