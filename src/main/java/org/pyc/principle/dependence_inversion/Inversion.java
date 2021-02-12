package org.pyc.principle.dependence_inversion;
/*
	* @product IntelliJ IDEA
	* @project design-pattern
	* @file Inversion
	* @pack org.pyc.principle.dependence_inversion
	* @date 2021/2/12
	* @time 14:41
	* @author 御承扬
	* @E-mail 2923616405@qq.com
	**/

/**
	* @author 彭友聪
	*/
public class Inversion {
  public static void main(String[] args) {
    People people = new People();
    people.receive(new Email2());
    people.receive(new WeChat());
    people.receive(new Qq());
  }
}

interface IReceiver{
		/**
			* 获取消息
			* @return String
			*/
		public String getInfo();
}

class Email2 implements IReceiver{
		@Override
		public String getInfo() {
				return "电子邮件信息：This is a email!";
		}
}

class WeChat implements IReceiver{
		@Override
		public String getInfo() {
				return "微信信息：This is a WeChat";
		}
}

class Qq implements IReceiver{
		@Override
		public String getInfo() {
				return "QQ: This is a QQ";
		}
}

class People{
		public void receive(IReceiver info){
    System.out.println(info.getInfo());
		}
}