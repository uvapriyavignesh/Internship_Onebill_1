package com.te.assesment.foodtypes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Briyani implements Food {
	private int fId = 1;
	@Autowired
	@Qualifier("applejuice")
	private SoftDrink drink;

	@Override
	public String toString() {
		return "Briyani [ Name=" + name() + ",Drink=" + drink.getName() + "]";
	}

	public int getfId() {
		return fId;
	}

	public void setfId(int fId) {
		this.fId = fId;
	}

	public SoftDrink getDrink() {
		return drink;
	}

	public void setDrink(SoftDrink drink) {
		this.drink = drink;
	}

	public Briyani(int fId, SoftDrink drink) {
		super();
		this.fId = fId;
		this.drink = drink;
	}

	public Briyani() {
		super();
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "BRIYANI";
	}

}
