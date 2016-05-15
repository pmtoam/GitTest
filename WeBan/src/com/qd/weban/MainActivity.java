package com.qd.weban;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import com.qd.weban.fragments.FragmentA;
import com.qd.weban.fragments.FragmentB;
import com.qd.weban.fragments.FragmentC;

// 注意：继承 FragmentActivity
public class MainActivity extends FragmentActivity {

	ViewPager viewPager;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// 1.
		viewPager = (ViewPager) findViewById(R.id.viewPager);

		// 5. 准备fragment
		List<Fragment> fragments = new ArrayList<Fragment>();
		// 5.1
		fragments.add(new FragmentA());
		fragments.add(new FragmentB());
		fragments.add(new FragmentC());

		// 4.
		android.support.v4.app.FragmentManager fm = getSupportFragmentManager();

		// 3.
		MyAdapter adapter = new MyAdapter(fm, fragments);

		// 2.
		viewPager.setAdapter(adapter);
		
//		viewPager.setCurrentItem(1);
        
        // test git.

	}

	class MyAdapter extends FragmentPagerAdapter {

		private List<Fragment> fragments;

		public MyAdapter(FragmentManager fm, List<Fragment> fragments) {
			super(fm);
			this.fragments = fragments;
		}

		@Override
		public Fragment getItem(int arg0) {
			return fragments.get(arg0);
		}

		@Override
		public int getCount() {
			return fragments.size();
		}

	}
}
