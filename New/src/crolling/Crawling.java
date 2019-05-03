package crolling;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Crawling {
	public static void main(String[] args) throws IOException {
		String url = "https://weather.naver.com/rgn/cityWetrMain.nhn";

        Document doc = Jsoup.connect(url).get();
        Elements elements = doc.getElementsByTag("tbody");
        Element element = elements.get(1);
        
        // #1
//        elements = element.getElementsByTag("tr");
//        String str = elements.get(0).getElementsByTag("td").get(0).getElementsByTag("ul").get(0).getElementsByTag("li").get(0).text();
//        
//        System.out.println(str);
        
//         #2
//        elements = element.getElementsByAttributeValue("class", "nm");
//        System.out.println(elements.get(0).text());
//        System.out.println(elements);
        
       
       //#3
//       Elements trElem = element.getElementsByTag("tr");
//        for(int i=0; i < trElem.size(); i++) {
//	        Element element1 = trElem.get(i).getElementsByTag("th").get(0).getElementsByTag("a").get(0);
//	//        System.out.println(element1);
//	        
//	        String seoul = element1.text();
//	        System.out.println(seoul);
//	        
//	        elements = element.getElementsByAttributeValue("class", "nm");
//	        String moring = elements.get(0).text();
//	        System.out.println(moring);
//	        
//	        String temp = element.getElementsByTag("tr").get(0).getElementsByTag("td").get(0).getElementsByTag("ul").get(0).getElementsByTag("li").get(1).text();
//	        System.out.println(temp);
//	        
//	        elements = element.getElementsByAttributeValue("class", "nm");
//	        String lunch = elements.get(1).text();
//	        System.out.println(lunch);
//	        
//	        String temp2 = element.getElementsByTag("tr").get(0).getElementsByTag("td").get(1).getElementsByTag("ul").get(0).getElementsByTag("li").get(1).getElementsByTag("span").text();
//	        System.out.println(temp2);
//	        System.out.println();	        
//        }        
        elements = elements.get(1).getElementsByAttributeValue("class", "temp");
//        System.out.println(elements);
        for (int i = 0; i < elements.size(); i++) {
			if(i%2 == 0) {
				System.out.println("오전 : " + elements.get(i).text());
			} else {
				System.out.println("오후 : " + elements.get(i).text());
			}
		}
	}
}
