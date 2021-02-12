package org.pyc.principle.liskov_rule;
/*
	* @product IntelliJ IDEA
	* @project design-pattern
	* @file ObtainRule
	* @pack org.pyc.principle.liskov_rule
	* @date 2021/2/12
	* @time 16:39
	* @author 御承扬
	* @E-mail 2923616405@qq.com
	**/

/**
	* @author 彭友聪
	*/
public class ObtainRule {
  public static void main(String[] args) {
  		SimpleClass s = new SimpleClass();
    System.out.println("11 - 3=" + s.func1(11, 3));
    System.out.println("1 - 8=" + s.func1(1, 8));

    System.out.println("--------------");
    TypeA a = new TypeA();
    System.out.println("11 - 3="+a.func3(11, 3));
    System.out.println("1- 8=" + a.func3(1, 8));
    System.out.println("11 + 3 + 9=" + a.func2(11, 3));
  }
}

class BaseClass{

}

class SimpleClass extends BaseClass{

		public int func1(int num1, int num2){
				return num1-num2;
		}
}

/**
	* TypeA 中要用到 SimpleClass 中的方法，这里采用组合的方式进行
	*/
class TypeA extends BaseClass{

		private final SimpleClass s = new SimpleClass();

		public int func1(int a, int b) {
				return a + b;
		}
		public int func2(int a, int b){
				return func1(a,b) + 9;
		}

		/**
			* 调用 SimpleClass 的 func1
			* @param a int
			* @param b int
			* @return int
			*/
		public int func3(int a, int b){
				return s.func1(a, b);
		}
}
