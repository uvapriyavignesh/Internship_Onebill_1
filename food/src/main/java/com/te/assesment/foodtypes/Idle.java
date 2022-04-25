package com.te.assesment.foodtypes;

import org.springframework.beans.factory.annotation.Autowired;

public class Idle implements Food {
	private int fId = 3;
	@Autowired
	private SoftDrink drink;

	@Override
	public String toString() {
		return "Idle [ Name=" + name() + ",Drink=" + drink.getName() + "]";
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

	public Idle(int fId, SoftDrink drink) {
		super();
		this.fId = fId;
		this.drink = drink;
	}

	public Idle() {
		super();
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "IDLE";
	}

}
