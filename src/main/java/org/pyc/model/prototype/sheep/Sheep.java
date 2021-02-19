package org.pyc.model.prototype.sheep;
/*
	* @product IntelliJ IDEA
	* @project design-pattern
	* @file Sheep
	* @pack org.pyc.model.prototype.sheep
	* @date 2021/2/19
	* @time 15:34
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
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Sheep {

		private String name;
		private String age;
		private String color;
}
