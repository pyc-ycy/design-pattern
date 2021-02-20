package org.pyc.model.builder.builder;
/*
	* @product IntelliJ IDEA
	* @project design-pattern
	* @file AbsBuilder
	* @pack org.pyc.model.builder.builder
	* @date 2021/2/20
	* @time 16:11
	* @author 御承扬
	* @E-mail 2923616405@qq.com
	**/

/**
	* @author 彭友聪
	*/
public abstract class AbsBuilder {

		protected Building building = new Building();

		/**
			* 打地基
			*/
		public abstract void buildBasic();

		/**
			* 砌墙
			*/
		public abstract void buildWalls();

		/**
			* 盖屋顶
			*/
		public abstract void roofed();

		public Building build(){
				return this.building;
		}
}
