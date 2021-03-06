package com.sh.firebase.realtime_database;

import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties
public class RealtimeDatabaseData {

	public String code;
	public String title;
	public String text;

	public RealtimeDatabaseData() {
		// Default constructor required for calls to DataSnapshot.getValue(RealtimeDatabaseData.class)
	}

	public RealtimeDatabaseData(String code, String title, String text) {
		this.code = code;
		this.title = title;
		this.text = text;
	}

}
