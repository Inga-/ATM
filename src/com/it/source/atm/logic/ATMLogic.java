package com.it.source.atm.logic;

import com.it.source.atm.moneys.Hryvnia;
import com.it.source.atm.collections.Box;

public class ATMLogic {
	// TODO consume
	// TODO checkCounterfeit
	// TODO garbage
	Box<Hryvnia> boxHryvnia = new Box<Hryvnia>();
	
	public boolean checkCounterfeit(int value,int arr[]){
		boolean isCounterfeit = false;
		for (int i=0; i<arr.length; i++){
			if (arr[i] == value){
				isCounterfeit = true;
				break;
			}
		}
		
	    return isCounterfeit;
	}
	
	public void consume(Hryvnia hryvnia){
		boxHryvnia.add(hryvnia);
		System.out.println("Thank you");
	}
	
	public void garbage(){
		System.out.println("Call the police");
	}
	
	
}
