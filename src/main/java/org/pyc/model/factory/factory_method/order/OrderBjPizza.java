package org.pyc.model.factory.factory_method.order;
/*
	* @product IntelliJ IDEA
	* @project design-pattern
	* @file OrderBjPizza
	* @pack org.pyc.model.factory.factory_method.order
	* @date 2021/2/16
	* @time 15:44
	* @author 御承扬
	* @E-mail 2923616405@qq.com
	**/

import org.pyc.model.factory.factory_method.BjCheesePizza;
import org.pyc.model.factory.factory_method.BjFruitPizza;
import org.pyc.model.factory.factory_method.BjPepperPizza;
import org.pyc.model.factory.pizza.Pizza;

/**
	* @author 彭友聪
	*/
public class OrderBjPizza extends OrderPizza{
		private static final String BJ_CHEESE_PIZZA = "BjCheesePizza";
		private static final String BJ_PEPPER_PIZZA = "BjPepperPizza";
		public static final String BJ_FRUIT_PIZZA = "BjFruitPizza";
		@Override
		Pizza createPizza(String orderType) {
				if(orderType.equals(BJ_CHEESE_PIZZA)){
						return new BjCheesePizza();
				}else if(orderType.equals(BJ_PEPPER_PIZZA)){
						return new BjPepperPizza();
				}else if(orderType.equals(BJ_FRUIT_PIZZA)){
						return new BjFruitPizza();
				}
				else{
						return null;
				}
		}
}
