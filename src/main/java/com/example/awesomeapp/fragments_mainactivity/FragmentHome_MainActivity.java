package com.example.awesomeapp.fragments_mainactivity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.awesomeapp.R;

/**
 * Created by minetea on 2017/10/4.
 */

public class FragmentHome_MainActivity extends Fragment
	{
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
		{
		
		View view = inflater.inflate(R.layout.fragment_home,container,false);
		return view;
		}
	
	
	}
