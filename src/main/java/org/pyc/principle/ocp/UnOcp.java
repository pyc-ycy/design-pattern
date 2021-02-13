package org.pyc.principle.ocp;
/*
	* @product IntelliJ IDEA
	* @project design-pattern
	* @file UnOcp
	* @pack org.pyc.principle.ocp
	* @date 2021/2/13
	* @time 14:58
	* @author 御承扬
	* @E-mail 2923616405@qq.com
	**/

/**
	* @author 彭友聪
	*/
public class UnOcp {
  public static void main(String[] args) {
		  GraphicEditor graphicEditor = new GraphicEditor();
		  graphicEditor.drawShape(new Rectangle());
		  graphicEditor.drawShape(new Circle());
  }
}

class Shape{
		int mType;
}
class Rectangle extends Shape{
		Rectangle(){
				super.mType = 1;
		}
}
class Circle extends Shape{
		Circle(){
				super.mType = 2;
		}
}

class GraphicEditor{
		public void drawRectangle(Shape r){
				System.out.println("矩形");
		}
		public void drawCircle(Shape c){
				System.out.println("圆形");
		}

		public void drawShape(Shape s){
				if(s.mType == 1){
						drawRectangle(s);
				}else if(s.mType == 2){
						drawCircle(s);
				}
		}
}