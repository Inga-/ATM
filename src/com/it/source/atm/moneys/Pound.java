package com.it.source.atm.moneys;

public class Pound extends Money {
	private int par[] = {5,10,20,50};
	
	public Pound(int v) {
		super(v);
	}
	
	public int[] getPar(){
        return par;
    }
	
	public String toString(){
		return "British pound" + getValue();
	}

}
