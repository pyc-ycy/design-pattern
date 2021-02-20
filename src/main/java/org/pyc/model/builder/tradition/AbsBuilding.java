package org.pyc.model.builder.tradition;
/*
	* @product IntelliJ IDEA
	* @project design-pattern
	* @file AbsBuilding
	* @pack org.pyc.model.builder.tradition
	* @date 2021/2/20
	* @time 14:48
	* @author 御承扬
	* @E-mail 2923616405@qq.com
	**/

/**
	* @author 彭友聪
	*/
public abstract class AbsBuilding {

		/**
			* 打地基
			*/
		public abstract void buildBasic();

		/**
			* 砌墙
			*/
		public abstract void buildWalls();

		/**
			* 封顶
			*/
		public abstract void roofed();

		public void build(){
				buildBasic();
				buildWalls();
				roofed();
		}

}
