package com.te.assesment.foodtypes;

import org.springframework.beans.factory.annotation.Autowired;

public class FriedRice implements Food {
	private int fId = 2;
	@Autowired
	private SoftDrink drink;

	@Override
	public String toString() {
		return "FriedRice [ Name=" + name() + ",Drink=" + drink.getName() + "]";
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

	public FriedRice(int fId, SoftDrink drink) {
		super();
		this.fId = fId;
		this.drink = drink;
	}

	public FriedRice() {
		super();
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "FRIEDRICE";
	}

}
