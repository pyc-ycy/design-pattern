package org.pyc.model.factory.simple_factory;
/*
	* @product IntelliJ IDEA
	* @project design-pattern
	* @file PizzaStore
	* @pack org.pyc.model.factory.simple_factory
	* @date 2021/2/15
	* @time 19:14
	* @author 御承扬
	* @E-mail 2923616405@qq.com
	**/

/**
	* @author 彭友聪
	*/
public class SimpleFactoryPizzaStore {
  public static void main(String[] args) {
		  OrderPizza orderPizza = OrderPizza.getInstance();
		  orderPizza.setFactory(new SimplePizzaFactory());
		  orderPizza.start();
		  orderPizza.showType();
  }
}
