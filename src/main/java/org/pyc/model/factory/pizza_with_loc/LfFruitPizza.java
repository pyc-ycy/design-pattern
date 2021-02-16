package org.pyc.model.factory.pizza_with_loc;
/*
	* @product IntelliJ IDEA
	* @project design-pattern
	* @file LfFruitPizza
	* @pack org.pyc.model.factory.factory_method
	* @date 2021/2/16
	* @time 15:14
	* @author 御承扬
	* @E-mail 2923616405@qq.com
	**/

import org.pyc.model.factory.pizza.Pizza;

/**
	* @author 彭友聪
	*/
public class LfFruitPizza extends Pizza {
		@Override
		public void prepare() {
				setName("LfFruitPizza");
    System.out.println("LuFen Fruit Pizza Preparing ... ");
		}
}
