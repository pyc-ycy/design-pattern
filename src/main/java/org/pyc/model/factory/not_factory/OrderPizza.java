package org.pyc.model.factory.not_factory;
/*
	* @product IntelliJ IDEA
	* @project design-pattern
	* @file OrderPizza
	* @pack org.pyc.model.factory.order
	* @date 2021/2/15
	* @time 18:20
	* @author 御承扬
	* @E-mail 2923616405@qq.com
	**/

import org.pyc.model.factory.pizza.CheesePizza;
import org.pyc.model.factory.pizza.GreekPizza;
import org.pyc.model.factory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
	*
	* @author 彭友聪
	*/
public class OrderPizza {
		private static final String GREEK = "greek";
		private static final String CHEESE = "cheese";

		public OrderPizza(){
				String type = getType();
				Pizza pizza = null;
				if(type.equals(GREEK)){
						pizza = new GreekPizza();
						pizza.setName(GREEK);
				}else if(type.equals(CHEESE)){
						pizza = new CheesePizza();
						pizza.setName(CHEESE);
				}else{
      System.out.println("类型错误！");
				}
				assert pizza != null;
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();
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
}
