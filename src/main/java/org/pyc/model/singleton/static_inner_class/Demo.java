package org.pyc.model.singleton.static_inner_class;
/*
	* @product IntelliJ IDEA
	* @project design-pattern
	* @file Demo
	* @pack org.pyc.model.singleton.static_inner_class
	* @date 2021/2/15
	* @time 16:54
	* @author 御承扬
	* @E-mail 2923616405@qq.com
	**/

/**
	* @author 彭友聪
	*/
public class Demo {
  public static void main(String[] args) {
		  StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
		  StaticInnerClassSingleton instance2 = StaticInnerClassSingleton.getInstance();
    System.out.println(instance.hashCode());
    System.out.println(instance2.hashCode());
  }
}

class StaticInnerClassSingleton{
		private StaticInnerClassSingleton(){}
		private static class SingletonInstance{
				@SuppressWarnings("InstantiationOfUtilityClass")
				private static final StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
		}
		public static StaticInnerClassSingleton getInstance(){
				return SingletonInstance.INSTANCE;
		}
}