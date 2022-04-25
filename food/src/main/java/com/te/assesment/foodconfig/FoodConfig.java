package com.te.assesment.foodconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import com.te.assesment.foodtypes.*;

public class FoodConfig {
	@Bean(name = "briyani")
	@Primary
	public Food getBriyani() {
		Food briyani = new Briyani();
		return briyani;
	}

	@Bean(name = "idle")
	public Food getIdle() {
		Food idle = new Idle();
		return idle;
	}

	@Bean(name = "fried")
	public Food getFriedRice() {
		Food friedRice = new FriedRice();
		return friedRice;
	}
}
