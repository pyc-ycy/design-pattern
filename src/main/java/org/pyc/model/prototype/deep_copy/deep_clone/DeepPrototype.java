package org.pyc.model.prototype.deep_copy.deep_clone;
/*
	* @product IntelliJ IDEA
	* @project design-pattern
	* @file DeepPrototype
	* @pack org.pyc.model.prototype.deep_copy.deep_clone
	* @date 2021/2/19
	* @time 17:23
	* @author 御承扬
	* @E-mail 2923616405@qq.com
	**/

import java.io.*;

/**
	* @author 彭友聪
	*/
public class DeepPrototype implements Serializable, Cloneable {

		public String name;

		public DeepCloneableTarget deepCloneableTarget;

		public DeepPrototype(){
				super();
		}

		/**
			* 深拷贝方式一
			* @return Object
			* @throws CloneNotSupportedException NotSupportException
			*/
		@Override
		protected Object clone() throws CloneNotSupportedException {

				Object deep = null;
				deep = super.clone();
				DeepPrototype deepPrototype = (DeepPrototype) deep;
				deepPrototype.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();
				return deepPrototype;
		}

		public Object deepClone(){

				ByteArrayOutputStream out = null;
				ObjectOutputStream oos = null;
				ByteArrayInputStream bis = null;
				ObjectInputStream ois = null;

				try{
						out = new ByteArrayOutputStream();
						oos = new ObjectOutputStream(out);
						oos.writeObject(this);

						bis = new ByteArrayInputStream(out.toByteArray());
						ois = new ObjectInputStream(bis);
						return (DeepPrototype) ois.readObject();
				}catch (Exception e){
      System.out.println(e.getMessage());
				}finally{
						try{
								out.close();
								oos.close();
								bis.close();
								ois.close();
						}catch (Exception e2){
        System.out.println(e2.getMessage());
						}
				}
				return null;
		}

}
