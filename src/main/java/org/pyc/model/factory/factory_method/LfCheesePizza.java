package org.pyc.model.factory.factory_method;
/*
	* @product IntelliJ IDEA
	* @project design-pattern
	* @file LfCheesePizza
	* @pack org.pyc.model.factory.factory_method
	* @date 2021/2/16
	* @time 15:12
	* @author 御承扬
	* @E-mail 2923616405@qq.com
	**/

import org.pyc.model.factory.pizza.Pizza;

/**
	* @author 彭友聪
	*/
public class LfCheesePizza extends Pizza {
		@Override
		public void prepare() {
				setName("LfCheesePizza");
    System.out.println("LuFen Cheese Pizza Preparing ... ");
		}
}
