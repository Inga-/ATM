package com.it.source.atm.moneys;

public abstract class Money {
	int value;
	
	Money (int v){
		value = v;
	}
	
	public int getValue(){
		return value;
	}
	
	public abstract int[] getPar();
	public abstract String toString();

}
