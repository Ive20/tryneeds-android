package com.ezgo;

import java.util.ArrayList;
import java.util.HashMap;

import android.app.Application;

public class MainApp extends Application {
	public static String mac;
	private static MainApp mainapp;
	public final static String ezgourl="http://192.168.1.111/android/";
	public final static String debugurl="http://192.168.1.107/tagWeb/public/index.php?debug_host=127.0.0.1&debug_fastfile=1&start_debug=1&debug_port=10137&use_remote=1&original_url=http%3A%2F%2F192.168.1.107%2FtagWeb%2Fpublic%2Findex.php&send_sess_end=1&debug_start_session=1&debug_no_cache=1420786399699&debug_session_id=1004";
	public final static String EZGOPACKAGE="com.ezgo.ezgo_preferences";
	  public static MainApp getMainApp() {
	        return mainapp;
	    }
	  @Override
	  public void onCreate(){
		  super.onCreate();
		  mainapp=this;
	  }
	 
}

