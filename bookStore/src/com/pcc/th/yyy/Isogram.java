package com.pcc.th.yyy;

import java.util.HashSet;
import java.util.Set;

public class Isogram {
	boolean check(String string) {
		string = string.toLowerCase();
		string = string.replaceAll(" ", "");
		string = string.replaceAll("-", "");
		Set<Character> isoWord = new HashSet<Character>();
		boolean checkString = false;
		int lengthiso = string.length();
		for (int i = 0; i < lengthiso; i++) {
			/*char checkIso = string.charAt(i);
			isoWord.add(checkIso);
			System.out.println(checkIso);*/
			
			if(!isoWord.add(string.charAt(i))) {
				return  false;
			}
		}
		/*int isoWordSize = isoWord.size();
		if(lengthiso == isoWordSize) {
			checkString = true;
		}*/
		return true;
	}
}
