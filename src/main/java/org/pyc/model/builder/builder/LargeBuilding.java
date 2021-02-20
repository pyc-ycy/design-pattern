package org.pyc.model.builder.builder;
/*
	* @product IntelliJ IDEA
	* @project design-pattern
	* @file LargeBuilding
	* @pack org.pyc.model.builder.builder
	* @date 2021/2/20
	* @time 16:18
	* @author 御承扬
	* @E-mail 2923616405@qq.com
	**/

/**
	* @author 彭友聪
	*/
public class LargeBuilding extends AbsBuilder{
		@Override
		public void buildBasic() {
				building.setBasis("大楼地基");
    System.out.println("高楼打地基60米");
		}

		@Override
		public void buildWalls() {
				building.setWalls("大楼墙体");
    System.out.println("高楼砌墙50cm");
		}

		@Override
		public void roofed() {
				building.setRoofed("大楼屋顶");
    System.out.println("高楼封顶");
		}
}
