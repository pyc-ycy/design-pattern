package org.pyc.model.factory.abstract_factory;
/*
	* @product IntelliJ IDEA
	* @project design-pattern
	* @file LfPizzaFactory
	* @pack org.pyc.model.factory.abstract_factory
	* @date 2021/2/16
	* @time 16:58
	* @author 御承扬
	* @E-mail 2923616405@qq.com
	**/

import org.pyc.model.factory.pizza.Pizza;
import org.pyc.model.factory.pizza_with_loc.LfCheesePizza;
import org.pyc.model.factory.pizza_with_loc.LfFruitPizza;
import org.pyc.model.factory.pizza_with_loc.LfPepperPizza;

/**
	* @author 彭友聪
	*/
public class LfPizzaFactory implements AbsPizzaFactory{
		private static final String LF_CHEESE_PIZZA = "LfCheesePizza";
		private static final String LF_PEPPER_PIZZA = "LfPepperPizza";
		public static final String LF_FRUIT_PIZZA = "LfFruitPizza";
		@Override
		public Pizza createPizza(String orderType) {
				Pizza pizza = null;
				if(orderType.equals(LF_CHEESE_PIZZA)){
						pizza = new LfCheesePizza();
				}else if(orderType.equals(LF_PEPPER_PIZZA)){
						pizza = new LfPepperPizza();
				}else if(orderType.equals(LF_FRUIT_PIZZA)){
						pizza = new LfFruitPizza();
				}
				return pizza;
		}
}
