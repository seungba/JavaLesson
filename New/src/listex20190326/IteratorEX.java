package listex20190326;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEX {
	
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		list.add("6");
		
		// ���ͷ����� ��ü itr �� list���� �����´�.
		
		Iterator<String> itr = list.iterator(); // ��� �÷��� �ȿ��� iterator() �޼ҵ尡 �ִ�.
		
		while(itr.hasNext()) { // ���� ���� �� ���� �Ǵ��Ͽ� while���� ����.
			String str = itr.next(); // ���ڿ� ���� str�� ���� �ϳ��� �ִ´�.
			System.out.println(str);
			
		}
	}
	
	
}
