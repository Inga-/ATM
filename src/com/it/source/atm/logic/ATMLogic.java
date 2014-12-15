package com.it.source.atm.logic;

import com.it.source.atm.moneys.Hryvnia;
import com.it.source.atm.moneys.Money;
import com.it.source.atm.collections.Box;

public class ATMLogic {
	
	Box box;
	
	public ATMLogic(Box b){
		box = b;
	}

	public boolean checkCounterfeit(int value, int arr[]) {
		boolean isCounterfeit = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				isCounterfeit = true;
				break;
			}
		}
		return isCounterfeit;
	}

	public void consume(Money m) {
		box.add(m);
		System.out.println("Thank you");
	}

	public void garbage() {
		System.out.println("Call the police");
	}

}
