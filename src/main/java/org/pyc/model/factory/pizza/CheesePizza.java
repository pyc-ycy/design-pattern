package org.pyc.model.factory.pizza;
/*
	* @product IntelliJ IDEA
	* @project design-pattern
	* @file CheesePizza
	* @pack org.pyc.model.factory.pizza
	* @date 2021/2/15
	* @time 18:14
	* @author 御承扬
	* @E-mail 2923616405@qq.com
	**/

/**
	* @author 彭友聪
	*/
public class CheesePizza extends Pizza{
		@Override
		public void prepare(){
    System.out.println("奶酪披萨原材料准备！~");
		}
}
