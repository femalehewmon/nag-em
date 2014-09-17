package com.femalehewmon.nagem.nags;

public class NagGroup {

	// A NagGroup represents a group of nag conditions that must 
	// be met in order for a scheduled nag to execute.
	// A NagGroup can have one of each NagType defined.
	
	private TimeNag _timeNag;
	private LocationNag _locationNag;
	private EventNag _eventNag;
	
	public NagGroup() {
		
	}
	
	public void setTimeNag(TimeNag timeNag)
	{
		if(_timeNag != null) 
		{
			_timeNag.destroy();
		}
		_timeNag = timeNag;
	}
	
	public void destroy() 
	{
		if(_timeNag != null)
		{
			_timeNag.destroy();
			_timeNag = null;
		}
		
		if(_locationNag != null)
		{
			_locationNag.destroy();
			_locationNag = null;
		}
		
		if(_eventNag != null)
		{
			_eventNag.destroy();
			_eventNag = null;
		}
	}
	
}
