package listex20190326;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ListEx1 {
	public static void main(String[] args) {

//		int a = 3;						// int
//		int[] b = {1,2,3,4,5};			// �迭
		
		// �迭 
//		int[] b1 = new int[100000];
		
//		for (int i = 0; i< b.length; i++) {
//			System.out.println(b[i]);
//		}
		
		// ArrayList
//		ArrayList<String> list = new ArrayList<>();
//		list.add("10");  	// 0
//		list.add("11");		// 1
//		list.add("12");		// 2
//		list.add("13");		// 3
//		list.add("14");		// 4
//		list.add("15");		// 5
//		list.add("16");		// 6
//		
//		System.out.println("�ֱ� �� : " + list.get(1));			// 11
//		System.out.println("�ֱ� �� size : " + list.size());	// 7 
//		list.add(1, "20");
//		list.remove("20");
//		System.out.println("���� �� : " + list.get(1));			// 11
//		System.out.println("���� �� : " + list.get(2));			// 12
//		System.out.println("�ֱ� �� size : " + list.size());	// 7
		
//		list.get(0);		// "10"
		

//		System.out.println(list.get(0));
//		System.out.println(list.size()); // 7
//		
//		// �ݺ������� ���
//		System.out.println("�ݺ������� ���");
//		for(int i =0; i< list.size(); i++)
//			System.out.println(list.get(i));
		
		// Map
		HashMap<String, String> map = new HashMap<>();
		map.put("H", "HHH");
		map.put("s", "sss");
		map.put("1", "111");
		map.put("JH", "JH");
		map.put("9i", "9i");
		map.put("aaaaa", "aaaaa");
		
		Set<String> set = map.keySet();
		Iterator<String> iter = set.iterator();
		
		while(iter.hasNext()) {
			System.out.println(map.get(iter.next()));
		}
		
//		GeustInfo guest3 = new GeustInfo();
//		cList.add(1);
//		cList.add("1");
//		cList.add(guest3);
		
		ArrayList<GeustInfo> cList = new ArrayList<>();
		
		
		GeustInfo guest1 = new GeustInfo();
		GeustInfo guest2 = new GeustInfo();

		guest1.setAddr("��õ");
		guest1.setAge(33);
		guest1.setBloodType("A");
		guest1.setName("�輺ȣ");
		
		guest2.setAddr("��õ");
		guest2.setAge(22);
		guest2.setBloodType("A");
		guest2.setName("�̽���");
		
		cList.add(guest1);
		cList.add(guest2);
		
		System.out.println(cList.size());
		
		
		String search = "�輺ȣ";
		
		// ArrayList �� �˻�
		for(int i = 0; i<cList.size(); i++) {
			GeustInfo g = cList.get(i);
			String name = g.getName();
			if(name == search) {
				System.out.println("ArrayList");
				System.out.println(g.getAge());
			}
		}
		
		// HashMap���� �˻�
		HashMap<String, GeustInfo> hMap1 = new HashMap<>();
		hMap1.put(guest1.getName(), guest1);
		hMap1.put(guest2.getName(), guest2);
		
		HashMap<String, GeustInfo> hMap2 = new HashMap<>();
		hMap2.put(guest1.getName(), guest1);
		hMap2.put(guest2.getName(), guest2);
		
		HashMap<String, GeustInfo> hMap3 = new HashMap<>();
		hMap3.put(guest1.getName(), guest1);
		hMap3.put(guest2.getName(), guest2);
		
		HashMap<String, GeustInfo> hMap4 = new HashMap<>();
		hMap4.put(guest1.getName(), guest1);
		hMap4.put(guest2.getName(), guest2);
		
		System.out.println("Map");
		
		GeustInfo gi =  hMap1.get(search);
		int age = hMap1.get(search).getAge();
		
		hMap1.get(search).getAge();
		
		HashMap<Integer, HashMap<String, GeustInfo>> m1 = new HashMap<>();
		HashMap<Integer, ArrayList<GeustInfo>> m2 = new HashMap<>();
		m1.put(100, hMap1);
		m1.put(200, hMap2);
		m1.put(300, hMap3);
		m1.put(400, hMap4);
		
		ArrayList<HashMap<Integer, HashMap<String, GeustInfo>>> aaaList = new ArrayList<>();
		
		ArrayList<Object> objList = new ArrayList<>();
		objList.add(m1);
		objList.add(m2);
		objList.add(search);
		objList.add(age);
		objList.add(gi);
		
		System.out.println(m1);
		
		m2.put(400, cList);
		
		
		
		
	}
}

