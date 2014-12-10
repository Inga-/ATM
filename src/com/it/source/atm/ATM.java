package com.it.source.atm;

import com.it.source.atm.logic.ATMLogic;
import com.it.source.atm.moneys.Hryvnia;

public class ATM {
	//TODO Bag bag = new Bag()
	//TODO ATMLogic logic =new ATMLogic()
	//TODO insertClientValue(int clientValue)
	
	//public Box box;
	//public ATMLogic logic;
	
	/* public ATM(){
		box =new Box();
		logic =new ATMLogic(box);
	}*/
	
	ATMLogic logic = new ATMLogic();
	
	public void insertClientValue(int clientValue){
		Hryvnia hryvnia = new Hryvnia(clientValue);
		if (logic.checkCounterfeit(hryvnia.getValue(), hryvnia.getPar())){
			logic.consume(hryvnia);
		}
		else logic.garbage();
	}

}
