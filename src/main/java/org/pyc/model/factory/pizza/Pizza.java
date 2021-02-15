package org.pyc.model.factory.pizza;/*
	* @product IntelliJ IDEA
	* @project design-pattern
	* @file Pizza
	* @pack org.pyc.model.factory.simple_factory
	* @date 2021/2/15
	* @time 18:03
	* @author 御承扬
	* @E-mail 2923616405@qq.com
	**/

/**
	* 披萨接口
	* @author 彭友聪
	*/
public abstract class Pizza {

		protected String name;
		/**
			* 制作披萨前的准备
			*/
		public abstract void prepare();

		/**
			* 烘烤披萨
			*/
		public void bake(){
    System.out.println(name + "披萨烘烤");
		}

		/**
			* 切割披萨
			*/
		public void cut(){
    System.out.println(name + "披萨切割");
		}

		/**
			* 打包披萨
			*/
		public void box(){
    System.out.println(name + "披萨打包");
		}

		public void setName(String name) {
				this.name = name;
		}
}
