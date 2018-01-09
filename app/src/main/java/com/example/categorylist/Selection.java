package com.example.categorylist;

import android.app.ListActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Selection extends ListActivity {
	private static String[] items = { "US", "UK", "CANADA", "JAPAN", "SINGAPORE","INDIA", "CHINA" };
	
	private static String[] Sect = { "GOOGLE", "FACEBOOK","DELL" };
	
	private static String[] Doc = { "FRONT", "TOP","BACK" };
	
	@Override
	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		setContentView(R.layout.activity_main);
	
		adapter.addSection("step 1", new ArrayAdapter(this,	android.R.layout.simple_list_item_1, items));
		
		adapter.addSection("Step 2", new ArrayAdapter(this,	android.R.layout.simple_list_item_1, Sect));
		
		adapter.addSection("Step 3", new ArrayAdapter(this,	android.R.layout.simple_list_item_1, Doc));
		
		setListAdapter(adapter);
	}
	
	SectionedAdapter adapter = new SectionedAdapter() {
		protected View getHeaderView(String caption, int index,	View convertView, ViewGroup parent) {
			TextView result = (TextView) convertView;
	
			if (convertView == null) {
				result = (TextView) getLayoutInflater().inflate(R.layout.header, null);
			}
	
			result.setText(caption);
	
			return (result);
		}
	};
}