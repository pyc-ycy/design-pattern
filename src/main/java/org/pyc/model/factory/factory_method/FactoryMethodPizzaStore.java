package org.pyc.model.factory.factory_method;
/*
	* @product IntelliJ IDEA
	* @project design-pattern
	* @file PizzaStore
	* @pack org.pyc.model.factory.factory_method.order
	* @date 2021/2/16
	* @time 16:02
	* @author 御承扬
	* @E-mail 2923616405@qq.com
	**/

import org.pyc.model.factory.factory_method.order.OrderBjPizza;
import org.pyc.model.factory.factory_method.order.OrderLfPizza;
import org.pyc.model.factory.factory_method.order.OrderPizza;

/**
	* @author 彭友聪
	*/
public class FactoryMethodPizzaStore {
  public static void main(String[] args) {
		  OrderPizza bjPizza = new OrderBjPizza();
		  bjPizza.process();
		  OrderPizza lfPizza = new OrderLfPizza();
		  lfPizza.process();
  }
}
