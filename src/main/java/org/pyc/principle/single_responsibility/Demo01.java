package org.pyc.principle.single_responsibility;
/*
	* @product IntelliJ IDEA
	* @project design-pattern
	* @file Demo01
	* @pack org.pyc.principle.single_responsibility
	* @date 2021/2/11
	* @time 12:55
	* @author 御承扬
	* @E-mail 2923616405@qq.com
	**/


/**
	* @author 彭友聪
	*/
public class Demo01 {


  public static void main(String[] args) {


  		Vehicle vehicle = new Vehicle();
  		vehicle.runRoad("奔驰");
  		vehicle.runOcean("远洋号");
  		vehicle.runAir("波音");

  }
}


/**
	* 交通工具类
	*/
class Vehicle{

		/**
			* 该方法违背单一职责原则
			* @param vehicle String
			*/
	public void run(String vehicle){
    System.out.println(vehicle + "在公路上运行...");
	}

	public void runRoad(String car){
    System.out.println(car + "在公路上跑....");
	}

	public void runOcean(String boat){
    System.out.println(boat + "在海洋里游...");
	}

	public void runAir(String aircraft){
    System.out.println(aircraft + "在天空上飞...");
	}

}