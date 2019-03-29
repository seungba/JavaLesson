package lesson20190326;

import lesson.Sangsok;

public class StaticEx01 {
	
	public static void disp() {
		System.out.println("disp");
	}
	
	public static void disp2() {
		System.out.println("disp2");
	}
	
	int cnt1 = 0;
	public  void numDisp1() {
		System.out.println("cnt : " + cnt1);
		cnt1++;
	}
	
	static int cnt2 = 0;
	public static  void numDisp2() {
		System.out.println("cnt : " + cnt2);
		cnt2++;
	}
	
	int cnt3 = 0;
	public  void numDisp3() {
		System.out.println("cnt : " + cnt3);
		cnt3++;
	}
	
	static int cnt4 = 0;
	public static void numDisp4() {
		System.out.println("cnt : " + cnt4);
		cnt4++;
	}
	
	public static void main(String[] args) {
		System.out.println("sdfsdfdsfs");
		/*StaticEx01 a = new StaticEx01();
		a.disp();*/
		disp();
	}
}
