package org.pyc.model.builder.tradition;
/*
	* @product IntelliJ IDEA
	* @project design-pattern
	* @file GeneralBuilding
	* @pack org.pyc.model.builder.tradition
	* @date 2021/2/20
	* @time 14:52
	* @author 御承扬
	* @E-mail 2923616405@qq.com
	**/

/**
	* @author 彭友聪
	*/
public class GeneralBuilding extends AbsBuilding{

		@Override
		public void buildBasic() {
    System.out.println("General Building Basic");
		}

		@Override
		public void buildWalls() {
    System.out.println("General Building walls");
		}

		@Override
		public void roofed() {
    System.out.println("General Building Roofing");
		}

}
