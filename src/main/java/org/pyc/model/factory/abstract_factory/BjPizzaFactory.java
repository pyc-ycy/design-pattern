package org.pyc.model.factory.abstract_factory;
/*
	* @product IntelliJ IDEA
	* @project design-pattern
	* @file BjPizzaFactory
	* @pack org.pyc.model.factory.abstract_factory
	* @date 2021/2/16
	* @time 16:53
	* @author 御承扬
	* @E-mail 2923616405@qq.com
	**/

import org.pyc.model.factory.pizza.Pizza;
import org.pyc.model.factory.pizza_with_loc.BjCheesePizza;
import org.pyc.model.factory.pizza_with_loc.BjFruitPizza;
import org.pyc.model.factory.pizza_with_loc.BjPepperPizza;

/**
	* @author 彭友聪
	*/
public class BjPizzaFactory implements AbsPizzaFactory{
		private static final String BJ_CHEESE_PIZZA = "BjCheesePizza";
		private static final String BJ_PEPPER_PIZZA = "BjPepperPizza";
		public static final String BJ_FRUIT_PIZZA = "BjFruitPizza";
		@Override
		public Pizza createPizza(String orderType) {
				Pizza pizza = null;
				if(orderType.equals(BJ_CHEESE_PIZZA)){
						pizza = new BjCheesePizza();
				}else if (orderType.equals(BJ_PEPPER_PIZZA)){
						pizza = new BjPepperPizza();
				}else if(orderType.equals(BJ_FRUIT_PIZZA)){
						pizza = new BjFruitPizza();
				}
				return pizza;
		}
}
