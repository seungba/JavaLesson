package lesson;

public class Sangsok extends Sangsok2 {
	
	private String str1;
	private int num1;
	int num2 = 4;
	
	public  Sangsok() {
		// System.out.println("Sangsok »ý¼ºÀÚ");
		int num = getNum2();
		int ch = num +3;
		System.out.println(ch);
/*		System.out.println(str1);
		System.out.println(num1);
		System.out.println(str2);
		System.out.println(getStr2());
		System.out.println(getNum2());*/
	}
	
	public void disp() {
		System.out.println("[Sangsok] disp");
	}
	
	public int getNum2() {
		return num2;
	}
	
	public static void main(String[] sdfsdf) {
		Sangsok s = new Sangsok();
		s.disp();
		
		int ret = s.getNum2();
		System.out.println(ret);
		s.setNum2(20);
		int a = s.getNum2();
		System.out.println(a);
	}
}