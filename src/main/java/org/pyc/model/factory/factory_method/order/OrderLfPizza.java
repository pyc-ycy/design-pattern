package org.pyc.model.factory.factory_method.order;
/*
	* @product IntelliJ IDEA
	* @project design-pattern
	* @file OrderLfPizza
	* @pack org.pyc.model.factory.factory_method.order
	* @date 2021/2/16
	* @time 15:57
	* @author 御承扬
	* @E-mail 2923616405@qq.com
	**/

import org.pyc.model.factory.factory_method.LfCheesePizza;
import org.pyc.model.factory.factory_method.LfFruitPizza;
import org.pyc.model.factory.factory_method.LfPepperPizza;
import org.pyc.model.factory.pizza.Pizza;

/**
	* @author 彭友聪
	*/
public class OrderLfPizza extends OrderPizza{
		private static final String LF_CHEESE_PIZZA = "LfCheesePizza";
		private static final String LF_PEPPER_PIZZA = "LfPepperPizza";
		public static final String LF_FRUIT_PIZZA = "LfFruitPizza";
		@Override
		Pizza createPizza(String orderType) {
				if(orderType.equals(LF_CHEESE_PIZZA)){
						return new LfCheesePizza();
				}else if(orderType.equals(LF_PEPPER_PIZZA)){
						return new LfPepperPizza();
				}else if(orderType.equals(LF_FRUIT_PIZZA)){
						return new LfFruitPizza();
				}else {
						return null;
				}
		}
}
