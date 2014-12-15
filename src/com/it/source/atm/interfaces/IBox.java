package com.it.source.atm.interfaces;

import com.it.source.atm.moneys.Money;

public interface IBox {
	void add(Money money);
	Money get();
	int size();
}
