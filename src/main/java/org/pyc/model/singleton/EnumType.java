package org.pyc.model.singleton;
/*
	* @product IntelliJ IDEA
	* @project design-pattern
	* @file EnumType
	* @pack org.pyc.model.singleton
	* @date 2021/2/15
	* @time 17:11
	* @author 御承扬
	* @E-mail 2923616405@qq.com
	**/

/**
	* @author 彭友聪
	*/
public class EnumType {
  public static void main(String[] args) {
		  EnumSingleton instance = EnumSingleton.INSTANCE;
		  EnumSingleton instance2 = EnumSingleton.INSTANCE;
    System.out.println(instance.hashCode());
    System.out.println(instance2.hashCode());
    instance.method();
  }
}

enum EnumSingleton{
		/**
			* INSTANCE 为类实例
			*/
		INSTANCE;
		public void method(){
    System.out.println("OK!");
		}
}
