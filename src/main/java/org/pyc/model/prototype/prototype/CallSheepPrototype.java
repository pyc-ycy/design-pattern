package org.pyc.model.prototype.prototype;
/*
	* @product IntelliJ IDEA
	* @project design-pattern
	* @file CallSheepPrototype
	* @pack org.pyc.model.prototype.prototype
	* @date 2021/2/19
	* @time 16:14
	* @author 御承扬
	* @E-mail 2923616405@qq.com
	**/

/**
	* @author 彭友聪
	*/
public class CallSheepPrototype {
  public static void main(String[] args) {
		  SheepPrototype sheep = new SheepPrototype("tom", 1, "white");
    System.out.println(sheep);
		  try {
				  SheepPrototype sheep2 = (SheepPrototype) sheep.clone();
      System.out.println(sheep2);
		  } catch (CloneNotSupportedException e) {
      System.out.println(e.getMessage());
		  }
  }
}
