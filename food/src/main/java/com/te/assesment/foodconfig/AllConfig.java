package com.te.assesment.foodconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.te.assesment.foodtypes.SelectFood;

@Configuration
@Import({FoodConfig.class,DrinkConfig.class})
public class AllConfig {
	
	@Bean(name="selectfood")
	public SelectFood setFood() {
		SelectFood food=new SelectFood();
		food.setsId(1);
		return food;
	}

}
