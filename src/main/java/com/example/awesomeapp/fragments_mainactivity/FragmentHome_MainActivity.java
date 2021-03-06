package com.example.awesomeapp.fragments_mainactivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.awesomeapp.R;
import com.example.awesomeapp.SubjectActivity;
import com.example.awesomeapp.banner.GlideImageLoader;
import com.youth.banner.Banner;

import java.util.Arrays;
import java.util.List;

/**
 * Created by minetea on 2017/10/4.
 */

public class FragmentHome_MainActivity extends Fragment
	{
	
	//获取各个控件
	private Button button_chinese;
	private Button button_maths;
	private Button button_english;
	private Button button_physics;
	private Button button_chemisty;
	private Button button_biology;
	private Button button_politics;
	private Button button_history;
	private Button button_geography;
	
	private Banner banner_Home;
	
	private static Bundle bundle;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
		{
		
		View view = inflater.inflate(R.layout.fragment_home,container,false);
		return view;
		
		}
	
	public void onActivityCreated(Bundle savedInstanceState)
		{
		
		super.onActivityCreated(savedInstanceState);
		
		//创建 intent ，用于 activity 之间通信
		final Intent intent = new Intent();
		intent.setClass(getActivity().getApplicationContext(),SubjectActivity.class);
		//创建容器，并指定为 bundle
		this.bundle = new Bundle();
		
		//获取 banner
		this.banner_Home = (Banner) getActivity().findViewById(R.id.banner_Home);
		//配置 banner
		banner_Home.setImageLoader(new GlideImageLoader());
		//设置图片集合
		Uri uri1 = Uri.parse("http://img3.sycdn.imooc.com/56e6177e0001fada06000338-240-135.jpg");
		Uri uri2 = Uri.parse("http://img1.sycdn.imooc.com/59437af00001461e06000338-240-135.jpg");
		Uri[] list = {uri1,uri2};
		List images = Arrays.asList(list);
		banner_Home.setImages(images);
		banner_Home.start();
		
		//获取按钮
		this.button_chinese = (Button)getActivity().findViewById(R.id.button_chinese);
		this.button_maths = (Button)getActivity().findViewById(R.id.button_maths);
		this.button_english = (Button)getActivity().findViewById(R.id.button_english);
		this.button_physics = (Button)getActivity().findViewById(R.id.button_physics);
		this.button_chemisty = (Button)getActivity().findViewById(R.id.button_chemistry);
		this.button_biology = (Button)getActivity().findViewById(R.id.button_biology);
		this.button_politics = (Button)getActivity().findViewById(R.id.button_politics);
		this.button_history = (Button)getActivity().findViewById(R.id.button_history);
		this.button_geography = (Button)getActivity().findViewById(R.id.button_geography);
		
		//按钮点击事件
		button_chinese.setOnClickListener(new View.OnClickListener()
			{
			@Override
			public void onClick(View view)
				{
				bundle.putInt("page",0);
				intent.putExtras(bundle);
				startActivity(intent);
				}
			});
		button_maths.setOnClickListener(new View.OnClickListener()
			{
			@Override
			public void onClick(View view)
				{
				bundle.putInt("page",1);
				intent.putExtras(bundle);
				startActivity(intent);
				}
			});
		button_english.setOnClickListener(new View.OnClickListener()
			{
			@Override
			public void onClick(View view)
				{
				bundle.putInt("page",2);
				intent.putExtras(bundle);
				startActivity(intent);
				}
			});
		button_physics.setOnClickListener(new View.OnClickListener()
			{
			@Override
			public void onClick(View view)
				{
				bundle.putInt("page",3);
				intent.putExtras(bundle);
				startActivity(intent);
				}
			});
		button_chemisty.setOnClickListener(new View.OnClickListener()
			{
			@Override
			public void onClick(View view)
				{
				bundle.putInt("page",4);
				intent.putExtras(bundle);
				startActivity(intent);
				}
			});
		button_biology.setOnClickListener(new View.OnClickListener()
			{
			@Override
			public void onClick(View view)
				{
				bundle.putInt("page",5);
				intent.putExtras(bundle);
				startActivity(intent);
				}
			});
		button_politics.setOnClickListener(new View.OnClickListener()
			{
			@Override
			public void onClick(View view)
				{
				bundle.putInt("page",6);
				intent.putExtras(bundle);
				startActivity(intent);
				}
			});
		button_history.setOnClickListener(new View.OnClickListener()
			{
			@Override
			public void onClick(View view)
				{
				bundle.putInt("page",7);
				intent.putExtras(bundle);
				startActivity(intent);
				}
			});
		button_geography.setOnClickListener(new View.OnClickListener()
			{
			@Override
			public void onClick(View view)
				{
				bundle.putInt("page",8);
				intent.putExtras(bundle);
				startActivity(intent);
				}
			});
		
		}
	
	@Override
	public void onStart()
		{
		super.onStart();
		banner_Home.startAutoPlay();
		}
	
	}
