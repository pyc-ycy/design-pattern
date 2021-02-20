package org.pyc.model.prototype.deep_copy.deep_clone;
/*
	* @product IntelliJ IDEA
	* @project design-pattern
	* @file DeepCloneableTarget
	* @pack org.pyc.model.prototype.deep_copy.deep_clone
	* @date 2021/2/19
	* @time 17:18
	* @author 御承扬
	* @E-mail 2923616405@qq.com
	**/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
	* @author 彭友聪
	*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeepCloneableTarget implements Cloneable, Serializable {

		private static final long serialVersionUID = 1L;

		private String cloneName;

		private String cloneClass;

		@Override
		protected Object clone() throws CloneNotSupportedException {
				return super.clone();
		}
}
