package com.ezgo.tryneeds.lib;

import java.util.ArrayList;
import java.util.HashMap;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase.CursorFactory;

public class Dbhandler extends SQLiteAssetHelper {
	 private static final String DATABASE_NAME = "tag.db";
	    private static final int DATABASE_VERSION = 1;


	  public Dbhandler(Context context) {
	        super(context, DATABASE_NAME, null, DATABASE_VERSION);
	    }
	  /**
	     * Query the given URL, returning a {ArrayList<HashMap<String,String>>} over the result set.
	     *
	     * @param distinct true if you want each row to be unique, false otherwise.
	     * @param table The table name to compile the query against.
	     * @param columns A list of which columns to return. Passing null will
	     *            return all columns, which is discouraged to prevent reading
	     *            data from storage that isn't going to be used.
	     * @param selection A filter declaring which rows to return, formatted as an
	     *            SQL WHERE clause (excluding the WHERE itself). Passing null
	     *            will return all rows for the given table.
	     * @param selectionArgs You may include ?s in selection, which will be
	     *         replaced by the values from selectionArgs, in order that they
	     *         appear in the selection. The values will be bound as Strings.
	     * @param groupBy A filter declaring how to group rows, formatted as an SQL
	     *            GROUP BY clause (excluding the GROUP BY itself). Passing null
	     *            will cause the rows to not be grouped.
	     * @param having A filter declare which row groups to include in the cursor,
	     *            if row grouping is being used, formatted as an SQL HAVING
	     *            clause (excluding the HAVING itself). Passing null will cause
	     *            all row groups to be included, and is required when row
	     *            grouping is not being used.
	     * @param orderBy How to order the rows, formatted as an SQL ORDER BY clause
	     *            (excluding the ORDER BY itself). Passing null will use the
	     *            default sort order, which may be unordered.
	     * @param limit Limits the number of rows returned by the query,
	     *            formatted as LIMIT clause. Passing null denotes no LIMIT clause.
	     * @return A ArrayList<HashMap<String,String>>, which is key-value include all
	     * if no data ArrayList<HashMap<String,String>> size will be 0;
	     
	     */
	  public ArrayList<HashMap<String,String>> select(String table, String[] columns, String selection,
	            String[] selectionArgs, String groupBy, String having,
	            String orderBy,String limit)
	  {
		  ArrayList<HashMap<String,String>> result=new ArrayList<HashMap<String,String>>();
		  Cursor cursor=this.getReadableDatabase().query(false, table, columns, selection, selectionArgs, groupBy,
	                having, orderBy, limit);
			 while (cursor.moveToNext()) {
				 HashMap<String,String> map=new HashMap<String, String>();
				 String[] cols=cursor.getColumnNames();
				 for(String col:cols)
				 {				 
					 map.put(col, cursor.getString(cursor.getColumnIndex(col)));
					 
				 }
				 result.add(map);
			 }
			return result;
	  }

}
