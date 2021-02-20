package org.pyc.model.builder.builder;
/*
	* @product IntelliJ IDEA
	* @project design-pattern
	* @file BuildingClient
	* @pack org.pyc.model.builder.builder
	* @date 2021/2/20
	* @time 16:26
	* @author 御承扬
	* @E-mail 2923616405@qq.com
	**/

/**
	* @author 彭友聪
	*/
public class BuildingClient {
  public static void main(String[] args) {
		  CommonBuilding building = new CommonBuilding();
		  BuildDirector director = new BuildDirector(building);
		  Building house = director.constructor();
    System.out.println(house.getBasis());
    director.setBuilder(new LargeBuilding());
		  Building large = director.constructor();
    System.out.println(large.getWalls());
  }
}
