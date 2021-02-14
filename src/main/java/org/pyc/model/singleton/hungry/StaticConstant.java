package org.pyc.model.singleton.hungry;
/*
	* @product IntelliJ IDEA
	* @project design-pattern
	* @file StaticConstant
	* @pack org.pyc.model.singleton.hungry
	* @date 2021/2/14
	* @time 15:45
	* @author 御承扬
	* @E-mail 2923616405@qq.com
	**/

/**
	* 静态常量式的饿汉模式
	* @author 彭友聪
	*/
@SuppressWarnings("ConstantConditions")
public class StaticConstant {
  public static void main(String[] args) {
		  StaticConstantHungrySingleton instance = StaticConstantHungrySingleton.getInstance();
		  StaticConstantHungrySingleton instance2 = StaticConstantHungrySingleton.getInstance();
    System.out.println(instance == instance2);
  }
}

class StaticConstantHungrySingleton{
		/**
			* 构造器私有化，外部无法通过new来创建对象
			*/
		private StaticConstantHungrySingleton(){

		}

		/**
			* 创建内部实例对象
			*/
		@SuppressWarnings("InstantiationOfUtilityClass")
		private final static StaticConstantHungrySingleton INSTANCE =
										new StaticConstantHungrySingleton();

		/**
			* 返回内部实例对象
			* @return StaticConstantHungrySingleton
			*/
		public static StaticConstantHungrySingleton getInstance(){
				return INSTANCE;
		}
}