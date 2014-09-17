package com.femalehewmon.nagem.loggables;

import java.util.ArrayList;

import com.femalehewmon.nagem.nags.NagGroup;

public class Loggable {

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
	
	protected void destroy()
	{
		for(NagGroup nagGroup: _nagSchedule)
		{
			nagGroup.destroy();
		}
	}
	
}
