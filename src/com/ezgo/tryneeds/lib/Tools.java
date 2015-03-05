package com.ezgo.tryneeds.lib;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.ezgo.MainApp;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

public class Tools {   
	
	private static AsyncHttpClient asyncHttpClient;
	public static int networkstatus=0;// 0=online,1=offline
	private static Dbhandler dbhandler;
	public static String getsetting(String key)
	{
		SharedPreferences settings = MainApp.getMainApp().getSharedPreferences(MainApp.EZGOPACKAGE, 0);
		String value="";
		if(key=="isfirst")
		{
			value= settings.getString(key,"1");
		}
		else
		{
			 value = settings.getString(key,"");
		}
		
		return value;
	}
	public static void putsetting(String key,String value)
	{
		SharedPreferences settings = MainApp.getMainApp().getSharedPreferences(MainApp.EZGOPACKAGE, 0);   
		SharedPreferences.Editor editor = settings.edit();   
		editor.putString(key, value);   
		editor.commit();   
	}
	public static AsyncHttpClient getAsyncHttpClient()
    {
    	if(asyncHttpClient==null)
    	{
    		asyncHttpClient= new AsyncHttpClient();
    	}
    	return asyncHttpClient;
    	
    }
    public static AsyncHttpClient getNewAsyncHttpClient()
    {
    	return new AsyncHttpClient();
    }
}