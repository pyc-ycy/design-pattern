package org.pyc.model.factory.abstract_factory;
/*
	* @product IntelliJ IDEA
	* @project design-pattern
	* @file AbsFactoryPizzaStore
	* @pack org.pyc.model.factory.abstract_factory
	* @date 2021/2/16
	* @time 17:16
	* @author 御承扬
	* @E-mail 2923616405@qq.com
	**/

import org.pyc.model.factory.abstract_factory.order.OrderPizza;

/**
	* @author 彭友聪
	*/
public class AbsFactoryPizzaStore {
  public static void main(String[] args) {
		  OrderPizza orderPizza = OrderPizza.getInstance();
		  orderPizza.process();
		  orderPizza.showLoc();
		  orderPizza.showType();
  }
}
