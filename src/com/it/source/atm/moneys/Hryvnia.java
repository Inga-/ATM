package com.it.source.atm.moneys;

public class Hryvnia extends Money {
	private int par[] = {1,2,5,10,20,50,100,200,500};
	
	public Hryvnia (int v){
		super(v);
	}
	
	public int[] getPar(){
        return par;
    }
	
	public String toString(){
		return "Ukrainian hryvnia" + getValue();
	}
}
