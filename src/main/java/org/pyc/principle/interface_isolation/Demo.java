package org.pyc.principle.interface_isolation;
/*
	* @product IntelliJ IDEA
	* @project design-pattern
	* @file Demo
	* @pack org.pyc.principle.interface_isolation
	* @date 2021/2/11
	* @time 16:11
	* @author 御承扬
	* @E-mail 2923616405@qq.com
	**/

/**
	* @author 彭友聪
	*/
public class Demo {
  public static void main(String[] args) {
		  A a = new A();
		  a.depend1(new B());
		  a.depend3(new B());
		  a.depend3(new B());
		  C c = new C();
		  c.depend1(new D());
		  c.depend2(new D());
		  c.depend4(new D());
  }
}

interface InterFace{
		/**
			* 方法1
			*/
		void method1();
}
interface InterfaceB{
		/**
			* 方法1
			*/
		void method3();
		/**
			* 方法1
			*/
		void method5();
}
interface InterfaceD{
		/**
			* 方法1
			*/
		void method2();
		/**
			* 方法1
			*/
		void method4();
}

/**
	* @author 彭友聪
	*/
class B implements InterFace,InterfaceB{
		@Override
		public void method1(){
				System.out.println("B implement method1");
		}
		@Override
		public void method3(){
				System.out.println("B implement method3");
		}
		@Override
		public void method5(){
				System.out.println("B implement method5");
		}
}

/**
	* @author 彭友聪
	*/
class D implements InterFace,InterfaceD{
		@Override
		public void method1(){
				System.out.println("D implement method1");
		}
		@Override
		public void method2(){
				System.out.println("D implement method2");
		}
		@Override
		public void method4(){
				System.out.println("D implement method4");
		}
}

class A{
		public void depend1(InterFace i){
				i.method1();
		}
		public void depend3(InterfaceB i){
				i.method3();
		}
		public void depend5(InterfaceB i){
				i.method5();
		}
}

class C{
		public void depend1(InterFace i){
				i.method1();
		}
		public void depend2(InterfaceD i){
				i.method2();
		}
		public void depend4(InterfaceD i){
				i.method4();
		}
}