package org.pyc.model.factory.simple_factory;
/*
	* @product IntelliJ IDEA
	* @project design-pattern
	* @file SimplePizzaFactory
	* @pack org.pyc.model.factory.simple_factory
	* @date 2021/2/15
	* @time 19:04
	* @author 御承扬
	* @E-mail 2923616405@qq.com
	**/

import org.pyc.model.factory.pizza.CheesePizza;
import org.pyc.model.factory.pizza.GreekPizza;
import org.pyc.model.factory.pizza.Pizza;

/**
	* @author 彭友聪
	*/
public class SimplePizzaFactory {
		private static final String GREEK = "greek";
		private static final String CHEESE = "cheese";
		public Pizza createPizza(String type){
				Pizza pizza = null;
				if(type.equals(GREEK)){
						pizza = new GreekPizza();
						pizza.setName(GREEK);
				}else if(type.equals(CHEESE)){
						pizza = new CheesePizza();
						pizza.setName(CHEESE);
				}
				return pizza;
		}
}
