package org.pyc.principle.liskov_rule;
/*
	* @product IntelliJ IDEA
	* @project design-pattern
	* @file UnObtainRule
	* @pack org.pyc.principle.liskov_rule
	* @date 2021/2/12
	* @time 16:18
	* @author 御承扬
	* @E-mail 2923616405@qq.com
	**/

/**
	* @author 彭友聪
	*/
public class UnObtainRule {
  public static void main(String[] args) {
				BaseType a = new BaseType();
    System.out.println("11 - 3 =" + a.func1(11, 3));
    System.out.println("1 - 8 =" + a.func1(1, 8));

    System.out.println("-----------------");
    TypeB b = new TypeB();
    System.out.println("11 - 3 =" + b.func1(11, 3));
    System.out.println("1 - 8=" + b.func1(1, 8));
    System.out.println("11 + 2 + 9" + b.func2(11, 2));
  }
}


class BaseType {

		public int func1(int num1, int num2){
				return num1-num2;
		}
}

class TypeB extends BaseType{

		public int func1(int a, int b) {
				return a + b;
		}
		public int func2(int a, int b){
				return func1(a,b) + 9;
		}
}