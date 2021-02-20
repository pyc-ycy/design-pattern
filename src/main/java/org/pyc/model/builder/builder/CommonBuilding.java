package org.pyc.model.builder.builder;
/*
	* @product IntelliJ IDEA
	* @project design-pattern
	* @file CommonBuilding
	* @pack org.pyc.model.builder.builder
	* @date 2021/2/20
	* @time 16:15
	* @author 御承扬
	* @E-mail 2923616405@qq.com
	**/

/**
	* @author 彭友聪
	*/
public class CommonBuilding extends AbsBuilder{

		@Override
		public void buildBasic() {
				building.setBasis("普通房子地基");
    System.out.println("普通房子打地基5米");
		}

		@Override
		public void buildWalls() {
				building.setWalls("普通房子墙壁");
    System.out.println("普通房子砌墙10cm");
		}

		@Override
		public void roofed() {
				building.setRoofed("普通房子屋顶");
    System.out.println("普通房子盖屋顶");
		}
}
