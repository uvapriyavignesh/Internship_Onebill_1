package com.le.lear.app1;

public class Demo {
	public static void main(String[] args) {
		int []a= {6,7,3,4,9,1};
		for (int i=0;i<a.length;i++) {
			int temp=0;
			for (int j=0;j<a.length-1;j++) {
				if (a[j]>a[i]) {
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
					
					
				}
				
				
			}
			for (int i1 : a) {
				System.out.println(i1);
				
			}
			System.out.println("--------------");
			
		}
//		for (int i : a) {
//			System.out.println(i);
//		}
//		
	}
	

}
