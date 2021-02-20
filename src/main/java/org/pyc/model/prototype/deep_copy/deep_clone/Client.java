package org.pyc.model.prototype.deep_copy.deep_clone;
/*
	* @product IntelliJ IDEA
	* @project design-pattern
	* @file Client
	* @pack org.pyc.model.prototype.deep_copy.deep_clone
	* @date 2021/2/19
	* @time 17:30
	* @author 御承扬
	* @E-mail 2923616405@qq.com
	**/

/**
	* @author 彭友聪
	*/
public class Client {
  public static void main(String[] args) {
		  DeepPrototype deepPrototype = new DeepPrototype();
		  deepPrototype.name = "松江";
		  deepPrototype.deepCloneableTarget = new DeepCloneableTarget("雪獒","雪獒");

		  DeepPrototype test = null;
		  try{
		  		test = (DeepPrototype) deepPrototype.clone();
		  }catch (Exception e){
      System.out.println(e.getMessage());
		  }
		  assert test != null;
    System.out.println(deepPrototype.deepCloneableTarget.hashCode());
    System.out.println(test.deepCloneableTarget.hashCode());

    DeepPrototype d2 = (DeepPrototype) deepPrototype.deepClone();
    System.out.println(d2.deepCloneableTarget.hashCode());
  }
}
