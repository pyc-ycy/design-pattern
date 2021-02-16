package org.pyc.model.factory.pizza_with_loc;
/*
	* @product IntelliJ IDEA
	* @project design-pattern
	* @file BjFruitPizza
	* @pack org.pyc.model.factory.factory_method
	* @date 2021/2/16
	* @time 15:11
	* @author 御承扬
	* @E-mail 2923616405@qq.com
	**/

import org.pyc.model.factory.pizza.Pizza;

/**
	* @author 彭友聪
	*/
public class BjFruitPizza extends Pizza {
		@Override
		public void prepare() {
				setName("BjFruitPizza");
    System.out.println("Beijing Fruit Pizza Preparing ...");
		}
}
