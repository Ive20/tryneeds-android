package com.ezgo;

import java.util.ArrayList;
import java.util.HashMap;

import android.app.Application;

public class MainApp extends Application {
	public static String mac;
	private static MainApp mainapp;
	public final static String xiaomuurl="http://192.168.1.107/";
	public final static String debugurl="http://192.168.1.107/tagWeb/public/index.php?debug_host=127.0.0.1&debug_fastfile=1&start_debug=1&debug_port=10137&use_remote=1&original_url=http%3A%2F%2F192.168.1.107%2FtagWeb%2Fpublic%2Findex.php&send_sess_end=1&debug_start_session=1&debug_no_cache=1420786399699&debug_session_id=1004";
	public final static float PRINTMM=8;
	public final static String XIAOMUPACKAGE="com.xiaomu.xiaomuapp_preferences";
	  public static MainApp getMainApp() {
	        return mainapp;
	    }
	  @Override
	  public void onCreate(){
		  super.onCreate();
		  mainapp=this;
	  }
	  private static Datatree data;
	  public static Datatree getDatatree() {
		  if(data==null)
		  {
			  data=new Datatree();
		  }
	        return data;
	    }  
	  public  static class Datatree{
			
		  public String siteid="";
			public String sitename="";
			public String siteallowedit="";
			public String machineroomid="";
			public String machineroomname="";
			public String machineroomallowedit="";
			public String cabinetid="";
			public String cabinetname="";
			public String cabinetallowedit="";
			public String chassisid="";
			public String chassisname="";
			public String chassisallowedit="";
			
		}
}

