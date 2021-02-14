package org.pyc.model.singleton.hungry;
/*
	* @product IntelliJ IDEA
	* @project design-pattern
	* @file StaticCodeBlock
	* @pack org.pyc.model.singleton.hungry
	* @date 2021/2/14
	* @time 16:34
	* @author 御承扬
	* @E-mail 2923616405@qq.com
	**/

/**
	* @author 彭友聪
	*/
public class StaticCodeBlock {
  public static void main(String[] args) {
		  StaticCodeBlockHungrySingleton instance
										  = StaticCodeBlockHungrySingleton.getInstance();
		  StaticCodeBlockHungrySingleton instance2 = StaticCodeBlockHungrySingleton.getInstance();
    System.out.println(instance.hashCode());
    System.out.println(instance2.hashCode());
  }
}

class StaticCodeBlockHungrySingleton{
		private StaticCodeBlockHungrySingleton(){

		}
		private static final StaticCodeBlockHungrySingleton INSTANCE;

		static {
				//noinspection InstantiationOfUtilityClass
				INSTANCE = new StaticCodeBlockHungrySingleton();
		}
		public static StaticCodeBlockHungrySingleton getInstance(){
				return INSTANCE;
		}
}