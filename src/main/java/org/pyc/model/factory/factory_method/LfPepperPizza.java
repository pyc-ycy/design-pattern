package org.pyc.model.factory.factory_method;
/*
	* @product IntelliJ IDEA
	* @project design-pattern
	* @file LfPepperPizza
	* @pack org.pyc.model.factory.factory_method
	* @date 2021/2/16
	* @time 15:13
	* @author 御承扬
	* @E-mail 2923616405@qq.com
	**/

import org.pyc.model.factory.pizza.Pizza;

/**
	* @author 彭友聪
	*/
public class LfPepperPizza extends Pizza {
		@Override
		public void prepare() {
				setName("LfPepperPizza");
    System.out.println("LuFen Pepper Pizza Preparing ... ");
		}
}
