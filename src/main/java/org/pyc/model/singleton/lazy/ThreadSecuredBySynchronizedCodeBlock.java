package org.pyc.model.singleton.lazy;
/*
	* @product IntelliJ IDEA
	* @project design-pattern
	* @file ThreadSecuredBySynchronizedCodeBlock
	* @pack org.pyc.model.singleton.lazy
	* @date 2021/2/14
	* @time 17:19
	* @author 御承扬
	* @E-mail 2923616405@qq.com
	**/

/**
	* @author 彭友聪
	*/
public class ThreadSecuredBySynchronizedCodeBlock {
  public static void main(String[] args) {
		  ThreadSecuredSingleton instance = ThreadSecuredSingleton.getInstance();
		  ThreadSecuredSingleton instance2 = ThreadSecuredSingleton.getInstance();
    System.out.println(instance.hashCode());
    System.out.println(instance2.hashCode());
  }
}
class ThreadSecuredSingleton{
		private static ThreadSecuredSingleton instance;
		private ThreadSecuredSingleton(){

		}

		/**
			* 在判断语句内部使用同步加锁，既能起到线程安全，又能保持效率
			* @return ThreadSecuredSingleton
			*/
		public static ThreadSecuredSingleton getInstance(){
				if(instance == null){
						synchronized (ThreadSecuredSingleton.class){
								//noinspection InstantiationOfUtilityClass
								instance = new ThreadSecuredSingleton();
						}
				}
				return instance;
		}
}
