package com.qd.weban.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.qd.weban.R;

/**
 * 
 * @author wangyuexing
 * 
 * @des 闪开 我要开发了。
 * 
 * @since 2016-05-15
 *
 */
public class FragmentA extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_a, null);
		
		return view;
	}

	
}
