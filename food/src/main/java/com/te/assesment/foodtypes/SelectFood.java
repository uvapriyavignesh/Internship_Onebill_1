package com.te.assesment.foodtypes;

import org.springframework.beans.factory.annotation.Autowired;

public class SelectFood {
	private int sId;
	@Autowired
	private Food foodName;
	
	public SelectFood(int sId, Food foodName) {
		super();
		this.sId = sId;
		this.foodName = foodName;
		
	}
	public SelectFood() {
		super();
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public Food getFoodName() {
		return foodName;
	}
	public void setFoodName(Food foodName) {
		this.foodName = foodName;
	}
	
	
	@Override
	public String toString() {
		return "SelectFood [sId=" + sId + ", foodName=" + foodName + "]";
	}

}
