package org.pyc.model.factory.simple_factory;
/*
	* @product IntelliJ IDEA
	* @project design-pattern
	* @file OrderPizza
	* @pack org.pyc.model.factory.simple_factory
	* @date 2021/2/15
	* @time 19:09
	* @author 御承扬
	* @E-mail 2923616405@qq.com
	**/

import org.pyc.model.factory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
	* @author 彭友聪
	*/
public class OrderPizza {
		private String type;
		private SimplePizzaFactory factory;
		public void setFactory(SimplePizzaFactory factory) {
				this.factory = factory;
		}
		private OrderPizza(){
		}
		private static class OrderPizzaInstance{
				private static final OrderPizza INSTANCE = new OrderPizza();
		}
		public static OrderPizza getInstance(){
				return OrderPizzaInstance.INSTANCE;
		}
		public void start(){
				type = getType();
				Pizza pizza = factory.createPizza(type);
				if(pizza!=null){
						pizza.prepare();
						pizza.bake();
						pizza.cut();
						pizza.box();
				}else {
      System.out.println("订购失败！");
				}
		}
		private String getType(){
				try{
						BufferedReader strIn = new BufferedReader(new InputStreamReader(System.in));
						System.out.println("请输入你想订购的披萨类型：");
						return strIn.readLine();
				}catch (IOException e){
						System.out.println(e.getMessage());
						return "";
				}
		}
		public void showType(){
    System.out.println(type);
		}
}
