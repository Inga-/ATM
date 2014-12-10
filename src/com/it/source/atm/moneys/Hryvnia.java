package com.it.source.atm.moneys;

public class Hryvnia {
	private int par[] = {1,2,5,10,20,50,100,200,500};
	private int value;
	
	public Hryvnia (int value){
		this.value = value;
	}
 
	public int getValue(){
		return value;
	}
	
	public int[] getPar() {
        return par;
    }
	
	public String toString(){
		return "Украинская гривна номинал" + getValue();
	}
}
