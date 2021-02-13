package org.pyc.principle.ocp;
/*
	* @product IntelliJ IDEA
	* @project design-pattern
	* @file UseOcp
	* @pack org.pyc.principle.ocp
	* @date 2021/2/13
	* @time 15:16
	* @author 御承扬
	* @E-mail 2923616405@qq.com
	**/

/**
	* @author 彭友聪
	*/
public class UseOcp {
  public static void main(String[] args) {
		  DrawShape drawShape = new DrawShape();
		  drawShape.editor(new RectangleShape());
		  drawShape.editor(new CircleShape());
		  drawShape.editor(new TriangleShape());
  }
}

abstract class BasicShape{
		/**
			* 绘图方法。
			*/
		public abstract void draw();
}

class RectangleShape extends BasicShape{
		@Override
		public void draw() {
    System.out.println("绘制矩形！");
		}
}

class CircleShape extends BasicShape{
		@Override
		public void draw() {
    System.out.println("绘制圆形！");
		}
}
class TriangleShape extends BasicShape{
		@Override
		public void draw() {
    System.out.println("绘制三角形！");
		}
}
class DrawShape{
		public void editor(BasicShape basicShape){
				basicShape.draw();
		}
}