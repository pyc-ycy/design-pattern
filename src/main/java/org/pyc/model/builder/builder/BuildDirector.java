package org.pyc.model.builder.builder;
/*
	* @product IntelliJ IDEA
	* @project design-pattern
	* @file BuildDirector
	* @pack org.pyc.model.builder.builder
	* @date 2021/2/20
	* @time 16:21
	* @author 御承扬
	* @E-mail 2923616405@qq.com
	**/

/**
	* @author 彭友聪
	*/
public class BuildDirector {

		private AbsBuilder builder = null;

		public BuildDirector(AbsBuilder builder){
				this.builder = builder;
		}

		public void setBuilder(AbsBuilder builder) {
				this.builder = builder;
		}

		public Building constructor(){
				builder.buildBasic();
				builder.buildWalls();
				builder.roofed();
				return builder.build();
		}
}
