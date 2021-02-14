package org.pyc.model.singleton.lazy;
/*
	* @product IntelliJ IDEA
	* @project design-pattern
	* @file ThreadSecuredBySynchronizationMethod
	* @pack org.pyc.model.singleton.lazy
	* @date 2021/2/14
	* @time 17:06
	* @author 御承扬
	* @E-mail 2923616405@qq.com
	**/

/**
	* @author 彭友聪
	*/
public class ThreadSecuredBySynchronizationMethod {
  public static void main(String[] args) {
		  ThreadSecuredSingletonSynchronization instance =
										  ThreadSecuredSingletonSynchronization.getInstance();
		  ThreadSecuredSingletonSynchronization instance2 =
										  ThreadSecuredSingletonSynchronization.getInstance();
    System.out.println(instance.hashCode());
    System.out.println(instance2.hashCode());
  }
}
class ThreadSecuredSingletonSynchronization{
		private static ThreadSecuredSingletonSynchronization instance;
		private ThreadSecuredSingletonSynchronization(){

		}

		/**
			* 使用 synchronized 关键字修饰方法，使方法称为同步方法。
			* @return ThreadSecuredSingletonSynchronization
			*/
		public static synchronized ThreadSecuredSingletonSynchronization getInstance(){
				if(instance == null){
						//noinspection InstantiationOfUtilityClass
						instance = new ThreadSecuredSingletonSynchronization();
				}
				return instance;
		}
}