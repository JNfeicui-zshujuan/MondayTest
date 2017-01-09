package com.example.viewpagertest;

import android.app.Application;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

public class MyApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		ImageLoaderConfiguration configuration = ImageLoaderConfiguration
				.createDefault(getApplicationContext());
		ImageLoader.getInstance().init(configuration);
	}
}
