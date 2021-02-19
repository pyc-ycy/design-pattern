package org.pyc.model.prototype.traditional;
/*
	* @product IntelliJ IDEA
	* @project design-pattern
	* @file Demo
	* @pack org.pyc.model.prototype.traditional
	* @date 2021/2/19
	* @time 15:37
	* @author 御承扬
	* @E-mail 2923616405@qq.com
	**/

import org.pyc.model.prototype.sheep.Sheep;

/**
	* @author 彭友聪
	*/
public class Demo {
  public static void main(String[] args) {
		  Sheep sheep = new Sheep("tom", "1", "白色");
		  Sheep sheep2 = new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());

    System.out.println(sheep);
    System.out.println(sheep2);
  }
}
