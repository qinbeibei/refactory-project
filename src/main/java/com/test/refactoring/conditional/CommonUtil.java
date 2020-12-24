package com.test.refactoring.conditional;

import java.util.ArrayList;

public class CommonUtil {
	public static String addStrList(ArrayList<String> list) {
		if (list == null) {
			return "";
		}
		if (list.size() <= 0) {
			return "";
		}

		String res = "";
		for (int i = 0; i < list.size(); i++) {
			res = res + list.get(i);
		}
		return res;
	}
}
