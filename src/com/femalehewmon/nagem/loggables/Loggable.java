package com.femalehewmon.nagem.loggables;

import java.util.ArrayList;

import com.femalehewmon.nagem.nags.NagGroup;

public class Loggable {

	// A Loggable will be logged based on user input.
	// A Loggable will nag a user if any of the assigned NagGroups
	// have their conditions met (logical OR).
	// If a Loggable does not have any assigned NagGroups, then
	// this loggable will not nag the user.

	private String _name;
	private String _description;
	
	private final ArrayList<NagGroup> _nagSchedule;
	
	public Loggable()
	{
		_nagSchedule = new ArrayList<NagGroup>();
	}
	
	public void addNagGroup(NagGroup nagGroup)
	{
		_nagSchedule.add(nagGroup);
	}
	
	public void removeNagGroup(NagGroup nagGroup)
	{
		_nagSchedule.remove(nagGroup);
	}
	
	protected void destroy()
	{
		for(NagGroup nagGroup: _nagSchedule)
		{
			nagGroup.destroy();
		}
	}
	
}
