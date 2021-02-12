package org.pyc.principle.dependence_inversion;
/*
	* @product IntelliJ IDEA
	* @project design-pattern
	* @file Inversion
	* @pack org.pyc.principle.dependence_inversion
	* @date 2021/2/12
	* @time 14:28
	* @author 御承扬
	* @E-mail 2923616405@qq.com
	**/

/**
	* @author 彭友聪
	*/
public class UnInversion {
  public static void main(String[] args) {
		  Person person = new Person();
		  person.receive(new Email());
  }
}


class Email{

		public String getInfo(){
				return "电子邮件信息：This is a email!";
		}
}

class Person{

		public void receive(Email email){
    System.out.println(email.getInfo());
		}
}