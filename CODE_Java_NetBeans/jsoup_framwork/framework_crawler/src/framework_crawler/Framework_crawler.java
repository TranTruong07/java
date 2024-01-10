/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framework_crawler;

import java.io.IOException;
import java.util.ArrayList;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

/**
 *
 * @author Admin
 */
public class Framework_crawler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String url = "https://www.freepik.com/";
        crawl(1, url, new ArrayList());
    }

    private static void crawl(int i, String url, ArrayList arrayList) {
        if (i <= 5) {
            Document doc = request(url, arrayList);
            if (doc != null) {
                for (Element paragraph : doc.select("p")) {
                    String paragraphContent = paragraph.text(); // Lấy nội dung bên trong thẻ <p>
                    System.out.println("Paragraph: " + paragraphContent);
                }
                for (Element link : doc.select("a[href]")) {
                    String element = link.absUrl("href");
                    if (!arrayList.contains(element)) {
                        crawl(i++, element, arrayList);
                    }
                }
            }
        }
    }

    private static Document request(String url, ArrayList arrayList) {
        try {
            Connection con = Jsoup.connect(url);
            Document doc = con.get();
            if (con.response().statusCode() == 200) {
                System.out.println("Link:" + url);
                System.out.println("Title:" + url);
                arrayList.add(url);
                return doc;
            }
        } catch (Exception e) {
        }
        return null;
    }

}
