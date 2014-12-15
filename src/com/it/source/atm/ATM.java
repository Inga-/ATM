package com.it.source.atm;

import com.it.source.atm.collections.Box;
import com.it.source.atm.logic.ATMLogic;
import com.it.source.atm.moneys.Hryvnia;

public class ATM {

	public Box box;
	public ATMLogic logic;

	public ATM() {
		box = new Box();
		logic = new ATMLogic(box);
	}

	public void insertClientValue(int clientValue) {
		Hryvnia hryvnia = new Hryvnia(clientValue);
		if (logic.checkCounterfeit(hryvnia.getValue(), hryvnia.getPar())) {
			logic.consume(hryvnia);
		} else
			logic.garbage();
	}
}
