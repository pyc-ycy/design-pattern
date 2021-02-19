package org.pyc.model.prototype.prototype;
/*
	* @product IntelliJ IDEA
	* @project design-pattern
	* @file SheepPrototype
	* @pack org.pyc.model.prototype.sheep
	* @date 2021/2/19
	* @time 16:07
	* @author 御承扬
	* @E-mail 2923616405@qq.com
	**/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
	* @author 彭友聪
	*/
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SheepPrototype implements Cloneable{
		private String name;
		private Integer age;
		private String color;

		@Override
		protected Object clone() throws CloneNotSupportedException {
				SheepPrototype sheep = null;
				sheep = (SheepPrototype) super.clone();
				return sheep;
		}
}
