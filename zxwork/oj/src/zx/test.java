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
//		  //��TreeSet���4��Integer����
//		  nums.add(5);
//		  nums.add(2);
//		  nums.add(10);
//		  nums.add(-9);
//		  
//		  //�������Ԫ��
//		  System.out.println(nums);
//		  //���������ĵ�һ��Ԫ��
//		  System.out.println(nums.first());
//		  //�������������һ��Ԫ��
//		  System.out.println(nums.last());
//		  //����С��4���Ӽ���������4
//		  System.out.println(nums.headSet(4));
//		  //���ش���5���Ӽ�������5
//		  System.out.println(nums.tailSet(5));
//		  //���ش���-3��С��4���Ӽ�
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
