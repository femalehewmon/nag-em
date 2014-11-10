package com.femalehewmon.nagem.nags;

public class NagGroup {

	// A NagGroup represents a group of nag conditions that must 
	// be met in order for a scheduled nag to execute.
	// A NagGroup can have one of each NagType defined.
	// A NagGroup will qualify to nag if all of the defined Nags 
	// have their conditions met (logical AND).

	private EventNag _eventNag;
	private LocationNag _locationNag;
	private TimeNag _timeNag;
	
	public NagGroup() {
		
	}
	
	public Boolean conditionsMet()
	{
		Boolean conditionsMet = true;
		if(_eventNag != null)
		{
			conditionsMet = conditionsMet && _eventNag.conditionMet();
		}
		if(_locationNag != null)
		{
			conditionsMet = conditionsMet && _locationNag.conditionMet();
		}
		if(_timeNag != null)
		{
			conditionsMet = conditionsMet && _timeNag.conditionMet();
		}
		
		return conditionsMet;
	}
	
	public void setEventNag(EventNag eventNag)
	{
		if(_eventNag != null)
		{
			_eventNag.destroy();
		}
		_eventNag = eventNag;
	}
	
	public void setLocationNag(LocationNag locationNag)
	{
		if(_locationNag != null)
		{
			_locationNag.destroy();
		}
		_locationNag = locationNag;
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
