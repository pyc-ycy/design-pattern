package org.pyc.principle.demeter;
/*
	* @product IntelliJ IDEA
	* @project design-pattern
	* @file UseDemeter
	* @pack org.pyc.principle.demeter
	* @date 2021/2/13
	* @time 16:48
	* @author 御承扬
	* @E-mail 2923616405@qq.com
	**/

import java.util.ArrayList;
import java.util.List;

/**
	* @author 彭友聪
	*/
public class UseDemeter {
  public static void main(String[] args) {
		  SchoolManager1 schoolManager = new SchoolManager1();
		  schoolManager.printAllEmployee(new CollegeManager1());
  }
}

class CollegeManager1{
		public List<CollegeEmployee> getAllEmployee(){
				int len = 10;
				List<CollegeEmployee> list = new ArrayList<>();
				for(int i=0; i<len; i++){
						CollegeEmployee emp = new CollegeEmployee();
						emp.setId("学院员工id=" + i);
						list.add(emp);
				}
				return list;
		}
		public void printAllEmployee(){
				List<CollegeEmployee> list1 = this.getAllEmployee();
				System.out.println("--------------分公司员工--------------");
				for(CollegeEmployee c : list1){
						System.out.println(c.getId());
				}
		}
}

class SchoolManager1{
		public List<Employee> getAllEmployee(){
				int len = 5;
				List<Employee> list = new ArrayList<>();
				for(int i=0; i<len; i++){
						Employee emp = new Employee();
						emp.setId("学校总部员工id=" + i);
						list.add(emp);
				}
				return list;
		}
		void printAllEmployee(CollegeManager1 sub){
				sub.printAllEmployee();
				List<Employee> list2 = this.getAllEmployee();
				System.out.println("--------------学校总部员工--------------");
				for(Employee e : list2){
						System.out.println(e.getId());
				}
		}
}