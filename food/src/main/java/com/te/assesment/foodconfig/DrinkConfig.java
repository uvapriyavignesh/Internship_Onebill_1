package com.te.assesment.foodconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import com.te.assesment.foodtypes.AppleJuice;
import com.te.assesment.foodtypes.Cocacola;
import com.te.assesment.foodtypes.MilkShake;
import com.te.assesment.foodtypes.SoftDrink;

public class DrinkConfig {
	@Bean(name = "cocacola")
	@Primary
	public SoftDrink getcocacola() {
		SoftDrink test = new Cocacola();
		return test;
	}

	@Bean(name = "milkshake")
	public SoftDrink getMilkShake() {
		SoftDrink test = new MilkShake();
		return test;
	}

	@Bean(name = "applejuice")
	public SoftDrink getAppleJuice() {
		SoftDrink test = new AppleJuice();
		return test;
	}
}
