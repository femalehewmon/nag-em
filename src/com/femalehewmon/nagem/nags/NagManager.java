package com.femalehewmon.nagem.nags;

import com.femalehewmon.nagem.loggables.LoggableManager;

import android.app.AlarmManager;
import android.content.Context;
import android.location.LocationManager;
import android.support.v4.app.FragmentActivity;

public class NagManager {
	
	// The NagManager hosts a "nag loop" that checks
	// at a 1 minute resolution for updates to states that 
	// effect Nags. 

	private AlarmManager _alarmManager;
	private LocationManager _locationManager;
	private LoggableManager _loggableManager;
	
	public NagManager(FragmentActivity activity)
	{
		_locationManager = 
				(LocationManager) activity.
				getSystemService(Context.LOCATION_SERVICE);
	}
	
}
