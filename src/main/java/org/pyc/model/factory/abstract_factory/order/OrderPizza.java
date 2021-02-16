package org.pyc.model.factory.abstract_factory.order;
/*
	* @product IntelliJ IDEA
	* @project design-pattern
	* @file OrderPizza
	* @pack org.pyc.model.factory.abstract_factory.order
	* @date 2021/2/16
	* @time 17:01
	* @author 御承扬
	* @E-mail 2923616405@qq.com
	**/

import org.pyc.model.factory.abstract_factory.AbsPizzaFactory;
import org.pyc.model.factory.abstract_factory.BjPizzaFactory;
import org.pyc.model.factory.abstract_factory.LfPizzaFactory;
import org.pyc.model.factory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
	* @author 彭友聪
	*/
public class OrderPizza {
		private static final String B_J = "Beijing";
		private static final String L_F = "LuFen";
		private static OrderPizza instance;
		private String type;
		private String loc;
		private OrderPizza(){}
		public static OrderPizza getInstance(){
				if(instance == null){
						synchronized (OrderPizza.class){
								if(instance == null){
										instance = new OrderPizza();
								}
						}
				}
				return instance;
		}
		public void process(){
				AbsPizzaFactory factory;
				Pizza pizza = null;
				loc = getLoc();
				if(loc.equals(B_J)){
						type = getType();
						factory = new BjPizzaFactory();
						pizza = factory.createPizza(type);
				}else if (loc.equals(L_F)){
						type = getType();
						factory = new LfPizzaFactory();
						pizza = factory.createPizza(type);
				}
				if(pizza != null){
						pizza.prepare();
						pizza.bake();
						pizza.cut();
						pizza.bake();
				}else {
      System.out.println("定制失败");
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
		private String getLoc(){
				try{
						BufferedReader strIn = new BufferedReader(new InputStreamReader(System.in));
						System.out.println("请输入你想订购的披萨店地址：");
						return strIn.readLine();
				}catch (IOException e){
						System.out.println(e.getMessage());
						return "";
				}
		}
		public void showType(){
				System.out.println(type);
		}
		public void showLoc(){
    System.out.println(loc);
		}
}
