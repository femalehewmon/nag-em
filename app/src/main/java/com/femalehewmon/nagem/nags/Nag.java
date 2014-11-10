package com.femalehewmon.nagem.nags;

public abstract class Nag {
	
	public enum Type{
		TimeNag,
		LocationNag,
		EventNag;
	}
	
	private final Type _nagType;
	
	public Nag(Type type)
	{
		_nagType = type;
	}
	
	public Type getType()
	{
		return _nagType;
	}
	
	protected abstract Boolean conditionMet();
	
	protected abstract void destroy();
	
}
