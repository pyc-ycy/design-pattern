package org.pyc.model.singleton.double_check;
/*
	* @product IntelliJ IDEA
	* @project design-pattern
	* @file DoubleCheck
	* @pack org.pyc.model.singleton.double_check
	* @date 2021/2/15
	* @time 16:36
	* @author 御承扬
	* @E-mail 2923616405@qq.com
	**/

/**
	* @author 彭友聪
	*/
public class DoubleCheck {
  public static void main(String[] args) {
		  DoubleCheckSingleton instance = DoubleCheckSingleton.getInstance();
		  DoubleCheckSingleton instance2 = DoubleCheckSingleton.getInstance();
    System.out.println(instance.hashCode());
    System.out.println(instance2.hashCode());
  }
}


class DoubleCheckSingleton{

		private static volatile DoubleCheckSingleton instance;

		private DoubleCheckSingleton(){

		}

		public static DoubleCheckSingleton getInstance(){
				if(instance == null){
						synchronized (DoubleCheckSingleton.class){
								if(instance == null){
										//noinspection InstantiationOfUtilityClass
										instance = new DoubleCheckSingleton();
								}
						}
				}
				return instance;
		}
}