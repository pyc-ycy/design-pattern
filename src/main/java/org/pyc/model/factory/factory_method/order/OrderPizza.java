package org.pyc.model.factory.factory_method.order;
/*
	* @product IntelliJ IDEA
	* @project design-pattern
	* @file OrderPizza
	* @pack org.pyc.model.factory.factory_method.order
	* @date 2021/2/16
	* @time 15:23
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
public abstract class OrderPizza {
		/**
			* 用于订购具体某个地区的披萨
			* @param orderType String
			* @return Pizza
			*/
		abstract Pizza createPizza(String orderType);
		private String type;
		public OrderPizza(){
		}

		public void process(){
				Pizza pizza = null;
				while (true) {
						type = getType();
						pizza = createPizza(type);
						if(pizza != null){
								pizza.prepare();
								pizza.bake();
								pizza.cut();
								pizza.box();
						}else{
        System.out.println("定制失败！");
        break;
						}
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
