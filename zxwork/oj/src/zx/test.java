package zx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class test {

	/**
	 * @param args
	 */
	private int i = 1;

	public static void main(String[] args) throws Exception{
//		String string="420";
//		string +=42;
//		System.out.println(string);
//		TreeSet nums = new TreeSet();
//		  //向TreeSet添加4个Integer对象
//		  nums.add(5);
//		  nums.add(2);
//		  nums.add(10);
//		  nums.add(-9);
//		  
//		  //输出集合元素
//		  System.out.println(nums);
//		  //输出集合里的第一个元素
//		  System.out.println(nums.first());
//		  //输出集合里的最后一个元素
//		  System.out.println(nums.last());
//		  //返回小于4的子集、不包含4
//		  System.out.println(nums.headSet(4));
//		  //返回大于5的子集、包含5
//		  System.out.println(nums.tailSet(5));
//		  //返回大于-3，小于4的子集
//		  System.out.println(nums.subSet(-9, 5));
	}
	public void fun(String string1,String string2 ){
		String s=null;
		String yes="";
		String no="";
		for(int i=0;i<string2.length();i++){
		s=string2.substring(1,i+1);
		if(string1.contains(s))
		yes=yes+s;
		else 
		no=no+s;
		}
		System.out.println(yes+" in string1,"+no+"not in string1");
		}

}
