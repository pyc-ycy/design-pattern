package org.pyc.model.singleton.lazy;
/*
	* @product IntelliJ IDEA
	* @project design-pattern
	* @file ThreadUnsecured
	* @pack org.pyc.model.singleton.lazy
	* @date 2021/2/14
	* @time 16:48
	* @author 御承扬
	* @E-mail 2923616405@qq.com
	**/

/**
	* 线程不安全式懒汉式单例模式
	* @author 彭友聪
	*/
public class ThreadUnsecured {
  public static void main(String[] args) {
		  ThreadUnsecuredSingleton instance = ThreadUnsecuredSingleton.getInstance();
		  ThreadUnsecuredSingleton instance2 = ThreadUnsecuredSingleton.getInstance();
    System.out.println(instance.hashCode());
    System.out.println(instance2.hashCode());
  }
}


class ThreadUnsecuredSingleton{
		private static ThreadUnsecuredSingleton instance;

		private ThreadUnsecuredSingleton(){

		}

		/**
			* 当使用到实例对象才进行实例化，这就是懒汉式
			* @return ThreadUnsecuredSingleton
			*/
		public static ThreadUnsecuredSingleton getInstance(){
				if(instance == null){
						//noinspection InstantiationOfUtilityClass
						instance = new ThreadUnsecuredSingleton();
				}
				return instance;
		}
}