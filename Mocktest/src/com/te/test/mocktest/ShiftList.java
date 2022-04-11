package com.te.test.mocktest;

import java.util.ArrayList;

public class ShiftList {
	public void name() {
		int a = 2;

		StringBuilder str = new StringBuilder();
		ArrayList arrayList = new ArrayList();
		String s1 = "abij";
		for (int i = 0; i <= s1.length() - 1; i++) {
			arrayList.add(s1.charAt(i));
		}
		System.out.println(arrayList);
		System.out.println("---------------------------------------");
		ArrayList res = new ArrayList();
		res = rightShift(a, arrayList);
		
		System.out.println(res);

	}

	public ArrayList rightShift(int a, ArrayList oldArray) {
		ArrayList newarrayList = new ArrayList();
		//System.out.println(oldArray + "sj");
		int choose = 0;
		for (int i = 0; i <= oldArray.size() - 1; i++) {
			if (a <= i) {

				newarrayList.add(oldArray.get(i));

			}

		}
		for (int j = 0; j < a; j++) {
			newarrayList.add(oldArray.get(j));

		}
		return newarrayList;

	}

	public ArrayList leftShift(int a, ArrayList oldArray) {
		ArrayList newarrayList = new ArrayList();
		for (int i = 0; i <= oldArray.size() - 1; i++) {

			if (i >= oldArray.size() - a) {
				newarrayList.add(oldArray.get(i));
			}

		}
		for (int j = 0; j <= oldArray.size() -(a+1); j++) {
			newarrayList.add(oldArray.get(j));
		}
		return newarrayList;
	}

}
