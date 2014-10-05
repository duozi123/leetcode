package zx;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Word_Break {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "abcd";
		Set<String> set = new HashSet<String>();
		set.add("a");
		//set.add("abc");
		set.add("b");
		set.add("cd");
		set.add("abc");
		// StringBuffer bf = new StringBuffer();
		// bf.append("jsahdwiehdew");
		System.out.println(wordBreak(s, set));
		// System.out.println(s.matches("#*"));

	}

	public static List<String> wordBreak(String s, Set<String> dict) {
		int length = s.length();
		ArrayList<String> list=new ArrayList<String>();
		String bf="";
		if (s == null || dict == null || dict.isEmpty() || length == 0) {
			return list;
		}

		Iterator it = dict.iterator();
		String string;
		while (it.hasNext()) {
			string = (String) it.next();
			if (!s.contains(string)) {
				it.remove();

			}
		}

		
		int flag=0;
		for (String word : dict) {
			if (s.endsWith(word)) {
				flag=1;
				break;
				}			
		}
		if(flag==0)
			return list;
			for (String word : dict) {
				if (s.startsWith(word)) {
					flag=1;
					if (word.length() == s.length()) {
						
						list.add(bf+word);
					} else {
						makebuff(s, dict, bf+word, list,
								 word.length());
					}
				
					
				}
			}
			
		
		return list;

	}

	public static void makebuff(String s, Set<String> dict, String bf,
			ArrayList<String> list, int i) {
		for (String word : dict) {
			if (s.substring(i).startsWith(word)) {

				if (i + word.length() == s.length()) {
					
					String temp = new String(bf+" " + word);
					list.add(temp);
				} else {
					makebuff(s, dict, bf+" " + word, list,
							i + word.length());
				}
			}
		}
	}

}
