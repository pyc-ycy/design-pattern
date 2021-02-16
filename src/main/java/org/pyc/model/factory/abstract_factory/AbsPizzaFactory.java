package org.pyc.model.factory.abstract_factory;/*
	* @product IntelliJ IDEA
	* @project design-pattern
	* @file AbsPizzaFactory
	* @pack org.pyc.model.factory.abstract_factory
	* @date 2021/2/16
	* @time 16:46
	* @author 御承扬
	* @E-mail 2923616405@qq.com
	**/

import org.pyc.model.factory.pizza.Pizza;

/**
	* @author 彭友聪
	*/
public interface AbsPizzaFactory {
		/**
			* 创建具体地区的披萨订购类
			* @param orderType String
			* @return Pizza
			*/
		Pizza createPizza(String orderType);
}
