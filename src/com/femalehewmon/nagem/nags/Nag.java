package com.femalehewmon.nagem.nags;

public abstract class Nag {
	
	public enum Type{
		TimeNag,
		LocationNag,
		EventNag;
	}
	
	private final Type _nagType;
	
	private int _priority;
	
	public Nag(Type type)
	{
		_nagType = type;
	}
	
	protected abstract void destroy();
	
}
